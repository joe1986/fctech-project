package com.fctech.manager.author.service.impl;

import com.fctech.manager.author.po.OperLogPO;
import com.fctech.manager.author.service.CmOperLogService;
import com.fctech.manager.author.vo.UserVO;
import com.fctech.manager.common.dao.BaseDao;
import com.fctech.manager.common.service.BaseServiceImpl;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;


/**
 * 
 * 操作日志服务接口实现
 * 
 * @author joe
 *
 */
public class CmOperLogServiceImpl extends BaseServiceImpl<OperLogPO, String>
		implements CmOperLogService {


	@Override
	protected BaseDao getBaseDao() {
		return null;
	}

	@Override
	public void updateOperLog(HttpServletRequest request) throws Exception {

	}

	@Override
	public void addVisitLog(HttpServletRequest request, UserVO userInfo, Map logMap) {

	}
}
