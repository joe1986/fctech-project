package com.fctech.manager.user.vo;

import java.util.Date;

public class OperLogVO {
    private Long operateId;

    private String operatetype;

    private String datatype;

    private String operatelocation;

    private String projectname;

    private String companyname;

    private String operateperson;

    private Date time;

    public Long getOperateId() {
        return operateId;
    }

    public void setOperateId(Long operateId) {
        this.operateId = operateId;
    }

    public String getOperatetype() {
        return operatetype;
    }

    public void setOperatetype(String operatetype) {
        this.operatetype = operatetype == null ? null : operatetype.trim();
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype == null ? null : datatype.trim();
    }

    public String getOperatelocation() {
        return operatelocation;
    }

    public void setOperatelocation(String operatelocation) {
        this.operatelocation = operatelocation == null ? null : operatelocation.trim();
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

    public String getOperateperson() {
        return operateperson;
    }

    public void setOperateperson(String operateperson) {
        this.operateperson = operateperson == null ? null : operateperson.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}