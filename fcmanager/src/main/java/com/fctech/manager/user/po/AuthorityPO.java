package com.fctech.manager.user.po;

public class AuthorityPO {
    private String authorityId;

    private String authorityName;

    private String authorityNo;

    private String createTime;

    private String lastModifyTime;

    private String autoAuthorityFlag;

    private String deleteFlag;

    private String opUser;

    private String memo;

    public String getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(String authorityId) {
        this.authorityId = authorityId == null ? null : authorityId.trim();
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName == null ? null : authorityName.trim();
    }

    public String getAuthorityNo() {
        return authorityNo;
    }

    public void setAuthorityNo(String authorityNo) {
        this.authorityNo = authorityNo == null ? null : authorityNo.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime == null ? null : lastModifyTime.trim();
    }

    public String getAutoAuthorityFlag() {
        return autoAuthorityFlag;
    }

    public void setAutoAuthorityFlag(String autoAuthorityFlag) {
        this.autoAuthorityFlag = autoAuthorityFlag == null ? null : autoAuthorityFlag.trim();
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    public String getOpUser() {
        return opUser;
    }

    public void setOpUser(String opUser) {
        this.opUser = opUser == null ? null : opUser.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}