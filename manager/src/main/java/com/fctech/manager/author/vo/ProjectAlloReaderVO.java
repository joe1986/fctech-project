package com.fctech.manager.author.vo;

import java.util.Date;

public class ProjectAlloReaderVO {
    private Integer projectReaderid;

    private Integer readerId;

    private Integer projectId;

    private String reviewstatus;

    private Date time;

    public Integer getProjectReaderid() {
        return projectReaderid;
    }

    public void setProjectReaderid(Integer projectReaderid) {
        this.projectReaderid = projectReaderid;
    }

    public Integer getReaderId() {
        return readerId;
    }

    public void setReaderId(Integer readerId) {
        this.readerId = readerId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getReviewstatus() {
        return reviewstatus;
    }

    public void setReviewstatus(String reviewstatus) {
        this.reviewstatus = reviewstatus == null ? null : reviewstatus.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}