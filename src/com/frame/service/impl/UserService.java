package com.frame.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.frame.bean.User;
import com.frame.dao.mapper.UserMapper;
import com.frame.service.IUserService;
import com.frame.web.domain.UserModel;

@Service
public class UserService implements IUserService{
  
  @Autowired
  private UserMapper userMapper;
  
  @Override
  public UserModel getUserById(String userId){
    User user = userMapper.selectByPrimaryKey(userId);
    UserModel userModel = new UserModel();
    BeanUtils.copyProperties(user,userModel);
    return userModel;
  }
  
}
