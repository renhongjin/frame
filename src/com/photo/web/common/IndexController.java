package com.photo.web.common;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.photo.utils.HttpUtils;
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
        String uri = "http://ip.taobao.com/service/getIpInfo.php?ip="+clientIp;
        String jsonStr = HttpUtils.get(uri);
        JSONObject data = JSON.parseObject(jsonStr);
        Map<String,String> area = new HashMap<String,String>();
        if(data.getIntValue("code") != 1){
            area.put("country", data.getJSONObject("data").getString("country"));
            area.put("region", data.getJSONObject("data").getString("region"));
            area.put("city", data.getJSONObject("data").getString("city"));
            area.put("isp", data.getJSONObject("data").getString("isp"));
        }else{
            area.put("country", "not exist internet.");
        }
        mv.addObject("area", area);
        return mv;
    }

}
