package com.fctech.manager.author.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.fctech.manager.author.po.UserRolePO;
import com.fctech.manager.author.service.CmUserRoleService;
import com.fctech.manager.author.vo.UserAccessVo;
import com.fctech.manager.author.vo.UserVO;
import com.fctech.manager.common.base.Dto;
import com.fctech.manager.common.base.TreeBeanVo;
import com.fctech.manager.common.dao.BaseDao;
import com.fctech.manager.common.service.BaseServiceImpl;

/**
 * 
 * 用户角色服务接口实现
 * 
 *  Created by joe on 15/6/24.
 *
 */
public class CmUserRoleServiceImpl extends BaseServiceImpl<UserRolePO, String>
		implements CmUserRoleService {


	@Override
	protected BaseDao getBaseDao() {
		return null;
	}

	@Override
	public List<TreeBeanVo> getTree(UserVO userVO) throws Exception {
		return null;
	}

	@Override
	public boolean getUserRoleAuditFlag(String userId) throws Exception {
		return false;
	}

	@Override
	public List<String> getUserRoleList(String userId) throws Exception {
		return null;
	}

	@Override
	public List<UserAccessVo> selectUserAccess(Dto dto) throws Exception {
		return null;
	}
}
