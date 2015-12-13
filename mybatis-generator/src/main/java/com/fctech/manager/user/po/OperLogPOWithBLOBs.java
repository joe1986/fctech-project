package com.fctech.manager.user.po;

public class OperLogPOWithBLOBs extends OperLogPO {
    private byte[] beforecontent;

    private byte[] aftercontent;

    public byte[] getBeforecontent() {
        return beforecontent;
    }

    public void setBeforecontent(byte[] beforecontent) {
        this.beforecontent = beforecontent;
    }

    public byte[] getAftercontent() {
        return aftercontent;
    }

    public void setAftercontent(byte[] aftercontent) {
        this.aftercontent = aftercontent;
    }
}