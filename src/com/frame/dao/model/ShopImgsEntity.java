package com.frame.dao.model;

import java.util.Date;

public class ShopImgsEntity {
    /**
     * 图片id
     */
    private String id;

    /**
     * 图片的url地址
     */
    private String url;

    /**
     * 图片的展示序号
     */
    private Integer sort;

    /**
     * 店铺详细信息id
     */
    private String shopInfoId;

    /**
     * 评论id
     */
    private String commentId;

    /**
     * 图片类型：1：店铺说明，2：评论图片
     */
    private Integer imgType;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 逻辑删除字段：0:未删除，1：删除
     */
    private Integer logicDelete;

    /**
     * 获取图片id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置图片id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取图片的url地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置图片的url地址
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取图片的展示序号
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置图片的展示序号
     */
    public void setSort(Integer sort) {
        this.sort = sort;
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
     * 获取图片类型：1：店铺说明，2：评论图片
     */
    public Integer getImgType() {
        return imgType;
    }

    /**
     * 设置图片类型：1：店铺说明，2：评论图片
     */
    public void setImgType(Integer imgType) {
        this.imgType = imgType;
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
     * 获取逻辑删除字段：0:未删除，1：删除
     */
    public Integer getLogicDelete() {
        return logicDelete;
    }

    /**
     * 设置逻辑删除字段：0:未删除，1：删除
     */
    public void setLogicDelete(Integer logicDelete) {
        this.logicDelete = logicDelete;
    }
}