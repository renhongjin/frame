package com.frame.dao.model;

import java.util.Date;

public class CommentStatusEntity {
    private String id;

    /**
     * �û�id
     */
    private String userId;

    /**
     * ����id
     */
    private String commentId;

    /**
     * 1:��ͬ��0������,-1���Ȳ�����Ҳ����ͬ
     */
    private Integer status;

    /**
     * ����ʱ��
     */
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * ��ȡ�û�id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * �����û�id
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * ��ȡ����id
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * ��������id
     */
    public void setCommentId(String commentId) {
        this.commentId = commentId == null ? null : commentId.trim();
    }

    /**
     * ��ȡ1:��ͬ��0������,-1���Ȳ�����Ҳ����ͬ
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * ����1:��ͬ��0������,-1���Ȳ�����Ҳ����ͬ
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * ��ȡ����ʱ��
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * ���ô���ʱ��
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}