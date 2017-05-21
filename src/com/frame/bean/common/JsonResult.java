package com.frame.bean.common;

import java.io.Serializable;
/**
 * 支持分页的返回结果封装
 * @author lenovo
 *
 * @param <T>
 */
public class JsonResult<T> implements Serializable{
  /**
   * 
   */
  private static final long serialVersionUID = 1255613789518691406L;
  /**
   * 返回数据
   */
  private T data;
  /**
   * 返回状态0：成功状态，1：系统异常状态，其它状态更具提示信息提示
   */
  private int status;
  /**
   * 返回提示信息
   */
  private String msg;
  /**
   * 当前页
   */
  private Integer currrentPage;
  /**
   * 总条数
   */
  private Integer pageCount;
  /**
   * 页面大小
   */
  private Integer pageNum;
  public T getData(){
    return data;
  }
  public void setData(T data){
    this.data = data;
  }
  public int getStatus(){
    return status;
  }
  public void setStatus(int status){
    this.status = status;
  }
  public String getMsg(){
    return msg;
  }
  public void setMsg(String msg){
    this.msg = msg;
  }
  public Integer getCurrrentPage(){
    return currrentPage;
  }
  public void setCurrrentPage(Integer currrentPage){
    this.currrentPage = currrentPage;
  }
  public Integer getPageCount(){
    return pageCount;
  }
  public void setPageCount(Integer pageCount){
    this.pageCount = pageCount;
  }
  public Integer getPageNum(){
    return pageNum;
  }
  public void setPageNum(Integer pageNum){
    this.pageNum = pageNum;
  }

  
  
}
