package com.frame.dao.mapper;

import java.util.List;
import java.util.Map;
import com.frame.dao.model.UserEntity;

public interface UserDao {
    int deleteByPrimaryKey(String id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);
    
    List<UserEntity> selectByParams(Map<String,Object> params);
    
    int selectCountByParams(Map<String,Object> params);
}