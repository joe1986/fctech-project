package com.fctech.manager.author.service;

import com.fctech.manager.author.po.MenuPO;
import com.fctech.manager.author.vo.MenuVO;
import com.fctech.manager.common.base.Dto;
import com.fctech.manager.common.service.BaseService;

import java.util.List;

/**
 * 
 * 菜单服务接口
 * Created by joe on 15/6/24.
 *
 */
public interface CmMenuService extends BaseService<MenuPO,String> {
	//----------------------------
	//加载一级菜单
	public List<MenuPO> getFirstMenu(Dto pDto);
	//加载子菜单
	public List<MenuPO> getAllMenuTree(Dto dto, boolean searchAuth);
	
	//----------------------------
 public List<MenuPO> getCardList(Dto dto); 
 public List<MenuPO> getCardTreeList(Dto pDto);
 /**
  * 获取菜单树
  * @param pDto
  * @return
  */
 public List<MenuPO>  getMenuTree(Dto pDto, boolean searchAuth);
 
 /**
  * 添加菜单
  * @param menuVO
  */
 public void add(MenuVO menuVO) throws Exception;
 
}