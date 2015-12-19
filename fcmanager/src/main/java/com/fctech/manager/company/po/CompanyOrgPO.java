package com.fctech.manager.company.po;

public class CompanyOrgPO {
    private Integer organizationcodeId;

    private String organizationcodeNo;

    private String filePath;

    private String fileName;

    private Integer companyId;

    public Integer getOrganizationcodeId() {
        return organizationcodeId;
    }

    public void setOrganizationcodeId(Integer organizationcodeId) {
        this.organizationcodeId = organizationcodeId;
    }

    public String getOrganizationcodeNo() {
        return organizationcodeNo;
    }

    public void setOrganizationcodeNo(String organizationcodeNo) {
        this.organizationcodeNo = organizationcodeNo == null ? null : organizationcodeNo.trim();
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