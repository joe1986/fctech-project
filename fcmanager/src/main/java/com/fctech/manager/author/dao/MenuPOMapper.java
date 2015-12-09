package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.MenuPO;

public interface MenuPOMapper {
    int deleteByPrimaryKey(String menuId);

    int insert(MenuPO record);

    int insertSelective(MenuPO record);

    MenuPO selectByPrimaryKey(String menuId);

    int updateByPrimaryKeySelective(MenuPO record);

    int updateByPrimaryKey(MenuPO record);
}