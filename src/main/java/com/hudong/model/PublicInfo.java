package com.hudong.model;

import java.util.Date;

public class PublicInfo {
    private Integer id;

    private String publicName;

    private Date publicStartTime;

    private Date publicEndTime;

    private String publisher;

    private String publicContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPublicName() {
        return publicName;
    }

    public void setPublicName(String publicName) {
        this.publicName = publicName == null ? null : publicName.trim();
    }

    public Date getPublicStartTime() {
        return publicStartTime;
    }

    public void setPublicStartTime(Date publicStartTime) {
        this.publicStartTime = publicStartTime;
    }

    public Date getPublicEndTime() {
        return publicEndTime;
    }

    public void setPublicEndTime(Date publicEndTime) {
        this.publicEndTime = publicEndTime;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public String getPublicContent() {
        return publicContent;
    }

    public void setPublicContent(String publicContent) {
        this.publicContent = publicContent == null ? null : publicContent.trim();
    }
}