package com.frame.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 评论实体
 * @author lenovo
 *
 */
public class Comment implements Serializable{

  /**
   * 
   */
  private static final long serialVersionUID = 5418811238356855811L;
  /**
   * 用户点赞状态1：赞同，0反对，-1既不赞同也不反对
   */
  private Integer status = -1;
  /**
   * 该条评论点赞次数
   */
  private Integer goodNum;
  /**
   * 该条评论反对次数
   */
  private Integer badNum;
  /**
   * 该条评论的用户昵称
   */
  private String nickName;
  /**
   * 该条评论的用户头像地址
   */
  private String headUrl;
  /**
   * 该条评论的图片列表地址
   */
  private List<String> imgs;
  
  private String id;

  /**
   * 店铺id
   */
  private String shopId;

  /**
   * 店铺详细信息id
   */
  private String shopInfoId;

  /**
   * 用户id
   */
  private String userId;

  /**
   * 评论内容
   */
  private String content;

  /**
   * 评论时间
   */
  private Date commentTime;

  /**
   * 逻辑删除字段：0：未删除，1:删除
   */
  private Integer logicDelete;

  
  public Integer getGoodNum(){
    return goodNum;
  }

  public void setGoodNum(Integer goodNum){
    this.goodNum = goodNum;
  }

  public Integer getBadNum(){
    return badNum;
  }

  public void setBadNum(Integer badNum){
    this.badNum = badNum;
  }

  public String getNickName(){
    return nickName;
  }

  public void setNickName(String nickName){
    this.nickName = nickName;
  }

  public String getHeadUrl(){
    return headUrl;
  }

  public void setHeadUrl(String headUrl){
    this.headUrl = headUrl;
  }

  public List<String> getImgs(){
    return imgs;
  }

  public void setImgs(List<String> imgs){
    this.imgs = imgs;
  }

  public String getId() {
      return id;
  }

  public void setId(String id) {
      this.id = id == null ? null : id.trim();
  }

  /**
   * 获取店铺id
   */
  public String getShopId() {
      return shopId;
  }

  /**
   * 设置店铺id
   */
  public void setShopId(String shopId) {
      this.shopId = shopId == null ? null : shopId.trim();
  }

  /**
   * 获取店铺详细信息id
   */
  public String getShopInfoId() {
      return shopInfoId;
  }

  /**
   * 设置店铺详细信息id
   */
  public void setShopInfoId(String shopInfoId) {
      this.shopInfoId = shopInfoId == null ? null : shopInfoId.trim();
  }

  /**
   * 获取用户id
   */
  public String getUserId() {
      return userId;
  }

  /**
   * 设置用户id
   */
  public void setUserId(String userId) {
      this.userId = userId == null ? null : userId.trim();
  }

  /**
   * 获取评论内容
   */
  public String getContent() {
      return content;
  }

  /**
   * 设置评论内容
   */
  public void setContent(String content) {
      this.content = content == null ? null : content.trim();
  }

  /**
   * 获取评论时间
   */
  public Date getCommentTime() {
      return commentTime;
  }

  /**
   * 设置评论时间
   */
  public void setCommentTime(Date commentTime) {
      this.commentTime = commentTime;
  }

  /**
   * 获取逻辑删除字段：0：未删除，1:删除
   */
  public Integer getLogicDelete() {
      return logicDelete;
  }

  /**
   * 设置逻辑删除字段：0：未删除，1:删除
   */
  public void setLogicDelete(Integer logicDelete) {
      this.logicDelete = logicDelete;
  }

  public Integer getStatus(){
    return status;
  }

  public void setStatus(Integer status){
    this.status = status;
  }
  
  
}

