package com.fctech.manager.company.dao;

import com.fctech.manager.company.example.CompanyPOExample;
import com.fctech.manager.company.po.CompanyPO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyPOMapper {
    int countByExample(CompanyPOExample example);

    int deleteByExample(CompanyPOExample example);

    int deleteByPrimaryKey(Long companyId);

    int insert(CompanyPO record);

    int insertSelective(CompanyPO record);

    List<CompanyPO> selectByExample(CompanyPOExample example);

    CompanyPO selectByPrimaryKey(Long companyId);

    int updateByExampleSelective(@Param("record") CompanyPO record, @Param("example") CompanyPOExample example);

    int updateByExample(@Param("record") CompanyPO record, @Param("example") CompanyPOExample example);

    int updateByPrimaryKeySelective(CompanyPO record);

    int updateByPrimaryKey(CompanyPO record);
}