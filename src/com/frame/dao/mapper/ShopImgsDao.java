package com.frame.dao.mapper;

import java.util.List;
import java.util.Map;
import com.frame.dao.model.ShopImgsEntity;

public interface ShopImgsDao {
    int deleteByPrimaryKey(String id);

    int insert(ShopImgsEntity record);

    int insertSelective(ShopImgsEntity record);

    ShopImgsEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ShopImgsEntity record);

    int updateByPrimaryKey(ShopImgsEntity record);
    
    List<ShopImgsEntity> selectByParams(Map<String,Object> params);
    
    int selectCountByParams(Map<String,Object> params);
}