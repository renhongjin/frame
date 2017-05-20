package com.frame.service;

import java.util.List;
import java.util.Map;
import com.frame.bean.Page;
import com.frame.bean.Shop;

/**
 * 店铺服务类
 * @author lenovo
 *
 */
public interface IShopService{
  /**
   * 根据店铺id获取店铺的全部信息
   * @param shopId
   * @return
   */
  Shop getShopAllInfoById(String shopId);
  
  /**
   * 条件分页查询店铺列表
   * @param params ： 店铺条件
   * @param page
   * @return
   */
  List<Shop> getShopList(Map<String,Object> params,Page page);
}
