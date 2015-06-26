package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.UserPO;

public interface UserPOMapper {
    int deleteByPrimaryKey(String userid);

    int insert(UserPO record);

    int insertSelective(UserPO record);

    UserPO selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(UserPO record);

    int updateByPrimaryKey(UserPO record);
}