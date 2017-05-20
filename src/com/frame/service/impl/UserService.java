package com.frame.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.frame.bean.User;
import com.frame.dao.mapper.UserDao;
import com.frame.dao.model.UserEntity;
import com.frame.service.IUserService;
@Service
public class UserService implements IUserService{

  @Autowired
  private UserDao userDao;
  
  @Override
  public User getUserById(String id){
    UserEntity userEntity = userDao.selectByPrimaryKey(id);
    User user = new User();
    if(userEntity != null){
      BeanUtils.copyProperties(userEntity,user);
    }else{
      return null;
    }
    return user;
  }

  @Override
  public User getUserByOpenId(String openId){
    Map<String,Object> params = new HashMap<String,Object>();
    params.put("openId",openId);
    List<UserEntity> userEntitys = userDao.selectByParams(params);
    User user = new User();
    if(userEntitys != null && userEntitys.size() ==1){
      BeanUtils.copyProperties(userEntitys.get(0),user); 
    }else{
      return null;
    }
    return user;
  }

  @Override
  public int addUser(User user){
    UserEntity userEntity = new UserEntity();
    BeanUtils.copyProperties(user,userEntity); 
    return userDao.insert(userEntity);
  }

  @Override
  public List<User> selectByParams(Map<String,Object> params){
    List<UserEntity> userEntitys = userDao.selectByParams(params);
    List<User> users = new ArrayList<User>();
    if(userEntitys!= null && userEntitys.size() > 0){
      for(UserEntity userEntity:userEntitys){
        User user = new User();
        BeanUtils.copyProperties(userEntity,user);
        users.add(user);
      }
    }else{
      return null;
    }
    return users;
  }
 }
