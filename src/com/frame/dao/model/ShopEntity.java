package com.frame.dao.model;

import java.math.BigDecimal;
import java.util.Date;

public class ShopEntity {
    /**
     * ����id
     */
    private String id;

    /**
     * ��������
     */
    private String name;

    /**
     * γ��
     */
    private BigDecimal latitude;

    /**
     * ����
     */
    private BigDecimal longitude;

    /**
     * ����logo
     */
    private String logoUrl;

    /**
     * ��������
     */
    private String desc;

    /**
     * �����������͵�С��
     */
    private String type;

    /**
     * ���̵�ַ
     */
    private String address;

    /**
     * ��ϵ�绰
     */
    private String phone;

    /**
     * ����ʱ��
     */
    private Date createTime;

    /**
     * 0:δɾ����1��ɾ��
     */
    private Integer logicDelete;

    /**
     * ���̵Ĵ����û�
     */
    private String createUser;

    /**
     * ��ȡ����id
     */
    public String getId() {
        return id;
    }

    /**
     * ���õ���id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * ��ȡ��������
     */
    public String getName() {
        return name;
    }

    /**
     * ���õ�������
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * ��ȡγ��
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * ����γ��
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * ��ȡ����
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * ���þ���
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * ��ȡ����logo
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * ���õ���logo
     */
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl == null ? null : logoUrl.trim();
    }

    /**
     * ��ȡ��������
     */
    public String getDesc() {
        return desc;
    }

    /**
     * ���õ�������
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * ��ȡ�����������͵�С��
     */
    public String getType() {
        return type;
    }

    /**
     * ���������������͵�С��
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * ��ȡ���̵�ַ
     */
    public String getAddress() {
        return address;
    }

    /**
     * ���õ��̵�ַ
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * ��ȡ��ϵ�绰
     */
    public String getPhone() {
        return phone;
    }

    /**
     * ������ϵ�绰
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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
     * ��ȡ0:δɾ����1��ɾ��
     */
    public Integer getLogicDelete() {
        return logicDelete;
    }

    /**
     * ����0:δɾ����1��ɾ��
     */
    public void setLogicDelete(Integer logicDelete) {
        this.logicDelete = logicDelete;
    }

    /**
     * ��ȡ���̵Ĵ����û�
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * ���õ��̵Ĵ����û�
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }
}