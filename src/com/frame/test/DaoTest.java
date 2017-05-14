package com.frame.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.frame.bean.User;
import com.frame.dao.mapper.UserMapper;


public class DaoTest{
  
  public static void main(String[] args){
    ApplicationContext c = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml","classpath:spring-transaction.xml");
    
    UserMapper j = (UserMapper)c.getBean("userMapper");
    User job = j.selectByPrimaryKey("1");
    System.out.println(job);
  }
  
}
