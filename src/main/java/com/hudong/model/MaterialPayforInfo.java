package com.hudong.model;

public class MaterialPayforInfo {
    private Integer id;

    private String materialNo;

    private String materialName;

    private String payForReason;

    private String payForMoney;

    private String payForOwner;

    private String payForRemark;

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

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName == null ? null : materialName.trim();
    }

    public String getPayForReason() {
        return payForReason;
    }

    public void setPayForReason(String payForReason) {
        this.payForReason = payForReason == null ? null : payForReason.trim();
    }

    public String getPayForMoney() {
        return payForMoney;
    }

    public void setPayForMoney(String payForMoney) {
        this.payForMoney = payForMoney == null ? null : payForMoney.trim();
    }

    public String getPayForOwner() {
        return payForOwner;
    }

    public void setPayForOwner(String payForOwner) {
        this.payForOwner = payForOwner == null ? null : payForOwner.trim();
    }

    public String getPayForRemark() {
        return payForRemark;
    }

    public void setPayForRemark(String payForRemark) {
        this.payForRemark = payForRemark == null ? null : payForRemark.trim();
    }
}