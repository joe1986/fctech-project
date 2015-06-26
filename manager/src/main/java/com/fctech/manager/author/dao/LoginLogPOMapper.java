package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.LoginLogPO;

public interface LoginLogPOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LoginLogPO record);

    int insertSelective(LoginLogPO record);

    LoginLogPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LoginLogPO record);

    int updateByPrimaryKey(LoginLogPO record);
}