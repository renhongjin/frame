package com.frame.dao.mapper;

import java.util.List;
import java.util.Map;
import com.frame.dao.model.SeeLogEntity;

public interface SeeLogDao{
  int deleteByPrimaryKey(String id);

  int insert(SeeLogEntity record);

  int insertSelective(SeeLogEntity record);

  SeeLogEntity selectByPrimaryKey(String id);

  int updateByPrimaryKeySelective(SeeLogEntity record);

  int updateByPrimaryKey(SeeLogEntity record);

  List<SeeLogEntity> selectByParams(Map<String,Object> params);

  int selectCountByParams(Map<String,Object> params);
}