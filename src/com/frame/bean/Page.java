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
  private Integer pageIndex = 0;
  /**
   * 每页大小默认15条数据
   */
  private Integer pageNum = 15;
  
  public Page(){
    super();
  }
  /**
   * 查询第几页，默认每页15条数据
   * @param page
   */
  public Page(Integer page){
    super();
    if(page.intValue() <= 0 ){
      page = 1;
    }
    if(1 == page.intValue()){
      this.pageIndex = 0;
    }else{
      this.pageIndex = page.intValue() * this.pageNum;
    }
  }
  /**
   * 指定第几页和每页的大小
   * @param page
   * @param pageNum
   */
  public Page(Integer page,Integer pageNum){
    this.pageNum = pageNum;
    if(page.intValue() <= 0 ){
      page = 1;
    }
    if(1 == page.intValue()){
      this.pageIndex = 0;
    }else{
      this.pageIndex = page.intValue() * this.pageNum;
    }
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
