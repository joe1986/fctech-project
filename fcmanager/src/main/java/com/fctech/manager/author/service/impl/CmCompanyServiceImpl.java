package com.fctech.manager.author.service.impl;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.fctech.manager.author.po.CompanyPO;
import com.fctech.manager.author.service.CmCompanyService;
import com.fctech.manager.author.vo.CompanyVO;
import com.fctech.manager.common.dao.BaseDao;
import com.fctech.manager.common.service.BaseServiceImpl;

/**
 * 公司信息管理
 * @author joe 2015-06-20
 */

public class CmCompanyServiceImpl extends BaseServiceImpl<CompanyPO,String> implements CmCompanyService {

	@Override
	protected BaseDao getBaseDao() {
		return null;
	}

	@Override
	public List<CompanyPO> findParent(HttpServletRequest request) {
		return null;
	}

	@Override
	public boolean findByName(CompanyVO companyVO) throws Exception {
		return false;
	}

	@Override
	public CompanyPO selectByCode(String companyCode) throws Exception {
		return null;
	}
}
