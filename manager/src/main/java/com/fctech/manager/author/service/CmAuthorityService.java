package com.fctech.manager.author.service;

import com.fctech.manager.author.po.AuthorityPO;
import com.fctech.manager.author.vo.AuthorityVO;
import com.fctech.manager.common.service.BaseService;

/**
 * 
 *功能权限服务接口
 * Created by joe on 15/6/24.
 *
 */
public interface CmAuthorityService extends BaseService<AuthorityPO,String> {

/**
 * 根据权限编码存不存在	
 * @param cmAuthorityVo
 * @return
 * @throws Exception
 */
 public boolean  findByAuthorityNo(AuthorityVO cmAuthorityVo) throws Exception;

}