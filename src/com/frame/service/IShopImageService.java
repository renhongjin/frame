package com.frame.service;

import java.util.List;

public interface IShopImageService{
  /**
   * 根据店铺详细信息id获取店铺banner图片列表
   * @param shopInfoId
   * @return
   */
  List<String> getShopInfoBannerImgs(String shopInfoId);
  
  /**
   * 根据评论id获取评论内容中的图片列表地址
   * @param commentId
   * @return
   */
  List<String> getCommentImgs(String commentId);
}
