package com.fctech.manager.user.service;

import java.util.List;

import com.fctech.manager.common.base.TreeBeanVo;
import com.fctech.manager.user.exception.UserException;
import com.fctech.manager.user.vo.UserInfoVO;

public interface ILoginService {

	public void checkUserLogin(UserInfoVO vo) throws UserException, Exception;

	public List<TreeBeanVo> queryTree() throws UserException, Exception;
}
