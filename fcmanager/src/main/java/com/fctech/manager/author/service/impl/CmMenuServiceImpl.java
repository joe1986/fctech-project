package com.fctech.manager.author.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.fctech.manager.author.po.MenuPO;
import com.fctech.manager.author.service.CmMenuService;
import com.fctech.manager.author.vo.MenuVO;
import com.fctech.manager.common.base.Dto;
import com.fctech.manager.common.dao.BaseDao;
import com.fctech.manager.common.service.BaseServiceImpl;

/**
 * 
 *菜单服务接口实现
 * @author joe
 *
 */
public class CmMenuServiceImpl extends BaseServiceImpl<MenuPO, String>
		implements CmMenuService {


	@Override
	protected BaseDao getBaseDao() {
		return null;
	}

	@Override
	public List<MenuPO> getFirstMenu(Dto pDto) {
		return null;
	}

	@Override
	public List<MenuPO> getAllMenuTree(Dto dto, boolean searchAuth) {
		return null;
	}

	@Override
	public List<MenuPO> getCardList(Dto dto) {
		return null;
	}

	@Override
	public List<MenuPO> getCardTreeList(Dto pDto) {
		return null;
	}

	@Override
	public List<MenuPO> getMenuTree(Dto pDto, boolean searchAuth) {
		return null;
	}

	@Override
	public void add(MenuVO menuVO) throws Exception {

	}
}
