package com.frame.service;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;
import com.frame.bean.Comment;
import com.frame.bean.Page;
import com.frame.dao.model.CommentStatusEntity;

/**
 * 评论列表
 * @author lenovo
 *
 */
public interface ICommentService{
  
  /**
   * 根据店铺详情id，分页查询获取评论列表
   * @param shopInfoId 店铺详情id
   * @param page 分页参数，null的时候不分页
   * @return
   */
  List<Comment> getCommentList(String shopInfoId,Page page);
  /**
   * 根据评论详细信息id获取评论的总条数
   * @param ShopInfoId
   * @return
   */
  int getCommentCountByShopInfoId(String shopInfoId);
  
  /**
   * 根据店铺id与用户openId查询评论状态
   * @param shopInfoId
   * @param openId
   * @return
   */
  List<CommentStatusEntity> getCommentStatus(String shopInfoId,String openId);
  
  /**
   * 修改评论的状态，点赞、反对、取消
   * @param openId 用户openId
   * @param commentId 评论id
   * @param status 修改的状态
   * @return true:修改成功，false修改失败
   */
  boolean updateCommentStatus(String openId, String commentId, Integer status);
}
