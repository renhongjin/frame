package com.frame.dao.model;

import java.util.Date;

public class ShopInfo {
    private String id;

    private String shopId;

    private Integer recommend;

    private String shopDetaiDesc;

    private Date createTime;

    private String createUser;

    private Integer logicDelete;

    private String see;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Integer getRecommend() {
        return recommend;
    }

    public void setRecommend(Integer recommend) {
        this.recommend = recommend;
    }

    public String getShopDetaiDesc() {
        return shopDetaiDesc;
    }

    public void setShopDetaiDesc(String shopDetaiDesc) {
        this.shopDetaiDesc = shopDetaiDesc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Integer getLogicDelete() {
        return logicDelete;
    }

    public void setLogicDelete(Integer logicDelete) {
        this.logicDelete = logicDelete;
    }

    public String getSee() {
        return see;
    }

    public void setSee(String see) {
        this.see = see;
    }
}