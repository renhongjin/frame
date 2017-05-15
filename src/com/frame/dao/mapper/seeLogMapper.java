package com.frame.dao.mapper;

import com.frame.dao.model.seeLog;

public interface seeLogMapper {
    int deleteByPrimaryKey(String id);

    int insert(seeLog record);

    int insertSelective(seeLog record);

    seeLog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(seeLog record);

    int updateByPrimaryKey(seeLog record);
}