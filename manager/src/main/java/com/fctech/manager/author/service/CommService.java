package com.fctech.manager.author.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * 公共服务
 * Created by joe on 15/6/24.
 *
 */
public interface CommService {

	/**
	 * 删除公司，同时删除公司下人员和角色以及它们的权限信息
	 * @param companyId
	 * @throws Exception
	 */
	public void delByCompanyId(String companyId)throws Exception;

	/**
	 * 删除角色，同时删除角色以及它们的权限信息
	 * @throws Exception
	 */
	public void delByRoleId(String roleId)throws Exception;
	
	/**
	 * 删除用户，同时用户以及它们的权限信息
	 * @throws Exception
	 */
	public void delByUserId(String userId)throws Exception;

}
