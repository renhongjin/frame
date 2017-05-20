package com.frame.bean;

import java.io.Serializable;

/**
 * 分页参数
 * @author lenovo
 *
 */
public class Page implements Serializable{

  /**
   * 
   */
  private static final long serialVersionUID = 3982295789500056445L;
  /**
   * 第几页默认第一页
   */
  private Integer pageIndex = 1;
  /**
   * 每页大小默认15条数据
   */
  private Integer pageNum = 15;
  
  public Page(){
    super();
  }
  public Page(Integer pageIndex,Integer pageNum){
    super();
    this.pageIndex = pageIndex;
    this.pageNum = pageNum;
  }
  public Integer getPageIndex(){
    return pageIndex;
  }
  public void setPageIndex(Integer pageIndex){
    this.pageIndex = pageIndex;
  }
  public Integer getPageNum(){
    return pageNum;
  }
  public void setPageNum(Integer pageNum){
    this.pageNum = pageNum;
  }
}
