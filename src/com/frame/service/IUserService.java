package com.frame.service;

import java.util.List;
import java.util.Map;
import com.frame.bean.User;

/**
 * 用户操作接口
 * @author lenovo
 *
 */
public interface IUserService{
  
  /**
   * 通过用户id获取用户，不存在则返回null
   * @param id userId
   * @return
   */
  User getUserById(String id);
  
  /**
   * 通过微信openid获取用户，不存在则返回null
   * @param openId 微信openid
   * @return
   */
  User getUserByOpenId(String openId);
 
  /**
   * 新增用户
   * @param user
   * @return 用户id
   */
  String addUser(User user);
  
  /**
   * 批量查询用户
   * @param params
   * @return
   */
  List<User> selectByParams(Map<String,Object> params); 
}
