package com.hudong.model;

public class MaterialRepair {
    private Integer id;

    private String materialNo;

    private Integer repairNo;

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

    public Integer getRepairNo() {
        return repairNo;
    }

    public void setRepairNo(Integer repairNo) {
        this.repairNo = repairNo;
    }
}