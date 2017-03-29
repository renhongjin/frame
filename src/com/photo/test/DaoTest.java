package com.photo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.photo.bean.Job;
import com.photo.dao.mapper.JobMapper;

public class DaoTest{
  
  public static void main(String[] args){
    ApplicationContext c = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml","classpath:spring-transaction.xml");
    JobMapper j = (JobMapper)c.getBean("jobMapper");
    Job job = j.selectByPrimaryKey("56568b2c9f09ec0703c1e303");
    System.out.println(job);
  }
  
}
