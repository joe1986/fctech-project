package com.fctech.manager.business.po;

import java.util.Date;

public class SessorPO {
    private Integer sensorid;

    private String sensorno;

    private Integer stationid;

    private Date time;

    public Integer getSensorid() {
        return sensorid;
    }

    public void setSensorid(Integer sensorid) {
        this.sensorid = sensorid;
    }

    public String getSensorno() {
        return sensorno;
    }

    public void setSensorno(String sensorno) {
        this.sensorno = sensorno == null ? null : sensorno.trim();
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