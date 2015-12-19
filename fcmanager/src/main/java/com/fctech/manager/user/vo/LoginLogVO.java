package com.fctech.manager.user.vo;

import java.util.Date;

public class LoginLogVO {
    private Long id;

    private String loginRecord;

    private String operatorPerson;

    private String loginRole;

    private Date time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginRecord() {
        return loginRecord;
    }

    public void setLoginRecord(String loginRecord) {
        this.loginRecord = loginRecord == null ? null : loginRecord.trim();
    }

    public String getOperatorPerson() {
        return operatorPerson;
    }

    public void setOperatorPerson(String operatorPerson) {
        this.operatorPerson = operatorPerson == null ? null : operatorPerson.trim();
    }

    public String getLoginRole() {
        return loginRole;
    }

    public void setLoginRole(String loginRole) {
        this.loginRole = loginRole == null ? null : loginRole.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}