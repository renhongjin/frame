package com.frame.bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
  
  /**
   * 
   */
  private static final long serialVersionUID = -6158097583650675282L;

  private String id;

  /**
   * 微信openid
   */
  private String openId;

  /**
   * 微信昵称
   */
  private String nickName;

  /**
   * 微信头像地址
   */
  private String headUrl;

  /**
   * 微信用户性别:1:男
   */
  private Integer gender;

  /**
   * 语言
   */
  private String language;

  /**
   * 城市
   */
  private String city;

  /**
   * 省份
   */
  private String province;

  /**
   * 国家
   */
  private String country;

  /**
   * 创建时间
   */
  private Date createTime;

  public String getId() {
      return id;
  }

  public void setId(String id) {
      this.id = id == null ? null : id.trim();
  }

  /**
   * 获取微信openid
   */
  public String getOpenId() {
      return openId;
  }

  /**
   * 设置微信openid
   */
  public void setOpenId(String openId) {
      this.openId = openId == null ? null : openId.trim();
  }

  /**
   * 获取微信昵称
   */
  public String getNickName() {
      return nickName;
  }

  /**
   * 设置微信昵称
   */
  public void setNickName(String nickName) {
      this.nickName = nickName == null ? null : nickName.trim();
  }

  /**
   * 获取微信头像地址
   */
  public String getHeadUrl() {
      return headUrl;
  }

  /**
   * 设置微信头像地址
   */
  public void setHeadUrl(String headUrl) {
      this.headUrl = headUrl == null ? null : headUrl.trim();
  }

  /**
   * 获取微信用户性别:1:男
   */
  public Integer getGender() {
      return gender;
  }

  /**
   * 设置微信用户性别:1:男
   */
  public void setGender(Integer gender) {
      this.gender = gender;
  }

  /**
   * 获取语言
   */
  public String getLanguage() {
      return language;
  }

  /**
   * 设置语言
   */
  public void setLanguage(String language) {
      this.language = language == null ? null : language.trim();
  }

  /**
   * 获取城市
   */
  public String getCity() {
      return city;
  }

  /**
   * 设置城市
   */
  public void setCity(String city) {
      this.city = city == null ? null : city.trim();
  }

  /**
   * 获取省份
   */
  public String getProvince() {
      return province;
  }

  /**
   * 设置省份
   */
  public void setProvince(String province) {
      this.province = province == null ? null : province.trim();
  }

  /**
   * 获取国家
   */
  public String getCountry() {
      return country;
  }

  /**
   * 设置国家
   */
  public void setCountry(String country) {
      this.country = country == null ? null : country.trim();
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
}