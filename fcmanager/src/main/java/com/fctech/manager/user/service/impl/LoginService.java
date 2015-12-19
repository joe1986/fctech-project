package com.fctech.manager.user.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.fctech.manager.common.base.SessionManage;
import com.fctech.manager.common.base.SessionUser;
import com.fctech.manager.common.base.TreeBeanVo;
import com.fctech.manager.user.dao.TreeBeanVoMapper;
import com.fctech.manager.user.dao.UserInfoPOMapper;
import com.fctech.manager.user.example.UserInfoPOExample;
import com.fctech.manager.user.exception.UserException;
import com.fctech.manager.user.po.UserInfoPO;
import com.fctech.manager.user.service.ILoginService;
import com.fctech.manager.user.vo.UserInfoVO;

@Service
public class LoginService implements ILoginService {

	@Resource
	private UserInfoPOMapper userInfoPOMapper;

	@Resource
	private TreeBeanVoMapper treeBeanVoMapper;

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

	@Override
	public List<TreeBeanVo> queryTree() throws UserException, Exception {
		SessionUser user = SessionManage
				.getSessionUser(SessionManage.ADMIN_SESSION_KEY);

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userId", user.getUserid());
		params.put("leaf", "0");
		params.put("parentMenuId", "0");

		List<TreeBeanVo> parentTreeList = treeBeanVoMapper.listByMap(params);
		if (CollectionUtils.isNotEmpty(parentTreeList)) {
			for (TreeBeanVo vo : parentTreeList) {
				params.clear();
				params.put("userId", user.getUserid());
				params.put("leaf", "1");
				params.put("parentMenuId", vo.getMenuId());
				List<TreeBeanVo> childTreeList = treeBeanVoMapper
						.listByMap(params);
				vo.setChildren(childTreeList);

			}

		}
		user.setTreeBeanVoList(parentTreeList);
		return parentTreeList;
	}
}
