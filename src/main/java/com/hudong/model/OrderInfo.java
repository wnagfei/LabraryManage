package com.hudong.model;

import java.util.Date;

public class OrderInfo {
    private Integer id;

    private Integer teacherId;

    private Integer studentId;

    private String materialNo;

    private String orderPurpose;

    private Date orderStartdate;

    private Date orderEnddate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getOrderPurpose() {
        return orderPurpose;
    }

    public void setOrderPurpose(String orderPurpose) {
        this.orderPurpose = orderPurpose == null ? null : orderPurpose.trim();
    }

    public Date getOrderStartdate() {
        return orderStartdate;
    }

    public void setOrderStartdate(Date orderStartdate) {
        this.orderStartdate = orderStartdate;
    }

    public Date getOrderEnddate() {
        return orderEnddate;
    }

    public void setOrderEnddate(Date orderEnddate) {
        this.orderEnddate = orderEnddate;
    }
}