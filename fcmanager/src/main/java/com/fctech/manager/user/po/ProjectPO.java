package com.fctech.manager.po;

public class ProjectPO {
    private Integer projectId;

    private String projectName;

    private String projectCode;

    private String projectAddress;

    private String projectOwner;

    private String projectMaindesigner;

    private String projectPitdesigner;

    private String projectContractor;

    private String projectPitsubcontract;

    private String projectSupervision;

    private String projectMonitor;

    private Double projectPitarea;

    private Double projectCommondepth;

    private Double projectAroundlong;

    private Double projectDeepestdepth;

    private Integer companyId;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode == null ? null : projectCode.trim();
    }

    public String getProjectAddress() {
        return projectAddress;
    }

    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress == null ? null : projectAddress.trim();
    }

    public String getProjectOwner() {
        return projectOwner;
    }

    public void setProjectOwner(String projectOwner) {
        this.projectOwner = projectOwner == null ? null : projectOwner.trim();
    }

    public String getProjectMaindesigner() {
        return projectMaindesigner;
    }

    public void setProjectMaindesigner(String projectMaindesigner) {
        this.projectMaindesigner = projectMaindesigner == null ? null : projectMaindesigner.trim();
    }

    public String getProjectPitdesigner() {
        return projectPitdesigner;
    }

    public void setProjectPitdesigner(String projectPitdesigner) {
        this.projectPitdesigner = projectPitdesigner == null ? null : projectPitdesigner.trim();
    }

    public String getProjectContractor() {
        return projectContractor;
    }

    public void setProjectContractor(String projectContractor) {
        this.projectContractor = projectContractor == null ? null : projectContractor.trim();
    }

    public String getProjectPitsubcontract() {
        return projectPitsubcontract;
    }

    public void setProjectPitsubcontract(String projectPitsubcontract) {
        this.projectPitsubcontract = projectPitsubcontract == null ? null : projectPitsubcontract.trim();
    }

    public String getProjectSupervision() {
        return projectSupervision;
    }

    public void setProjectSupervision(String projectSupervision) {
        this.projectSupervision = projectSupervision == null ? null : projectSupervision.trim();
    }

    public String getProjectMonitor() {
        return projectMonitor;
    }

    public void setProjectMonitor(String projectMonitor) {
        this.projectMonitor = projectMonitor == null ? null : projectMonitor.trim();
    }

    public Double getProjectPitarea() {
        return projectPitarea;
    }

    public void setProjectPitarea(Double projectPitarea) {
        this.projectPitarea = projectPitarea;
    }

    public Double getProjectCommondepth() {
        return projectCommondepth;
    }

    public void setProjectCommondepth(Double projectCommondepth) {
        this.projectCommondepth = projectCommondepth;
    }

    public Double getProjectAroundlong() {
        return projectAroundlong;
    }

    public void setProjectAroundlong(Double projectAroundlong) {
        this.projectAroundlong = projectAroundlong;
    }

    public Double getProjectDeepestdepth() {
        return projectDeepestdepth;
    }

    public void setProjectDeepestdepth(Double projectDeepestdepth) {
        this.projectDeepestdepth = projectDeepestdepth;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}