package com.frame.interceptor;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {
	private static Log log = LogFactory.getLog(MyInterceptor.class);
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception {
		printRequestParam2Log(request);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,HttpServletResponse response, Object handler,	ModelAndView modelAndView) throws Exception {
		System.out.println(modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request,HttpServletResponse response, Object handler, Exception ex) throws Exception {
		System.out.println("afterCompletion");
	}
	/**
	 * 记录访问日志和访问参数
	 * @param request
	 */
	public void printRequestParam2Log(HttpServletRequest request){
		Enumeration<String> reqNames = request.getParameterNames();
		StringBuffer accesslog = new StringBuffer("请求地址:"+request.getRequestURI()+"\n请求参数：");
		while(reqNames.hasMoreElements()){
			String name = reqNames.nextElement();
			String value = request.getParameter(name);
			accesslog.append(name+":"+ value+"\n");
		}
		log.debug(accesslog);
	}
}