package com.frame.service;
/**
 * 店铺查看
 * @author lenovo
 *
 */
public interface IShopSeeInfo{
  /**
   * 根据店铺id查询该店铺被用户(包含同一用户可以查看多次)查看多少次
   * @param ShopId
   * @return
   */
  int getShopSeeCount(String shopId);
}
