package com.frame.dao.model;

import java.util.Date;

public class SeeLogEntity {
    /**
     * ����id
     */
    private String id;

    /**
     * �鿴�û���openId
     */
    private String openId;

    /**
     * ����id
     */
    private String shopId;

    /**
     * ��������id
     */
    private String shopInfoId;

    /**
     * �鿴ʱ��
     */
    private Date seeTime;

    /**
     * ��ȡ����id
     */
    public String getId() {
        return id;
    }

    /**
     * ��������id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * ��ȡ�鿴�û���openId
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * ���ò鿴�û���openId
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
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
     * ��ȡ��������id
     */
    public String getShopInfoId() {
        return shopInfoId;
    }

    /**
     * ���õ�������id
     */
    public void setShopInfoId(String shopInfoId) {
        this.shopInfoId = shopInfoId == null ? null : shopInfoId.trim();
    }

    /**
     * ��ȡ�鿴ʱ��
     */
    public Date getSeeTime() {
        return seeTime;
    }

    /**
     * ���ò鿴ʱ��
     */
    public void setSeeTime(Date seeTime) {
        this.seeTime = seeTime;
    }
}