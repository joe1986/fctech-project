package com.fctech.manager.author.service;

import com.fctech.manager.author.po.UserPO;
import com.fctech.manager.author.vo.UserVO;
import com.fctech.manager.common.service.BaseService;

/**
 * 
 * 用户服务接口
 * Created by joe on 15/6/24.
 *
 */
public interface CmUserService extends BaseService<UserPO,String> {

	/**
	 * 查询用户名存不存在
	 * @return
	 */
	public boolean   findByName(UserVO cmUserVo);

}