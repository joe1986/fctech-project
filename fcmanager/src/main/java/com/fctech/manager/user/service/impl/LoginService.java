package com.fctech.manager.user.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.fctech.manager.common.base.SessionManage;
import com.fctech.manager.common.base.SessionUser;
import com.fctech.manager.user.vo.UserInfoVO;
import com.fctech.manager.user.dao.UserInfoPOMapper;
import com.fctech.manager.user.example.UserInfoPOExample;
import com.fctech.manager.user.exception.UserException;
import com.fctech.manager.user.po.UserInfoPO;
import com.fctech.manager.user.service.ILoginService;

@Service
public class LoginService implements ILoginService {

	@Resource
	private UserInfoPOMapper userInfoPOMapper;

	@Override
	public void checkUserLogin(UserInfoVO vo) throws UserException, Exception {
		if (vo == null) {
			throw new UserException(UserException.SYSTEM_ERROR);
		}
		if (StringUtils.isBlank(vo.getUsername())) {
			throw new UserException(UserException.USER_NAME_NULL);
		}
		if (StringUtils.isBlank(vo.getPassword())) {
			throw new UserException(UserException.USER_PASSWORD_NULL);
		}
		UserInfoPOExample example = new UserInfoPOExample();
		example.createCriteria().andUsernameEqualTo(vo.getUsername())
				.andPasswordEqualTo(vo.getPassword());
		List<UserInfoPO> list = userInfoPOMapper.selectByExample(example);
		if (CollectionUtils.isEmpty(list)) {
			throw new UserException(UserException.USER_NAME_OR_PASSWORD_ERROR);
		}

		UserInfoPO po = list.get(0);
		SessionUser sessionBean = new SessionUser();
		BeanUtils.copyProperties(po, sessionBean);
		SessionManage.setSessionUser(sessionBean);

	}

}
