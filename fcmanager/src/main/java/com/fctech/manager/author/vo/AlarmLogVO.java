package com.fctech.manager.author.vo;

import java.util.Date;

public class AlarmLogVO {
    private Integer alartid;

    private String alarttype;

    private String alartsource;

    private String alartlevel;

    private String imagename;

    private String projectname;

    private String companyname;

    private Date time;

    private String alartinfo;

    public Integer getAlartid() {
        return alartid;
    }

    public void setAlartid(Integer alartid) {
        this.alartid = alartid;
    }

    public String getAlarttype() {
        return alarttype;
    }

    public void setAlarttype(String alarttype) {
        this.alarttype = alarttype == null ? null : alarttype.trim();
    }

    public String getAlartsource() {
        return alartsource;
    }

    public void setAlartsource(String alartsource) {
        this.alartsource = alartsource == null ? null : alartsource.trim();
    }

    public String getAlartlevel() {
        return alartlevel;
    }

    public void setAlartlevel(String alartlevel) {
        this.alartlevel = alartlevel == null ? null : alartlevel.trim();
    }

    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename == null ? null : imagename.trim();
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getAlartinfo() {
        return alartinfo;
    }

    public void setAlartinfo(String alartinfo) {
        this.alartinfo = alartinfo == null ? null : alartinfo.trim();
    }
}