package com.frame.utils;

import java.util.UUID;

public class UUIDUtils{
  
  public static String nextUUID(){
    return UUID.randomUUID().toString().replace("-","");
  }
}
