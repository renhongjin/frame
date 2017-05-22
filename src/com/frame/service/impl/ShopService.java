package com.frame.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.frame.bean.Shop;
import com.frame.bean.ShopInfo;
import com.frame.dao.mapper.ShopDao;
import com.frame.dao.model.ShopEntity;
import com.frame.dao.model.ShopInfoEntity;
import com.frame.service.ICommentService;
import com.frame.service.IShopInfoService;
import com.frame.service.IShopSeeInfoService;
import com.frame.service.IShopService;
@Service
public class ShopService implements IShopService{
  private Logger log = Logger.getLogger(ShopService.class);
  
  @Autowired
  private IShopInfoService shopInfoService;
  
  @Autowired
  private ShopDao shopDao;
  
  @Autowired
  private ICommentService commentService;
  @Autowired
  private IShopSeeInfoService shopSeeInfoService;
  
  @Override
  public Shop getShopAllInfoById(String shopId){
    //获取店铺基本信息
    ShopEntity shopEntity = shopDao.selectByPrimaryKey(shopId);
    Shop shop = new Shop();
    if(shopEntity != null){
      BeanUtils.copyProperties(shopEntity,shop);
      //获取店铺详细信息
      ShopInfo shopInfo = shopInfoService.getShopInfoByShopId(shopId);
      shop.setShopInfo(shopInfo);
    }else{
      log.info("未查询到店铺信息：shopId="+shopId);
      return null;
    }
    return shop;
  }

  @Override
  public List<Shop> getShopList(Map<String,Object> params){
    List<ShopEntity> shopEntitys = shopDao.selectByParams(params);
    List<Shop> shops = new ArrayList<Shop>();
    if(shopEntitys != null && shopEntitys.size() > 0){
      for(ShopEntity shopEntity:shopEntitys){
       Shop shop = new Shop();
       BeanUtils.copyProperties(shopEntity,shop);
       //获取距离
       String distance = getDistance();
       shop.setDistance(distance);
       //获取评论条数
       String shopId = shopEntity.getId();
       ShopInfoEntity shopInfoEntity = shopInfoService.getShopInfoEntityByShopId(shopId);
       int commentNum = 0;
       if(shopInfoEntity != null){
         commentNum = commentService.getCommentCountByShopInfoId(shopInfoEntity.getId());
       }
       shop.setCommentNum(commentNum);
       //获取查看次数
       int seeNum = shopSeeInfoService.getShopSeeCount(shopId);
       shop.setSeeNum(seeNum);
       shops.add(shop);
      }
    }else{
      return null;
    }
    return shops;
  }
  
  /**
   * 获取当前用户距离店铺的距离
   * @return
   */
  private String getDistance(){
    //TODO
    log.info("没有做活动距离逻辑");
    return "未知";
  }

  @Override
  public int getShopCount(Map<String,Object> params){
    return shopDao.selectCountByParams(params);
  }
 }
