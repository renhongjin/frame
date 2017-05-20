package com.frame.dao.model;

import java.util.Date;

public class CommentEntity {
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
}