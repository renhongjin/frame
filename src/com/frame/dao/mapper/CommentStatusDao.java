package com.frame.dao.mapper;

import java.util.List;
import java.util.Map;
import com.frame.dao.model.CommentStatusEntity;

public interface CommentStatusDao{
  int deleteByPrimaryKey(String id);

  int insert(CommentStatusEntity record);

  int insertSelective(CommentStatusEntity record);

  CommentStatusEntity selectByPrimaryKey(String id);

  int updateByPrimaryKeySelective(CommentStatusEntity record);

  int updateByPrimaryKey(CommentStatusEntity record);

  List<CommentStatusEntity> selectByParams(Map<String,Object> params);

  int selectCountByParams(Map<String,Object> params);
}