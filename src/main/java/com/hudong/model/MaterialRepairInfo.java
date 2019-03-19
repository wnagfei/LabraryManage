package com.hudong.model;

public class MaterialRepairInfo {
    private Integer id;

    private String materialNo;

    private String materialName;

    private String repairReason;

    private String repairReturnDate;

    private String repairRemark;

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

    public String getRepairReason() {
        return repairReason;
    }

    public void setRepairReason(String repairReason) {
        this.repairReason = repairReason == null ? null : repairReason.trim();
    }

    public String getRepairReturnDate() {
        return repairReturnDate;
    }

    public void setRepairReturnDate(String repairReturnDate) {
        this.repairReturnDate = repairReturnDate == null ? null : repairReturnDate.trim();
    }

    public String getRepairRemark() {
        return repairRemark;
    }

    public void setRepairRemark(String repairRemark) {
        this.repairRemark = repairRemark == null ? null : repairRemark.trim();
    }
}