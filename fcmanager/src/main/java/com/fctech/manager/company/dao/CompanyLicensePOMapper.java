package com.fctech.manager.company.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fctech.manager.company.example.CompanyLicensePOExample;
import com.fctech.manager.company.po.CompanyLicensePO;

public interface CompanyLicensePOMapper {
	int countByExample(CompanyLicensePOExample example);

	int deleteByExample(CompanyLicensePOExample example);

	int deleteByPrimaryKey(Integer businesslicenseId);

	int insert(CompanyLicensePO record);

	int insertSelective(CompanyLicensePO record);

	List<CompanyLicensePO> selectByExample(CompanyLicensePOExample example);

	CompanyLicensePO selectByPrimaryKey(Integer businesslicenseId);

	int updateByExampleSelective(@Param("record") CompanyLicensePO record,
			@Param("example") CompanyLicensePOExample example);

	int updateByExample(@Param("record") CompanyLicensePO record,
			@Param("example") CompanyLicensePOExample example);

	int updateByPrimaryKeySelective(CompanyLicensePO record);

	int updateByPrimaryKey(CompanyLicensePO record);
}