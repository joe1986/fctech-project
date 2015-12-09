package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.RolePO;

public interface RolePOMapper {
    int deleteByPrimaryKey(String roleId);

    int insert(RolePO record);

    int insertSelective(RolePO record);

    RolePO selectByPrimaryKey(String roleId);

    int updateByPrimaryKeySelective(RolePO record);

    int updateByPrimaryKey(RolePO record);
}