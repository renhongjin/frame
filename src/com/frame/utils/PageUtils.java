package com.frame.utils;

import java.util.Map;
import com.frame.bean.Page;

/**
 * 分页工具类
 * @author lenovo
 *
 */
public class PageUtils{
  
  /**
   * 通过处理查询参数中的第几页和页面大小，在查询参数中新增数据库中的起始位置与返回结果大小
   * @param params
   * @return
   */
  public static Map<String,Object> getPageIndexAndPageNum(Map<String,Object> params){
    Integer currentPage = (Integer)params.get("page");//第几页
    Integer pageNum = (Integer)params.get("pageNum");//每页大小
    Page page = null;
    if(currentPage == null || pageNum == null){
      params.put("page",1);//默认第一页
      page = new Page();
    }else{
      page = new Page(currentPage,pageNum);
    }
    params.put("pageIndex",page.getPageIndex());
    params.put("pageNum",page.getPageNum());
    return params;
  }
}
