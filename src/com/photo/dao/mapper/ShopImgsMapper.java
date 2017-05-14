package com.photo.dao.mapper;

import com.photo.bean.ShopImgs;

public interface ShopImgsMapper {
    int deleteByPrimaryKey(String id);

    int insert(ShopImgs record);

    int insertSelective(ShopImgs record);

    ShopImgs selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ShopImgs record);

    int updateByPrimaryKey(ShopImgs record);
}