package com.frame.dao.mapper;

import java.util.List;
import java.util.Map;
import com.frame.dao.model.ShopInfoEntity;

public interface ShopInfoDao {
    int deleteByPrimaryKey(String id);

    int insert(ShopInfoEntity record);

    int insertSelective(ShopInfoEntity record);

    ShopInfoEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ShopInfoEntity record);

    int updateByPrimaryKey(ShopInfoEntity record);
    
    List<ShopInfoEntity> selectByParams(Map<String,Object> params);
    
    int selectCountByParams(Map<String,Object> params);
}