package com.frame.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.frame.bean.Comment;
import com.frame.bean.Page;
import com.frame.bean.User;
import com.frame.bean.constant.CommentStatusType;
import com.frame.bean.constant.LogicDelete;
import com.frame.dao.mapper.CommentDao;
import com.frame.dao.mapper.CommentStatusDao;
import com.frame.dao.model.CommentEntity;
import com.frame.dao.model.CommentStatusEntity;
import com.frame.service.ICommentService;
import com.frame.service.IShopImageService;
import com.frame.service.IUserService;
import com.frame.utils.UUIDUtils;
@Service
public class CommentService implements ICommentService{

  
  @Autowired
  private CommentDao commentDao;
  
  @Autowired
  private CommentStatusDao commentStatusDao;
  
  @Autowired
  private IShopImageService shopImageService; 
  
  @Autowired
  private IUserService userService;
  
  @Override
  public List<Comment> getCommentList(String shopInfoId,Page page){
    Map<String,Object> params = new HashMap<String,Object>();
    params.put("shopInfoId",shopInfoId);
    if(page != null && page.getPageIndex() != null && page.getPageNum() != null){
      //处理分页参数
      params.put("pageIndex",page.getPageIndex());
      params.put("pageNum",page.getPageNum());
    }
    
    List<CommentEntity> commentEntitys = commentDao.selectByParams(params);
    List<Comment> commentList = new ArrayList<Comment>();
    
    if(commentEntitys != null && commentEntitys.size() > 0){
      for(CommentEntity commentEntity:commentEntitys){
        String commentId = commentEntity.getId();
        Comment comment = new Comment();
        BeanUtils.copyProperties(commentEntity,comment);
        //获取评论图片
        List<String> imgs = shopImageService.getCommentImgs(commentId);
        comment.setImgs(imgs);
        
        //获取评论的用户头像和昵称
        String userId = commentEntity.getUserId();
        User user = userService.getUserById(userId);
        comment.setHeadUrl(user.getHeadUrl());
        comment.setNickName(user.getNickName());
        
        //获取该条评论的点赞次数
        Map<String,Object> commentStatusParams = new HashMap<String,Object>();
        commentStatusParams.put("commentId",commentId);
        commentStatusParams.put("status",CommentStatusType.GOOD);
        int goodNum = commentStatusDao.selectCountByParams(commentStatusParams);
        comment.setGoodNum(goodNum);
        
        //获取该条评论的反对次数
        commentStatusParams.put("status",CommentStatusType.BAD);
        int badNum = commentStatusDao.selectCountByParams(commentStatusParams);
        comment.setBadNum(badNum);
        
        commentList.add(comment);
      }
    }else{
      return null;
    }
    return commentList;
  }

  @Override
  public int getCommentCountByShopInfoId(String shopInfoId){
    Map<String,Object> params = new HashMap<String,Object>();
    params.put("shopInfoId",shopInfoId);
    return commentDao.selectCountByParams(params);
  }

  @Override
  public List<CommentStatusEntity> getCommentStatus(String shopInfoId,String openId){
    if(shopInfoId == null || openId == null){
      return null;
    }
    Map<String,Object> params = new HashMap<String,Object>();
    params.put("openId",openId);
    params.put("shopInfoId",shopInfoId);
    return commentStatusDao.selectByParams(params);
  }

  @Override
  public boolean updateCommentStatus(String openId,String commentId,Integer status){
    Map<String,Object> params = new HashMap<String,Object>();
    params.put("openId",openId);
    params.put("commentId",commentId);
    List<CommentStatusEntity> commentStatus = commentStatusDao.selectByParams(params);
    if(commentStatus!=null&&commentStatus.size()==1){
      String commentStatusId = commentStatus.get(0).getId();
      CommentStatusEntity commentStatusEntity = new CommentStatusEntity();
      commentStatusEntity.setId(commentStatusId);
      commentStatusEntity.setStatus(status);
      int num = commentStatusDao.updateByPrimaryKeySelective(commentStatusEntity);
      if(num == 1){
        return true;
      }
    }else if(commentStatus.size() == 0){
      CommentEntity commentEntity = commentDao.selectByPrimaryKey(commentId);
      if(commentEntity != null){
        CommentStatusEntity record = new CommentStatusEntity();
        record.setCommentId(commentId);
        record.setCreateTime(new Date());
        record.setId(UUIDUtils.nextUUID());
        record.setOpenId(openId);
        record.setStatus(status);
        record.setShopInfoId(commentEntity.getShopInfoId());
        commentStatusDao.insert(record);
      }
    }
    return false;
  }

  @Override
  public boolean addComment(Comment comment){
    if(comment == null){
      return false;
    }
    CommentEntity commentEntity = new CommentEntity();
    String commentId = UUIDUtils.nextUUID();
    commentEntity.setId(commentId);
    commentEntity.setCommentTime(new Date());
    commentEntity.setLogicDelete(LogicDelete.FLAG_NOT_DELETE);
    commentEntity.setContent(comment.getContent());
    commentEntity.setShopId(comment.getShopId());
    commentEntity.setShopInfoId(comment.getShopInfoId());
    commentEntity.setUserId(comment.getUserId());
    int num = commentDao.insert(commentEntity);
    
    //评论的图片写入
    List<String> commentImgUrls = comment.getImgs();
    shopImageService.addCommentImgs(commentImgUrls,commentId);
    return 1 == num ? true : false;
  }
 }
