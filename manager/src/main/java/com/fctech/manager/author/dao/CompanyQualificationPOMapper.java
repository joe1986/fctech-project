package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.CompanyQualificationPO;

public interface CompanyQualificationPOMapper {
    int deleteByPrimaryKey(Integer qualificationId);

    int insert(CompanyQualificationPO record);

    int insertSelective(CompanyQualificationPO record);

    CompanyQualificationPO selectByPrimaryKey(Integer qualificationId);

    int updateByPrimaryKeySelective(CompanyQualificationPO record);

    int updateByPrimaryKey(CompanyQualificationPO record);
}