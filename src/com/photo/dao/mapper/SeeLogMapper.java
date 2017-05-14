package com.photo.dao.mapper;

import com.photo.bean.SeeLog;

public interface SeeLogMapper {
    int deleteByPrimaryKey(String id);

    int insert(SeeLog record);

    int insertSelective(SeeLog record);

    SeeLog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SeeLog record);

    int updateByPrimaryKey(SeeLog record);
}