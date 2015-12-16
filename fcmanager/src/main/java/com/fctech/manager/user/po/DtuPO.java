package com.fctech.manager.po;

import java.util.Date;

public class DtuPO {
    private Integer dtuid;

    private String dtuno;

    private Integer projectid;

    private Date time;

    public Integer getDtuid() {
        return dtuid;
    }

    public void setDtuid(Integer dtuid) {
        this.dtuid = dtuid;
    }

    public String getDtuno() {
        return dtuno;
    }

    public void setDtuno(String dtuno) {
        this.dtuno = dtuno == null ? null : dtuno.trim();
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}