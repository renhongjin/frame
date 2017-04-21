package com.photo.web.common;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.photo.utils.NetworkUtil;

@Controller
public class IndexController {
    /**
     * 
     * @Title:	index 
     * @Description:返回首页
     */
    @RequestMapping("/index")
    public ModelAndView index(HttpServletRequest request){
        ModelAndView mv = new ModelAndView("index");
        String clientIp = NetworkUtil.getIpAddress(request);
        mv.addObject("clientIp", clientIp);
        return mv;
    }

}
