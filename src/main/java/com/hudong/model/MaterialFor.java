package com.hudong.model;

public class MaterialFor {
    private Integer id;

    private String materialNo;

    private Integer payforNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaterialNo() {
        return materialNo;
    }

    public void setMaterialNo(String materialNo) {
        this.materialNo = materialNo == null ? null : materialNo.trim();
    }

    public Integer getPayforNo() {
        return payforNo;
    }

    public void setPayforNo(Integer payforNo) {
        this.payforNo = payforNo;
    }
}