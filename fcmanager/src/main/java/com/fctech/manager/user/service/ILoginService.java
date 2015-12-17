package com.fctech.manager.user.service;

import com.fctech.manager.user.VO.UserInfoVO;
import com.fctech.manager.user.exception.UserException;

public interface ILoginService {

	public void checkUserLogin(UserInfoVO vo) throws UserException, Exception;
}
