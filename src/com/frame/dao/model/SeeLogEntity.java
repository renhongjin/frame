package com.frame.dao.model;

import java.util.Date;

public class SeeLogEntity {
    /**
     * 主键id
     */
    private String id;

    /**
     * 查看用户的openId
     */
    private String openId;

    /**
     * 店铺id
     */
    private String shopId;

    /**
     * 店铺详情id
     */
    private String shopInfoId;

    /**
     * 查看时间
     */
    private Date seeTime;

    /**
     * 获取主键id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取查看用户的openId
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置查看用户的openId
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
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
     * 获取店铺详情id
     */
    public String getShopInfoId() {
        return shopInfoId;
    }

    /**
     * 设置店铺详情id
     */
    public void setShopInfoId(String shopInfoId) {
        this.shopInfoId = shopInfoId == null ? null : shopInfoId.trim();
    }

    /**
     * 获取查看时间
     */
    public Date getSeeTime() {
        return seeTime;
    }

    /**
     * 设置查看时间
     */
    public void setSeeTime(Date seeTime) {
        this.seeTime = seeTime;
    }
}