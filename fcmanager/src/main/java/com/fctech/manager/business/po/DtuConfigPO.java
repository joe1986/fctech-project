package com.fctech.manager.business.po;

import java.util.Date;

public class DtuConfigPO {
    private Integer terminalconfigid;

    private String dtuno;

    private Date logondate;

    private Date updatetime;

    private String sinaddr;

    private String sinport;

    private String localaddr;

    private String localport;

    public Integer getTerminalconfigid() {
        return terminalconfigid;
    }

    public void setTerminalconfigid(Integer terminalconfigid) {
        this.terminalconfigid = terminalconfigid;
    }

    public String getDtuno() {
        return dtuno;
    }

    public void setDtuno(String dtuno) {
        this.dtuno = dtuno == null ? null : dtuno.trim();
    }

    public Date getLogondate() {
        return logondate;
    }

    public void setLogondate(Date logondate) {
        this.logondate = logondate;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getSinaddr() {
        return sinaddr;
    }

    public void setSinaddr(String sinaddr) {
        this.sinaddr = sinaddr == null ? null : sinaddr.trim();
    }

    public String getSinport() {
        return sinport;
    }

    public void setSinport(String sinport) {
        this.sinport = sinport == null ? null : sinport.trim();
    }

    public String getLocaladdr() {
        return localaddr;
    }

    public void setLocaladdr(String localaddr) {
        this.localaddr = localaddr == null ? null : localaddr.trim();
    }

    public String getLocalport() {
        return localport;
    }

    public void setLocalport(String localport) {
        this.localport = localport == null ? null : localport.trim();
    }
}