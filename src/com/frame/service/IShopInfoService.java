package com.frame.service;

import com.frame.bean.ShopInfo;
import com.frame.dao.model.ShopInfoEntity;

/**
 * 店铺详细信息
 * @author lenovo
 *
 */
public interface IShopInfoService{
  /**
   * 根据主键id获取店铺详细信息其中包含banner图片信息，评论列表所有信息
   * @param id
   * @return
   */
  ShopInfo getShopInfoById(String id);
  
  /**
   * 根据店铺id获取店铺详细信息其中包含banner图片信息，评论列表所有信息
   * @param shopId
   * @return
   */
  ShopInfo getShopInfoByShopId(String shopId);
  
  /**
   * 根据店铺id获取店铺详细信息中的基本信息
   * @param ShopInfoId
   * @return
   */
  ShopInfoEntity getShopInfoEntityByShopId(String ShopId);
}
