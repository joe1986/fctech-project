package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.RoleAuthorityPO;

public interface RoleAuthorityPOMapper {
    int deleteByPrimaryKey(String id);

    int insert(RoleAuthorityPO record);

    int insertSelective(RoleAuthorityPO record);

    RoleAuthorityPO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RoleAuthorityPO record);

    int updateByPrimaryKey(RoleAuthorityPO record);
}