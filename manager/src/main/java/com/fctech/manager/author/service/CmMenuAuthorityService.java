package com.fctech.manager.author.service;

import java.util.List;

import com.fctech.manager.author.po.MenuAuthorPO;
import com.fctech.manager.common.base.Dto;
import com.fctech.manager.common.service.BaseService;

/**
 * 
 * 菜单功能权限服务接口
 * Created by joe on 15/6/24.
 *
 */
public interface CmMenuAuthorityService extends BaseService<MenuAuthorPO,String> {

 /**
  *根据Id批量添加
  * @param menuAuthoritys
  */
public void addAll(List<String> menuAuthoritys, String menuId) throws Exception;
/**
 * 查询菜单关联的权限信息
 * @param dto
 * @return
 * @throws Exception
 */
public String getAuthority(Dto dto)throws Exception;
}