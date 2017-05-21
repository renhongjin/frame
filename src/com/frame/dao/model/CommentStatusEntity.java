package com.frame.dao.model;

import java.util.Date;

public class CommentStatusEntity {
    private String id;
    /**
     * 店铺详情id
     */
    private String shopInfoId;
    /**
     * 微信openId
     */
    private String openId;

    /**
     * 评论id
     */
    private String commentId;

    /**
     * 1:赞同，0：反对,-1：既不反对也不赞同
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取评论id
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * 设置评论id
     */
    public void setCommentId(String commentId) {
        this.commentId = commentId == null ? null : commentId.trim();
    }

    /**
     * 获取1:赞同，0：反对,-1：既不反对也不赞同
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置1:赞同，0：反对,-1：既不反对也不赞同
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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