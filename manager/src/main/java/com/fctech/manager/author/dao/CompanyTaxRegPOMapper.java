package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.CompanyTaxRegPO;

public interface CompanyTaxRegPOMapper {
    int deleteByPrimaryKey(Integer taxregId);

    int insert(CompanyTaxRegPO record);

    int insertSelective(CompanyTaxRegPO record);

    CompanyTaxRegPO selectByPrimaryKey(Integer taxregId);

    int updateByPrimaryKeySelective(CompanyTaxRegPO record);

    int updateByPrimaryKey(CompanyTaxRegPO record);
}