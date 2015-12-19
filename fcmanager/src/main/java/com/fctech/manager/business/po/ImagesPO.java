package com.fctech.manager.business.po;

import java.util.Date;

public class ImagesPO {
    private Integer imageId;

    private Integer projectdocId;

    private Date time;

    private String imageName;

    private String imagePath;

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public Integer getProjectdocId() {
        return projectdocId;
    }

    public void setProjectdocId(Integer projectdocId) {
        this.projectdocId = projectdocId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName == null ? null : imageName.trim();
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath == null ? null : imagePath.trim();
    }
}