package com.frame.service.impl;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.frame.dao.mapper.SeeLogDao;
import com.frame.service.IShopSeeInfo;
/**
 * 店铺查询信息操作
 * @author lenovo
 *
 */
@Service
public class ShopSeeInfoService implements IShopSeeInfo{
  @Autowired
  private SeeLogDao seeLogDao;
  
  @Override
  public int getShopSeeCount(String shopId){
    Map<String,Object> params = new HashMap<String,Object>();
    params.put("shopId",shopId);
    return seeLogDao.selectCountByParams(params);
  }
 }
