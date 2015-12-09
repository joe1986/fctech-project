package com.fctech.manager.author.service.impl;


import com.fctech.manager.author.po.RolePO;
import com.fctech.manager.author.service.CmRoleService;
import com.fctech.manager.author.vo.RoleVO;
import com.fctech.manager.common.dao.BaseDao;
import com.fctech.manager.common.service.BaseServiceImpl;

/**
 * 
 *角色服务接口实现
 *  Created by joe on 15/6/24.
 *
 */
public class CmRoleServiceImpl extends BaseServiceImpl<RolePO,String> implements CmRoleService {


	@Override
	protected BaseDao getBaseDao() {
		return null;
	}

	@Override
	public boolean findByName(RoleVO cmRoleVo) throws Exception {
		return false;
	}
}
