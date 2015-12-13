package com.fctech.manager.author.po;

import java.util.Date;

public class ParamPO {
    private Integer parameterid;

    private Double modulus;

    private Double constant;

    private Integer stationid;

    private Date time;

    public Integer getParameterid() {
        return parameterid;
    }

    public void setParameterid(Integer parameterid) {
        this.parameterid = parameterid;
    }

    public Double getModulus() {
        return modulus;
    }

    public void setModulus(Double modulus) {
        this.modulus = modulus;
    }

    public Double getConstant() {
        return constant;
    }

    public void setConstant(Double constant) {
        this.constant = constant;
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