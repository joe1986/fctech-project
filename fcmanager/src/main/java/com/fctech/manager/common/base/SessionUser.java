package com.fctech.manager.common.base;

import java.util.Date;
import java.util.List;

import com.fctech.manager.user.vo.MenuVO;

public class SessionUser {
	private Integer userid;

	private String truename;

	private String idcard;

	private String username;

	private String password;

	private String useremail;

	private String phone;

	private Integer validtime;

	private Date time;

	private Integer projectId;

	private List<MenuVO> menuVOList;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getTruename() {
		return truename;
	}

	public void setTruename(String truename) {
		this.truename = truename;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getValidtime() {
		return validtime;
	}

	public void setValidtime(Integer validtime) {
		this.validtime = validtime;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public List<MenuVO> getMenuVOList() {
		return menuVOList;
	}

	public void setMenuVOList(List<MenuVO> menuVOList) {
		this.menuVOList = menuVOList;
	}

}
