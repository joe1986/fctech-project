package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.CompanyLicensePO;

public interface CompanyLicensePOMapper {
    int deleteByPrimaryKey(Integer businesslicenseId);

    int insert(CompanyLicensePO record);

    int insertSelective(CompanyLicensePO record);

    CompanyLicensePO selectByPrimaryKey(Integer businesslicenseId);

    int updateByPrimaryKeySelective(CompanyLicensePO record);

    int updateByPrimaryKey(CompanyLicensePO record);
}