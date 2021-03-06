package com.fctech.manager.company.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fctech.manager.company.example.CompanyQualificationPOExample;
import com.fctech.manager.company.po.CompanyQualificationPO;

public interface CompanyQualificationPOMapper {
	int countByExample(CompanyQualificationPOExample example);

	int deleteByExample(CompanyQualificationPOExample example);

	int deleteByPrimaryKey(Integer qualificationId);

	int insert(CompanyQualificationPO record);

	int insertSelective(CompanyQualificationPO record);

	List<CompanyQualificationPO> selectByExample(
			CompanyQualificationPOExample example);

	CompanyQualificationPO selectByPrimaryKey(Integer qualificationId);

	int updateByExampleSelective(
			@Param("record") CompanyQualificationPO record,
			@Param("example") CompanyQualificationPOExample example);

	int updateByExample(@Param("record") CompanyQualificationPO record,
			@Param("example") CompanyQualificationPOExample example);

	int updateByPrimaryKeySelective(CompanyQualificationPO record);

	int updateByPrimaryKey(CompanyQualificationPO record);
}