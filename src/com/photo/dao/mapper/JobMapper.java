package com.photo.dao.mapper;

import com.photo.bean.Job;

public interface JobMapper {
    int deleteByPrimaryKey(String cId);

    int insert(Job record);

    int insertSelective(Job record);

    Job selectByPrimaryKey(String cId);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);
}