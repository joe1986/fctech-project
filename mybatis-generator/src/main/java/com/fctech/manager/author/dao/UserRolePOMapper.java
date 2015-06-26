package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.UserRolePO;

public interface UserRolePOMapper {
    int deleteByPrimaryKey(String authorityId);

    int insert(UserRolePO record);

    int insertSelective(UserRolePO record);

    UserRolePO selectByPrimaryKey(String authorityId);

    int updateByPrimaryKeySelective(UserRolePO record);

    int updateByPrimaryKey(UserRolePO record);
}