package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.MenuInternationalPO;

public interface MenuInternationalPOMapper {
    int deleteByPrimaryKey(String id);

    int insert(MenuInternationalPO record);

    int insertSelective(MenuInternationalPO record);

    MenuInternationalPO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MenuInternationalPO record);

    int updateByPrimaryKey(MenuInternationalPO record);
}