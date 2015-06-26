package com.fctech.manager.author.service.impl;

import com.fctech.manager.author.po.UserPO;
import com.fctech.manager.author.service.CmUserService;
import com.fctech.manager.author.vo.UserVO;
import com.fctech.manager.common.dao.BaseDao;
import com.fctech.manager.common.service.BaseServiceImpl;

/**
 * 
 *用户服务接口实现
 *  Created by joe on 15/6/24.
 *
 */
public class CmUserServiceImpl extends BaseServiceImpl<UserPO,String> implements CmUserService {


	@Override
	protected BaseDao getBaseDao() {
		return null;
	}

	@Override
	public boolean findByName(UserVO cmUserVo) {
		return false;
	}
}
