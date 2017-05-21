package com.frame.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.frame.bean.ImageType;
import com.frame.dao.mapper.ShopImgsDao;
import com.frame.dao.model.ShopImgsEntity;
import com.frame.service.IShopImageService;
/**
 * 店铺图片接口
 * @author lenovo
 *
 */
@Service
public class ShopImageService implements IShopImageService{

  @Autowired
  private ShopImgsDao shopImgsDao;
  
  @Override
  public List<String> getShopInfoBannerImgs(String shopInfoId){
    Map<String,Object> params = new HashMap<String,Object>();
    params.put("imgType",ImageType.SHOP_BANNER);
    params.put("shopInfoId",shopInfoId);
    List<ShopImgsEntity> shopImgsEntitys = shopImgsDao.selectByParams(params);
    List<String> imgs = new ArrayList<String>();
    if(shopImgsEntitys != null && shopImgsEntitys.size() > 0){
      for(ShopImgsEntity shopImgsEntity:shopImgsEntitys){
        imgs.add(shopImgsEntity.getUrl());
      }
    }else{
      return null;
    }
    return imgs;
  }

  @Override
  public List<String> getCommentImgs(String commentId){
    Map<String,Object> params = new HashMap<String,Object>();
    params.put("imgType",ImageType.COMMENT);
    params.put("commentId",commentId);
    List<ShopImgsEntity> shopImgsEntitys = shopImgsDao.selectByParams(params);
    List<String> imgs = new ArrayList<String>();
    if(shopImgsEntitys != null && shopImgsEntitys.size() > 0){
      for(ShopImgsEntity shopImgsEntity:shopImgsEntitys){
        imgs.add(shopImgsEntity.getUrl());
      }
    }else{
      return null;
    }
    return imgs;
  }
 }
