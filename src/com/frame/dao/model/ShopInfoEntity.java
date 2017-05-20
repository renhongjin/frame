package com.frame.dao.model;

import java.util.Date;

public class ShopInfoEntity {
    private String id;

    /**
     * ����id
     */
    private String shopId;

    /**
     * ���̲鿴����
     */
    private Integer see;

    /**
     * �����Ƽ�ָ��
     */
    private Integer recommend;

    /**
     * ���̵���ϸ����
     */
    private String shopDetaiDesc;

    /**
     * �����Ĵ���ʱ��
     */
    private Date createTime;

    /**
     * ������
     */
    private String createUser;

    /**
     * 0��δɾ����1:ɾ��
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
     * ��ȡ���̲鿴����
     */
    public Integer getSee() {
        return see;
    }

    /**
     * ���õ��̲鿴����
     */
    public void setSee(Integer see) {
        this.see = see;
    }

    /**
     * ��ȡ�����Ƽ�ָ��
     */
    public Integer getRecommend() {
        return recommend;
    }

    /**
     * ���õ����Ƽ�ָ��
     */
    public void setRecommend(Integer recommend) {
        this.recommend = recommend;
    }

    /**
     * ��ȡ���̵���ϸ����
     */
    public String getShopDetaiDesc() {
        return shopDetaiDesc;
    }

    /**
     * ���õ��̵���ϸ����
     */
    public void setShopDetaiDesc(String shopDetaiDesc) {
        this.shopDetaiDesc = shopDetaiDesc == null ? null : shopDetaiDesc.trim();
    }

    /**
     * ��ȡ�����Ĵ���ʱ��
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * ���������Ĵ���ʱ��
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * ��ȡ������
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * ���ô�����
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * ��ȡ0��δɾ����1:ɾ��
     */
    public Integer getLogicDelete() {
        return logicDelete;
    }

    /**
     * ����0��δɾ����1:ɾ��
     */
    public void setLogicDelete(Integer logicDelete) {
        this.logicDelete = logicDelete;
    }
}