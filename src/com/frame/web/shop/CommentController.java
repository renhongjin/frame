package com.frame.web.shop;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSON;
import com.frame.bean.Comment;
import com.frame.bean.CommentStatusType;
import com.frame.bean.Page;
import com.frame.bean.common.JsonResult;
import com.frame.dao.model.CommentStatusEntity;
import com.frame.service.impl.CommentService;
import com.frame.web.model.CommentListModel;
/**
 * 评论列表
 * @author lenovo
 *
 */
/**
 * 评论列表
 * @author lenovo
 *
 */
@Controller
@RequestMapping("/comment")
public class CommentController{
  private Logger log = Logger.getLogger(CommentController.class);
  
  @Autowired
  private CommentService commentService;
  
  /**
   * 分页获取评论列表
   * @return
   */
  @RequestMapping("/commentlist.html")
  public JsonResult<List<Comment>> getCommentList(@RequestBody CommentListModel commentListModel){
    log.info("获取评论列表查询参数："+JSON.toJSONString(commentListModel));
    JsonResult<List<Comment>> result = new JsonResult<List<Comment>>();
    try{
      Integer page = commentListModel.getPage();
      Integer pageNum = commentListModel.getPageNum();
      Page pager = null;
      if(page != null && pageNum != null){
        pager = new Page(page,pageNum);
      }else{
        page = 1;
        pager = new Page(page);
      }
      String shopInfoId = commentListModel.getShopInfoId();
      List<Comment> comments = commentService.getCommentList(shopInfoId,pager);
      int count = commentService.getCommentCountByShopInfoId(shopInfoId);
      //获取该用户是否在该店铺下的评论中有点赞或者反对操作,并设置到对应的评论实体中
      List<CommentStatusEntity> commentStatus = commentService.getCommentStatus(shopInfoId,commentListModel.getOpenId());
      if(commentStatus != null && commentStatus.size() > 0){
        for(CommentStatusEntity commentStatusEntity:commentStatus){
          int status = commentStatusEntity.getStatus();
          String commentId = commentStatusEntity.getCommentId();
          if(CommentStatusType.NOT_GOOD_ANDNOT_BAD.intValue() != status){
            for(Comment comment:comments){
              if(commentId.equals(comment.getId())){
                comment.setStatus(status);
                break;
              }
            }
          }
        }
      }
      result.setCurrrentPage(page);
      result.setData(comments);
      result.setMsg("success");
      result.setPageCount(count);
      result.setPageNum(pager.getPageNum());
      result.setStatus(0);
    }catch(Exception e){
      log.error("查询评论列表异常",e);
      result.setStatus(1);
      result.setMsg("系统异常");
    }
    return result;
  }
  /**
   * 修改评论的状态，点赞、反对、取消
   * @return
   */
  @RequestMapping("/updateCommentStatus.html")
  @ResponseBody
  public JsonResult<Boolean> updateCommentStatus(@RequestParam String openId,
                                                 @RequestParam String commentId,
                                                 @RequestParam Integer status 
                                             ){
    log.info("修改评论状态入参：openid="+openId+",commentId="+commentId+",status="+status);
    JsonResult<Boolean> result = new JsonResult<Boolean>();
    try{
      Boolean flag = Boolean.TRUE;
      if(status == null || status != 0 || status != 1 || status != -1){
        flag = Boolean.FALSE;
      }
      flag = commentService.updateCommentStatus(openId,commentId,status);
      result.setData(flag);
      result.setMsg("success");
      result.setStatus(0);
    }catch(Exception e){
      log.error("修改评论的状态异常",e);
      result.setStatus(1);
      result.setMsg("系统异常");
    }
    return result;
  }
}
