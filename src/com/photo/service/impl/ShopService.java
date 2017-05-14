package com.photo.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.photo.bean.Shop;
import com.photo.dao.mapper.SeeLogMapper;
import com.photo.dao.mapper.ShopInfoMapper;
import com.photo.dao.mapper.ShopMapper;
import com.photo.service.IShopService;
import com.photo.web.domain.shop.ShopModel;

@Service
public class ShopService implements IShopService{
  
  @Resource
  private ShopInfoMapper shopInfoMapper;
  
  @Resource
  private ShopMapper shopMapper;
  
  @Resource
  private SeeLogMapper seeLogMapper;

  @Override
  public ShopModel getShopById(String shopId){
    Shop shop = shopMapper.selectByPrimaryKey(shopId);
    
    return null;
  }
  
}
