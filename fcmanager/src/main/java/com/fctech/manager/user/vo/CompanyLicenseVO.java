package com.fctech.manager.user.vo;

public class CompanyLicenseVO {
    private Integer businesslicenseId;

    private String businesslicenseNo;

    private String businesslicenseDates;

    private String businesslicenseDatee;

    private String filePath;

    private String fileName;

    private Integer companyId;

    public Integer getBusinesslicenseId() {
        return businesslicenseId;
    }

    public void setBusinesslicenseId(Integer businesslicenseId) {
        this.businesslicenseId = businesslicenseId;
    }

    public String getBusinesslicenseNo() {
        return businesslicenseNo;
    }

    public void setBusinesslicenseNo(String businesslicenseNo) {
        this.businesslicenseNo = businesslicenseNo == null ? null : businesslicenseNo.trim();
    }

    public String getBusinesslicenseDates() {
        return businesslicenseDates;
    }

    public void setBusinesslicenseDates(String businesslicenseDates) {
        this.businesslicenseDates = businesslicenseDates == null ? null : businesslicenseDates.trim();
    }

    public String getBusinesslicenseDatee() {
        return businesslicenseDatee;
    }

    public void setBusinesslicenseDatee(String businesslicenseDatee) {
        this.businesslicenseDatee = businesslicenseDatee == null ? null : businesslicenseDatee.trim();
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