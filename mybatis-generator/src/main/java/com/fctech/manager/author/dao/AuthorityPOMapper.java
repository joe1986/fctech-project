package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.AuthorityPO;

public interface AuthorityPOMapper {
    int deleteByPrimaryKey(String authorityId);

    int insert(AuthorityPO record);

    int insertSelective(AuthorityPO record);

    AuthorityPO selectByPrimaryKey(String authorityId);

    int updateByPrimaryKeySelective(AuthorityPO record);

    int updateByPrimaryKey(AuthorityPO record);
}