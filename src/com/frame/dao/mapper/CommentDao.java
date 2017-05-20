package com.frame.dao.mapper;

import java.util.List;
import java.util.Map;
import com.frame.dao.model.CommentEntity;

public interface CommentDao{
  int deleteByPrimaryKey(String id);

  int insert(CommentEntity record);

  int insertSelective(CommentEntity record);

  CommentEntity selectByPrimaryKey(String id);

  int updateByPrimaryKeySelective(CommentEntity record);

  int updateByPrimaryKey(CommentEntity record);

  List<CommentEntity> selectByParams(Map<String,Object> params);

  int selectCountByParams(Map<String,Object> params);
}