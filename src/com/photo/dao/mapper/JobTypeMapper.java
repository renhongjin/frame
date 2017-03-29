package com.photo.dao.mapper;

import com.photo.bean.JobType;

public interface JobTypeMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(JobType record);

    int insertSelective(JobType record);

    JobType selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(JobType record);

    int updateByPrimaryKey(JobType record);
}