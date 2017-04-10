package com.photo.web.weixin;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/weixin")
public class WeiXinFramController {

    private static Log log = LogFactory.getLog(WeiXinFramController.class);
    
    @RequestMapping("accpetMsg")
    @ResponseBody
    public String accpetMsg(HttpServletRequest request){
        log.info(JSONObject.toJSONString(request.getAttributeNames()));
        log.info("------------------------");
        log.info(JSONObject.toJSONString(request.getParameterMap()));
        return "success";
    }
}
