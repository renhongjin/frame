package com.frame.web.common;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.frame.service.IUserService;
import com.frame.web.domain.UserModel;

@Controller
public class IndexController {
  
  @Resource
  private IUserService userService;
    /**
     * 
     * @Title:	test 
     * @Description:实例
     */
    @RequestMapping("/index")
    @ResponseBody
    public UserModel index(HttpServletRequest request){
      String userId = "1";
      return userService.getUserById(userId);
    }

}
