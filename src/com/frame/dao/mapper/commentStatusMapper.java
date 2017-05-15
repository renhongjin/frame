package com.frame.dao.mapper;

import com.frame.dao.model.commentStatus;

public interface commentStatusMapper {
    int deleteByPrimaryKey(String id);

    int insert(commentStatus record);

    int insertSelective(commentStatus record);

    commentStatus selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(commentStatus record);

    int updateByPrimaryKey(commentStatus record);
}