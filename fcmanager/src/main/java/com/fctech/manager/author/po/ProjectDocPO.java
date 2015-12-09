package com.fctech.manager.author.po;

public class ProjectDocPO {
    private Integer projectdocId;

    private String filePath;

    private String fileName;

    private String projectdocType;

    private Integer projectId;

    public Integer getProjectdocId() {
        return projectdocId;
    }

    public void setProjectdocId(Integer projectdocId) {
        this.projectdocId = projectdocId;
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

    public String getProjectdocType() {
        return projectdocType;
    }

    public void setProjectdocType(String projectdocType) {
        this.projectdocType = projectdocType == null ? null : projectdocType.trim();
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }
}