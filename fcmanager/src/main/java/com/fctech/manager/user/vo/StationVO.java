package com.fctech.manager.user.vo;

import java.util.Date;

public class StationVO {
    private Integer stationid;

    private String stationname;

    private Double coordinatex;

    private Double coordinatey;

    private Integer dtuid;

    private Integer imageid;

    private String stationtype;

    private Date time;

    public Integer getStationid() {
        return stationid;
    }

    public void setStationid(Integer stationid) {
        this.stationid = stationid;
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname == null ? null : stationname.trim();
    }

    public Double getCoordinatex() {
        return coordinatex;
    }

    public void setCoordinatex(Double coordinatex) {
        this.coordinatex = coordinatex;
    }

    public Double getCoordinatey() {
        return coordinatey;
    }

    public void setCoordinatey(Double coordinatey) {
        this.coordinatey = coordinatey;
    }

    public Integer getDtuid() {
        return dtuid;
    }

    public void setDtuid(Integer dtuid) {
        this.dtuid = dtuid;
    }

    public Integer getImageid() {
        return imageid;
    }

    public void setImageid(Integer imageid) {
        this.imageid = imageid;
    }

    public String getStationtype() {
        return stationtype;
    }

    public void setStationtype(String stationtype) {
        this.stationtype = stationtype == null ? null : stationtype.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}