package com.photo.service;

import com.photo.web.domain.shop.ShopModel;

public interface IShopService{
  
  ShopModel getShopById(String shopId);
}
