package com.photo.dao.mapper;

import com.photo.bean.CommentStatus;

public interface CommentStatusMapper {
    int deleteByPrimaryKey(String id);

    int insert(CommentStatus record);

    int insertSelective(CommentStatus record);

    CommentStatus selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CommentStatus record);

    int updateByPrimaryKey(CommentStatus record);
}