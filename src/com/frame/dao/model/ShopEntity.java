package com.frame.dao.model;

import java.math.BigDecimal;
import java.util.Date;

public class ShopEntity {
    /**
     * 店铺id
     */
    private String id;

    /**
     * 店铺名称
     */
    private String name;

    /**
     * 纬度
     */
    private BigDecimal latitude;

    /**
     * 经度
     */
    private BigDecimal longitude;

    /**
     * 店铺logo
     */
    private String logoUrl;

    /**
     * 店铺描述
     */
    private String desc;

    /**
     * 属于那种类型的小吃
     */
    private String type;

    /**
     * 店铺地址
     */
    private String address;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 0:未删除，1：删除
     */
    private Integer logicDelete;

    /**
     * 店铺的创建用户
     */
    private String createUser;

    /**
     * 获取店铺id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置店铺id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取店铺名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置店铺名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取纬度
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * 设置纬度
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取经度
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * 设置经度
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取店铺logo
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * 设置店铺logo
     */
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl == null ? null : logoUrl.trim();
    }

    /**
     * 获取店铺描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置店铺描述
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * 获取属于那种类型的小吃
     */
    public String getType() {
        return type;
    }

    /**
     * 设置属于那种类型的小吃
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取店铺地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置店铺地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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

    /**
     * 获取0:未删除，1：删除
     */
    public Integer getLogicDelete() {
        return logicDelete;
    }

    /**
     * 设置0:未删除，1：删除
     */
    public void setLogicDelete(Integer logicDelete) {
        this.logicDelete = logicDelete;
    }

    /**
     * 获取店铺的创建用户
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置店铺的创建用户
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }
}