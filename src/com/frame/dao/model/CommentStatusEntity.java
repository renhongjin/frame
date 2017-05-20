package com.frame.dao.model;

import java.util.Date;

public class CommentStatusEntity {
    private String id;

    /**
     * 用户id
     */
    private String userId;

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
}