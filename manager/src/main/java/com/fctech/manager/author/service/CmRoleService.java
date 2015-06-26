package com.fctech.manager.author.service;

import com.fctech.manager.author.po.RolePO;
import com.fctech.manager.author.vo.RoleVO;
import com.fctech.manager.common.service.BaseService;

/**
 * 
 * 角色服务接口
 * Created by joe on 15/6/24.
 *
 */
public interface CmRoleService extends BaseService<RolePO,String> {
	/**
	  * 根据部门编号跟角色名称查询角色存不存在
	  * @return
	  */
	 public boolean   findByName(RoleVO cmRoleVo)throws Exception;
 

}