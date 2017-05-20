package com.frame.dao.model;

import java.util.Date;

public class CommentEntity {
    private String id;

    /**
     * ����id
     */
    private String shopId;

    /**
     * ������ϸ��Ϣid
     */
    private String shopInfoId;

    /**
     * �û�id
     */
    private String userId;

    /**
     * ��������
     */
    private String content;

    /**
     * ����ʱ��
     */
    private Date commentTime;

    /**
     * �߼�ɾ���ֶΣ�0��δɾ����1:ɾ��
     */
    private Integer logicDelete;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * ��ȡ����id
     */
    public String getShopId() {
        return shopId;
    }

    /**
     * ���õ���id
     */
    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    /**
     * ��ȡ������ϸ��Ϣid
     */
    public String getShopInfoId() {
        return shopInfoId;
    }

    /**
     * ���õ�����ϸ��Ϣid
     */
    public void setShopInfoId(String shopInfoId) {
        this.shopInfoId = shopInfoId == null ? null : shopInfoId.trim();
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
     * ��ȡ��������
     */
    public String getContent() {
        return content;
    }

    /**
     * ������������
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * ��ȡ����ʱ��
     */
    public Date getCommentTime() {
        return commentTime;
    }

    /**
     * ��������ʱ��
     */
    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    /**
     * ��ȡ�߼�ɾ���ֶΣ�0��δɾ����1:ɾ��
     */
    public Integer getLogicDelete() {
        return logicDelete;
    }

    /**
     * �����߼�ɾ���ֶΣ�0��δɾ����1:ɾ��
     */
    public void setLogicDelete(Integer logicDelete) {
        this.logicDelete = logicDelete;
    }
}