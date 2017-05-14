package com.photo.dao.mapper;

import com.photo.bean.ShopInfo;

public interface ShopInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(ShopInfo record);

    int insertSelective(ShopInfo record);

    ShopInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ShopInfo record);

    int updateByPrimaryKeyWithBLOBs(ShopInfo record);

    int updateByPrimaryKey(ShopInfo record);
}