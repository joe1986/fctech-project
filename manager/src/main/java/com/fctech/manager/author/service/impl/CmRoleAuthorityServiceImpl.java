package com.fctech.manager.author.service.impl;


import java.util.ArrayList;
import java.util.List;

import com.fctech.manager.author.po.RoleAuthorityPO;
import com.fctech.manager.author.service.CmRoleAuthorityService;
import com.fctech.manager.author.vo.RoleAuthorityVO;
import com.fctech.manager.author.vo.UserVO;
import com.fctech.manager.common.dao.BaseDao;
import com.fctech.manager.common.service.BaseServiceImpl;

/**
 * 
 *角色权限服务接口实现
 * Created by joe on 15/6/24.
 */
public class CmRoleAuthorityServiceImpl extends BaseServiceImpl<RoleAuthorityPO,String> implements CmRoleAuthorityService {


	@Override
	protected BaseDao getBaseDao() {
		return null;
	}

	@Override
	public String queryAuthorityCodeByMenuAndRole(UserVO userInfoVo, String menuId) throws Exception {
		return null;
	}

	@Override
	public String add(RoleAuthorityVO cmRoleAuthorityVo) throws Exception {
		return null;
	}
}
