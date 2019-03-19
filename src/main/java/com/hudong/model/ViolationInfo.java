package com.hudong.model;

public class ViolationInfo {
    private Integer id;

    private Integer orderId;

    private Integer teacherId;

    private Integer studentId;

    private String materialNo;

    private String violationReason;

    private Integer payforId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getMaterialNo() {
        return materialNo;
    }

    public void setMaterialNo(String materialNo) {
        this.materialNo = materialNo == null ? null : materialNo.trim();
    }

    public String getViolationReason() {
        return violationReason;
    }

    public void setViolationReason(String violationReason) {
        this.violationReason = violationReason == null ? null : violationReason.trim();
    }

    public Integer getPayforId() {
        return payforId;
    }

    public void setPayforId(Integer payforId) {
        this.payforId = payforId;
    }
}