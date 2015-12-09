package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.CompanyPO;

public interface CompanyPOMapper {
    int deleteByPrimaryKey(Integer companyId);

    int insert(CompanyPO record);

    int insertSelective(CompanyPO record);

    CompanyPO selectByPrimaryKey(Integer companyId);

    int updateByPrimaryKeySelective(CompanyPO record);

    int updateByPrimaryKey(CompanyPO record);
}