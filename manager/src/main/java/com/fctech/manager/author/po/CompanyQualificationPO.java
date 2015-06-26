package com.fctech.manager.author.po;

public class CompanyQualificationPO {
    private Integer qualificationId;

    private String qualificationName;

    private String qualificationNo;

    private String qualificationValperiod;

    private String filePath;

    private String fileName;

    private Integer companyId;

    public Integer getQualificationId() {
        return qualificationId;
    }

    public void setQualificationId(Integer qualificationId) {
        this.qualificationId = qualificationId;
    }

    public String getQualificationName() {
        return qualificationName;
    }

    public void setQualificationName(String qualificationName) {
        this.qualificationName = qualificationName == null ? null : qualificationName.trim();
    }

    public String getQualificationNo() {
        return qualificationNo;
    }

    public void setQualificationNo(String qualificationNo) {
        this.qualificationNo = qualificationNo == null ? null : qualificationNo.trim();
    }

    public String getQualificationValperiod() {
        return qualificationValperiod;
    }

    public void setQualificationValperiod(String qualificationValperiod) {
        this.qualificationValperiod = qualificationValperiod == null ? null : qualificationValperiod.trim();
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