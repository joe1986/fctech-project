package com.fctech.manager.author.po;

import java.util.Date;

public class FormulaPO {
    private Integer formulaid;

    private String formulacontent;

    private String formulatype;

    private Integer stationid;

    private Date time;

    public Integer getFormulaid() {
        return formulaid;
    }

    public void setFormulaid(Integer formulaid) {
        this.formulaid = formulaid;
    }

    public String getFormulacontent() {
        return formulacontent;
    }

    public void setFormulacontent(String formulacontent) {
        this.formulacontent = formulacontent == null ? null : formulacontent.trim();
    }

    public String getFormulatype() {
        return formulatype;
    }

    public void setFormulatype(String formulatype) {
        this.formulatype = formulatype == null ? null : formulatype.trim();
    }

    public Integer getStationid() {
        return stationid;
    }

    public void setStationid(Integer stationid) {
        this.stationid = stationid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}