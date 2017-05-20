package com.frame.dao.model;

import java.util.Date;

public class UserEntity {
    private String id;

    /**
     * ΢��openid
     */
    private String openId;

    /**
     * ΢���ǳ�
     */
    private String nickName;

    /**
     * ΢��ͷ���ַ
     */
    private String headUrl;

    /**
     * ΢���û��Ա�:1:��
     */
    private Integer gender;

    /**
     * ����
     */
    private String language;

    /**
     * ����
     */
    private String city;

    /**
     * ʡ��
     */
    private String province;

    /**
     * ����
     */
    private String country;

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
     * ��ȡ΢��openid
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * ����΢��openid
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * ��ȡ΢���ǳ�
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * ����΢���ǳ�
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * ��ȡ΢��ͷ���ַ
     */
    public String getHeadUrl() {
        return headUrl;
    }

    /**
     * ����΢��ͷ���ַ
     */
    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl == null ? null : headUrl.trim();
    }

    /**
     * ��ȡ΢���û��Ա�:1:��
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * ����΢���û��Ա�:1:��
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * ��ȡ����
     */
    public String getLanguage() {
        return language;
    }

    /**
     * ��������
     */
    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    /**
     * ��ȡ����
     */
    public String getCity() {
        return city;
    }

    /**
     * ���ó���
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * ��ȡʡ��
     */
    public String getProvince() {
        return province;
    }

    /**
     * ����ʡ��
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * ��ȡ����
     */
    public String getCountry() {
        return country;
    }

    /**
     * ���ù���
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
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