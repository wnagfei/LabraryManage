package com.hudong.model;

public class MaterialInfo {
    private Integer id;

    private String materialNo;

    private String materialName;

    private String materialCategory;

    private String materialOwner;

    private String status;

    private String materialOrder;

    private String materialAdress;

    private String materialRemark;

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

    public String getMaterialCategory() {
        return materialCategory;
    }

    public void setMaterialCategory(String materialCategory) {
        this.materialCategory = materialCategory == null ? null : materialCategory.trim();
    }

    public String getMaterialOwner() {
        return materialOwner;
    }

    public void setMaterialOwner(String materialOwner) {
        this.materialOwner = materialOwner == null ? null : materialOwner.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getMaterialOrder() {
        return materialOrder;
    }

    public void setMaterialOrder(String materialOrder) {
        this.materialOrder = materialOrder == null ? null : materialOrder.trim();
    }

    public String getMaterialAdress() {
        return materialAdress;
    }

    public void setMaterialAdress(String materialAdress) {
        this.materialAdress = materialAdress == null ? null : materialAdress.trim();
    }

    public String getMaterialRemark() {
        return materialRemark;
    }

    public void setMaterialRemark(String materialRemark) {
        this.materialRemark = materialRemark == null ? null : materialRemark.trim();
    }
}