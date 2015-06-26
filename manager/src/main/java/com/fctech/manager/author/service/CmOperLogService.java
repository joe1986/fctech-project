package com.fctech.manager.author.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.fctech.manager.author.po.OperLogPO;
import com.fctech.manager.author.vo.UserVO;
import com.fctech.manager.common.service.BaseService;

/**
 * 
 * 操作日志服务接口
 * Created by joe on 15/6/24.
 *
 */
public interface CmOperLogService extends BaseService<OperLogPO,String> {

// public void addOperLog(HttpServletRequest request, SessionContainer sessionContainer)throws Exception;
	
	public void updateOperLog(HttpServletRequest request)throws Exception;
	
	public void addVisitLog(HttpServletRequest request, UserVO userInfo, Map logMap);

}