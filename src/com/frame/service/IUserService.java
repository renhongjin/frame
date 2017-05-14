package com.frame.service;

import com.frame.web.domain.UserModel;

public interface IUserService{
  
  UserModel getUserById(String userId);
}
