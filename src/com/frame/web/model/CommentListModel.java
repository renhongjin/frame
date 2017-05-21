package com.frame.web.model;

import java.io.Serializable;
/**
 * 评论列表条件查询参数封装
 * @author lenovo
 *
 */
public class CommentListModel implements Serializable{

  /**
   * 
   */
  private static final long serialVersionUID = -784778957239164322L;
  /**
   * 地几页
   */
  private Integer page;
  /**
   * 加载多少条
   */
  private Integer pageNum;
  /**
   * 店铺详细信息id
   */
  private String shopInfoId;
  /**
   * 用户openId
   */
  private String openId;
  public Integer getPage(){
    return page;
  }
  public void setPage(Integer page){
    this.page = page;
  }
  public Integer getPageNum(){
    return pageNum;
  }
  public void setPageNum(Integer pageNum){
    this.pageNum = pageNum;
  }
  public String getShopInfoId(){
    return shopInfoId;
  }
  public void setShopInfoId(String shopInfoId){
    this.shopInfoId = shopInfoId;
  }
  public String getOpenId(){
    return openId;
  }
  public void setOpenId(String openId){
    this.openId = openId;
  }
}
