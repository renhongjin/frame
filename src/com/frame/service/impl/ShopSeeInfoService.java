package com.frame.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.frame.dao.mapper.SeeLogDao;
import com.frame.dao.model.SeeLogEntity;
import com.frame.service.IShopSeeInfoService;
import com.frame.utils.UUIDUtils;
/**
 * 店铺查询信息操作
 * @author lenovo
 *
 */
@Service
public class ShopSeeInfoService implements IShopSeeInfoService{
  
  private Logger log = Logger.getLogger(ShopSeeInfoService.class);
  
  @Autowired
  private SeeLogDao seeLogDao;
  
  @Override
  public int getShopSeeCount(String shopId){
    Map<String,Object> params = new HashMap<String,Object>();
    params.put("shopId",shopId);
    return seeLogDao.selectCountByParams(params);
  }

  @Override
  public int addSeeLog(String openId,String shopId,String shopInfoId){
    try{
      SeeLogEntity see = new SeeLogEntity();
      see.setId(UUIDUtils.nextUUID());
      see.setOpenId(openId);
      see.setSeeTime(new Date());
      see.setShopId(shopId);
      see.setShopInfoId(shopInfoId);
      seeLogDao.insert(see);
    }catch(Exception e){
      log.error("新增查看日志异常",e);
    }
    return 1;
  }
 }
