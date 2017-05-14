package com.frame.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class HttpUtils {
    private static Log log = LogFactory.getLog(HttpUtils.class);
    
    public static String get(String url){
        // 根据地址获取请求
        HttpGet request = new HttpGet(url);//这里发送get请求
        // 获取当前客户端对象
        HttpClient httpClient = new DefaultHttpClient();    
        // 通过请求对象获取响应对象
        HttpResponse response;
        try {
            response = httpClient.execute(request);
            // 判断网络连接状态码是否正常(0--200都数正常)
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                return EntityUtils.toString(response.getEntity(),"utf-8");
            }
        } catch (Exception e) {
            log.error("向solr发送get请求异常"+url,e);
        }
        return null;
    }
}
