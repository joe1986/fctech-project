package com.fctech.manager.author.service.impl;

import com.fctech.manager.author.po.AuthorityPO;
import com.fctech.manager.author.service.CmAuthorityService;
import com.fctech.manager.author.vo.AuthorityVO;
import com.fctech.manager.common.dao.BaseDao;
import com.fctech.manager.common.service.BaseServiceImpl;

/**
 * @author joe 2015-06-20
 */
public class CmAuthorityServiceImpl extends
		BaseServiceImpl<AuthorityPO, String> implements CmAuthorityService {

	@Override
	protected BaseDao getBaseDao() {
		return null;
	}

	@Override
	public boolean findByAuthorityNo(AuthorityVO cmAuthorityVo) throws Exception {
		return false;
	}
}
