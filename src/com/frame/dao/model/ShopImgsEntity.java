package com.frame.dao.model;

import java.util.Date;

public class ShopImgsEntity {
    /**
     * ͼƬid
     */
    private String id;

    /**
     * ͼƬ��url��ַ
     */
    private String url;

    /**
     * ͼƬ��չʾ���
     */
    private Integer sort;

    /**
     * ������ϸ��Ϣid
     */
    private String shopInfoId;

    /**
     * ����id
     */
    private String commentId;

    /**
     * ͼƬ���ͣ�1������˵����2������ͼƬ
     */
    private Integer imgType;

    /**
     * ����ʱ��
     */
    private Date createTime;

    /**
     * �߼�ɾ���ֶΣ�0:δɾ����1��ɾ��
     */
    private Integer logicDelete;

    /**
     * ��ȡͼƬid
     */
    public String getId() {
        return id;
    }

    /**
     * ����ͼƬid
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * ��ȡͼƬ��url��ַ
     */
    public String getUrl() {
        return url;
    }

    /**
     * ����ͼƬ��url��ַ
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * ��ȡͼƬ��չʾ���
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * ����ͼƬ��չʾ���
     */
    public void setSort(Integer sort) {
        this.sort = sort;
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
     * ��ȡͼƬ���ͣ�1������˵����2������ͼƬ
     */
    public Integer getImgType() {
        return imgType;
    }

    /**
     * ����ͼƬ���ͣ�1������˵����2������ͼƬ
     */
    public void setImgType(Integer imgType) {
        this.imgType = imgType;
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

    /**
     * ��ȡ�߼�ɾ���ֶΣ�0:δɾ����1��ɾ��
     */
    public Integer getLogicDelete() {
        return logicDelete;
    }

    /**
     * �����߼�ɾ���ֶΣ�0:δɾ����1��ɾ��
     */
    public void setLogicDelete(Integer logicDelete) {
        this.logicDelete = logicDelete;
    }
}