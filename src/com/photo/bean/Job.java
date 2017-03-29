package com.photo.bean;

public class Job {
    private String cId;

    private String cJobName;

    private Integer cJobType;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcJobName() {
        return cJobName;
    }

    public void setcJobName(String cJobName) {
        this.cJobName = cJobName;
    }

    public Integer getcJobType() {
        return cJobType;
    }

    public void setcJobType(Integer cJobType) {
        this.cJobType = cJobType;
    }
}