package com.frame.service;

import java.util.List;
import com.frame.bean.Comment;
import com.frame.bean.Page;

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
  
}
