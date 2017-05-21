package com.frame.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.frame.bean.Comment;
import com.frame.bean.Page;
import com.frame.bean.ShopInfo;
import com.frame.dao.mapper.ShopInfoDao;
import com.frame.dao.model.ShopInfoEntity;
import com.frame.service.IShopInfoService;
@Service
public class ShopInfoService implements IShopInfoService{

  private Logger log = Logger.getLogger(ShopInfoService.class);
  
  @Autowired
  private ShopInfoDao shopInfoDao;
  
  @Autowired
  private ShopImageService shopImageService;
  
  @Autowired
  private CommentService commentService;
  
  @Override
  public ShopInfo getShopInfoById(String id){
    //获取店铺详细信息
    ShopInfoEntity shopInfoEntity = shopInfoDao.selectByPrimaryKey(id);
    return getShopInfoByEntity(shopInfoEntity);
  }

  @Override
  public ShopInfo getShopInfoByShopId(String shopId){
    Map<String,Object> params = new HashMap<String,Object>();
    params.put("shopId",shopId);
    List<ShopInfoEntity> shopInfoEntitys = shopInfoDao.selectByParams(params);
    if(shopInfoEntitys != null && shopInfoEntitys.size() == 1){
      return getShopInfoByEntity(shopInfoEntitys.get(0));
    }else{
      if(shopInfoEntitys == null || shopInfoEntitys.size() == 0){
        log.info("[getShopInfoByShopId]不存在店铺id:"+shopId+" 所对应的店铺介绍");
      }else{
        log.info("[getShopInfoByShopId]存在多个店铺id:"+shopId+" 所对应的店铺介绍");
      }
      return null;
    }
  }
  
  /**
   * 通过shopEntity返回ShopInfo，其中包含banner图片信息，评论列表所有信息
   * @param shopInfoEntity
   * @return
   */
  private ShopInfo getShopInfoByEntity(ShopInfoEntity shopInfoEntity){
    ShopInfo shopInfo = new ShopInfo();
    if(shopInfoEntity != null){
      BeanUtils.copyProperties(shopInfoEntity,shopInfo);
      //获取店铺banner图片
      List<String> bannerImgs = shopImageService.getShopInfoBannerImgs(shopInfoEntity.getId());
      shopInfo.setImgs(bannerImgs);
      //获取分页评论列表
      Page page = new Page(1);//默认查询第一页前15条评论
      List<Comment> commentList = commentService.getCommentList(shopInfoEntity.getId(),page);
      shopInfo.setCommentList(commentList);
    }else{
      return  null;
    }
    return shopInfo;
  }

  @Override
  public ShopInfoEntity getShopInfoEntityByShopId(String shopId){
    Map<String,Object> params = new HashMap<String,Object>();
    params.put("shopId",shopId);
    List<ShopInfoEntity> shopInfoEntitys = shopInfoDao.selectByParams(params);
    if(shopInfoEntitys != null && shopInfoEntitys.size() == 1 ){
      return shopInfoEntitys.get(0);
    }else{
      if(shopInfoEntitys == null || shopInfoEntitys.size() == 0){
        log.info("[getShopEntity]不存在店铺id:"+shopId+" 所对应的店铺介绍");
      }else{
        log.info("[getShopEntity]存在多个店铺id:"+shopId+" 所对应的店铺介绍");
      }
      return null;
    }
  }
  
}
