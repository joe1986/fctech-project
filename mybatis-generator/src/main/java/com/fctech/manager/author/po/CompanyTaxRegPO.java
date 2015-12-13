package com.fctech.manager.author.po;

public class CompanyTaxregPO {
    private Integer taxregId;

    private String taxregType;

    private String taxregNo;

    private String filePath;

    private String fileName;

    private Integer companyId;

    public Integer getTaxregId() {
        return taxregId;
    }

    public void setTaxregId(Integer taxregId) {
        this.taxregId = taxregId;
    }

    public String getTaxregType() {
        return taxregType;
    }

    public void setTaxregType(String taxregType) {
        this.taxregType = taxregType == null ? null : taxregType.trim();
    }

    public String getTaxregNo() {
        return taxregNo;
    }

    public void setTaxregNo(String taxregNo) {
        this.taxregNo = taxregNo == null ? null : taxregNo.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}