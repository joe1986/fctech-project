package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.CompanyORGCodePO;

public interface CompanyORGCodePOMapper {
    int deleteByPrimaryKey(Integer organizationcodeId);

    int insert(CompanyORGCodePO record);

    int insertSelective(CompanyORGCodePO record);

    CompanyORGCodePO selectByPrimaryKey(Integer organizationcodeId);

    int updateByPrimaryKeySelective(CompanyORGCodePO record);

    int updateByPrimaryKey(CompanyORGCodePO record);
}