package com.frame.dao.mapper;

import java.util.List;
import java.util.Map;
import com.frame.dao.model.ShopEntity;

public interface ShopDao {
    int deleteByPrimaryKey(String id);

    int insert(ShopEntity record);

    int insertSelective(ShopEntity record);

    ShopEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ShopEntity record);

    int updateByPrimaryKey(ShopEntity record);
    
    List<ShopEntity> selectByParams(Map<String,Object> params);
    
    int selectCountByParams(Map<String,Object> params);
}