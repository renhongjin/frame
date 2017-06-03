package com.frame.web.user;

import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSON;
import com.frame.bean.User;
import com.frame.bean.common.JsonResult;
import com.frame.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController{

  private Logger log = Logger.getLogger(UserController.class);
  
  @Autowired
  private IUserService userService;
  
  @RequestMapping("/add.html")
  @ResponseBody
  public JsonResult<Map<String,Object>> addUser(@RequestBody User user){
    log.info("新增用户信息："+JSON.toJSONString(user));
    JsonResult<Map<String,Object>> result = new JsonResult<Map<String,Object>>();
    Map<String,Object> data = new HashMap<String,Object>();
    try{
      User oldUser = userService.getUserByOpenId(user.getOpenId());
      if(oldUser == null){
        String userId = userService.addUser(user);
        data.put("userId",userId);
        result.setData(data);
        result.setMsg("success");
        result.setStatus(0);
      }else{
        data.put("userId",oldUser.getId());
        result.setData(data);
        result.setMsg("用户已经存在");
        result.setStatus(0);
      }
      
    }catch(Exception e){
      log.error("修新增用户异常",e);
      result.setStatus(1);
      result.setMsg("系统异常");
    }
    return result;
  }
}
