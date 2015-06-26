package com.fctech.manager.author.service;

import com.fctech.manager.author.po.RoleAuthorityPO;
import com.fctech.manager.author.vo.RoleAuthorityVO;
import com.fctech.manager.author.vo.UserVO;
import com.fctech.manager.common.service.BaseService;

/**
 * 
 * 角色权限服务接口
 * Created by joe on 15/6/24.
 *
 */
public interface CmRoleAuthorityService extends BaseService<RoleAuthorityPO,String> {

	public String queryAuthorityCodeByMenuAndRole(UserVO userInfoVo, String menuId) throws Exception;
	public String add(RoleAuthorityVO cmRoleAuthorityVo) throws Exception;

}