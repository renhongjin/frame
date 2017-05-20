package com.frame.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ShopInfo implements Serializable{

  /**
   * 
   */
  private static final long serialVersionUID = 3609374098657609610L;
  /**
   * 评论列表
   */
  private List<Comment> commentList;
  /**
   * 店铺详细信息中的banner图片地址列表
   */
  private List<String> imgs;
  
  private String id;

  /**
   * 店铺id
   */
  private String shopId;

  /**
   * 店铺查看次数
   */
  private Integer see;

  /**
   * 店铺推荐指数
   */
  private Integer recommend;

  /**
   * 店铺的详细描述
   */
  private String shopDetaiDesc;

  /**
   * 描述的创建时间
   */
  private Date createTime;

  /**
   * 创建人
   */
  private String createUser;

  /**
   * 0：未删除，1:删除
   */
  private Integer logicDelete;

  public List<Comment> getCommentList(){
    return commentList;
  }

  public void setCommentList(List<Comment> commentList){
    this.commentList = commentList;
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
   * 获取店铺查看次数
   */
  public Integer getSee() {
      return see;
  }

  /**
   * 设置店铺查看次数
   */
  public void setSee(Integer see) {
      this.see = see;
  }

  /**
   * 获取店铺推荐指数
   */
  public Integer getRecommend() {
      return recommend;
  }

  /**
   * 设置店铺推荐指数
   */
  public void setRecommend(Integer recommend) {
      this.recommend = recommend;
  }

  /**
   * 获取店铺的详细描述
   */
  public String getShopDetaiDesc() {
      return shopDetaiDesc;
  }

  /**
   * 设置店铺的详细描述
   */
  public void setShopDetaiDesc(String shopDetaiDesc) {
      this.shopDetaiDesc = shopDetaiDesc == null ? null : shopDetaiDesc.trim();
  }

  /**
   * 获取描述的创建时间
   */
  public Date getCreateTime() {
      return createTime;
  }

  /**
   * 设置描述的创建时间
   */
  public void setCreateTime(Date createTime) {
      this.createTime = createTime;
  }

  /**
   * 获取创建人
   */
  public String getCreateUser() {
      return createUser;
  }

  /**
   * 设置创建人
   */
  public void setCreateUser(String createUser) {
      this.createUser = createUser == null ? null : createUser.trim();
  }

  /**
   * 获取0：未删除，1:删除
   */
  public Integer getLogicDelete() {
      return logicDelete;
  }

  /**
   * 设置0：未删除，1:删除
   */
  public void setLogicDelete(Integer logicDelete) {
      this.logicDelete = logicDelete;
  }
}

