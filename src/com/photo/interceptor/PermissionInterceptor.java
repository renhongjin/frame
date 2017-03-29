package com.photo.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 权限拦截器
 * @author lenovo
 *
 */
public class PermissionInterceptor  implements HandlerInterceptor{

	private static Log log = LogFactory.getLog(PermissionInterceptor.class);
	/**
	 * 禁止访问的连接
	 */
	private List<String> excludedUrls;
	public List<String> getExcludedUrls() {
		return excludedUrls;
	}
	public void setExcludedUrls(List<String> excludedUrls) {
		this.excludedUrls = excludedUrls;
	}

	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception {
		for (String url : excludedUrls) {
			log.debug("排除的链接："+url);
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,HttpServletResponse response, Object handler,ModelAndView modelAndView) throws Exception {
		System.out.println("权限拦截器处理");
	}

	@Override
	public void afterCompletion(HttpServletRequest request,HttpServletResponse response, Object handler, Exception ex) throws Exception {
		System.out.println("权限拦截器末尾");
	}

}
