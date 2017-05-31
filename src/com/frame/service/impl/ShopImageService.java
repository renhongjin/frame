package com.frame.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.frame.bean.constant.ImageType;
import com.frame.bean.constant.LogicDelete;
import com.frame.dao.mapper.ShopImgsDao;
import com.frame.dao.model.ShopImgsEntity;
import com.frame.service.IShopImageService;
import com.frame.utils.UUIDUtils;
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

  @Override
  public int addCommentImgs(List<String> imgUrls,String commentId){
    if(imgUrls == null || imgUrls.size() == 0 || commentId == null){
      throw new RuntimeException("新增评论参数异常");
    }
    List<ShopImgsEntity> shopImgsEntitys = new ArrayList<ShopImgsEntity>();
    for(int i=0 ;i < imgUrls.size(); i++){
      String url = imgUrls.get(i);
      ShopImgsEntity shopImgsEntity = new ShopImgsEntity();
      shopImgsEntity.setCommentId(commentId);
      shopImgsEntity.setCreateTime(new Date());
      shopImgsEntity.setId(UUIDUtils.nextUUID());
      shopImgsEntity.setImgType(ImageType.COMMENT);
      shopImgsEntity.setLogicDelete(LogicDelete.FLAG_NOT_DELETE);
      shopImgsEntity.setSort(i+1);
      shopImgsEntity.setUrl(url);
      shopImgsEntitys.add(shopImgsEntity);
    }
    return shopImgsDao.batchInsert(shopImgsEntitys);
  }

  @Override
  public int addShopInfoImgs(List<String> imgUrls,String shopInfoId){
    if(imgUrls == null || imgUrls.size() == 0 || shopInfoId == null){
      throw new RuntimeException("新增店铺详情图片参数异常");
    }
    List<ShopImgsEntity> shopImgsEntitys = new ArrayList<ShopImgsEntity>();
    for(int i=0 ;i < imgUrls.size(); i++){
      String url = imgUrls.get(i);
      ShopImgsEntity shopImgsEntity = new ShopImgsEntity();
      shopImgsEntity.setShopInfoId(shopInfoId);
      shopImgsEntity.setCreateTime(new Date());
      shopImgsEntity.setId(UUIDUtils.nextUUID());
      shopImgsEntity.setImgType(ImageType.SHOP_BANNER);
      shopImgsEntity.setLogicDelete(LogicDelete.FLAG_NOT_DELETE);
      shopImgsEntity.setSort(i+1);
      shopImgsEntity.setUrl(url);
      shopImgsEntitys.add(shopImgsEntity);
    }
    return shopImgsDao.batchInsert(shopImgsEntitys);
  }
 }
