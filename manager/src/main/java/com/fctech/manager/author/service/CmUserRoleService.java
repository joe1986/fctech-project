package com.fctech.manager.author.service;

import java.util.List;

import com.fctech.manager.author.po.UserRolePO;
import com.fctech.manager.author.vo.UserAccessVo;
import com.fctech.manager.author.vo.UserVO;
import com.fctech.manager.common.base.Dto;
import com.fctech.manager.common.base.TreeBeanVo;
import com.fctech.manager.common.service.BaseService;

/**
 * 
 * 用户角色服务接口
 * Created by joe on 15/6/24.
 *
 */
public interface CmUserRoleService extends BaseService<UserRolePO,String> {


	/**
	 * 查询用户关联的角色树
	 * @return
	 * @throws Exception
	 */
	public List<TreeBeanVo> getTree(UserVO userVO)throws Exception;
	/**
	 * 查询用户对应的角色是否具有审核权限
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public boolean  getUserRoleAuditFlag(String userId) throws Exception;

	//查询用户的所有角色ID
	public List<String> getUserRoleList(String userId) throws Exception;

	//查询用户的菜单及权限，URL检查时使用。
	public List<UserAccessVo> selectUserAccess(Dto dto) throws Exception;
}