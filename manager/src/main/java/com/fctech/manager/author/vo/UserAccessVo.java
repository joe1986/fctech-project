package com.fctech.manager.author.vo;

import java.io.Serializable;

public class UserAccessVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String menuId;
	private String menuUrl;
	private String authorityId;
	private String authorityName;
	private String authorityNo;
	
	
	public String getMenuId() {
		return menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public String getMenuUrl() {
		return menuUrl;
	}
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
	public String getAuthorityId() {
		return authorityId;
	}
	public void setAuthorityId(String authorityId) {
		this.authorityId = authorityId;
	}
	public String getAuthorityName() {
		return authorityName;
	}
	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}
	public String getAuthorityNo() {
		return authorityNo;
	}
	public void setAuthorityNo(String authorityNo) {
		this.authorityNo = authorityNo;
	}
	
}
