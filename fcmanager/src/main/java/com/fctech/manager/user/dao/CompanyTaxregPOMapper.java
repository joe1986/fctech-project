package com.fctech.manager.user.dao;

import com.fctech.manager.user.po.CompanyTaxregPO;
import com.fctech.manager.user.example.CompanyTaxregPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyTaxregPOMapper {
    int countByExample(CompanyTaxregPOExample example);

    int deleteByExample(CompanyTaxregPOExample example);

    int deleteByPrimaryKey(Integer taxregId);

    int insert(CompanyTaxregPO record);

    int insertSelective(CompanyTaxregPO record);

    List<CompanyTaxregPO> selectByExample(CompanyTaxregPOExample example);

    CompanyTaxregPO selectByPrimaryKey(Integer taxregId);

    int updateByExampleSelective(@Param("record") CompanyTaxregPO record, @Param("example") CompanyTaxregPOExample example);

    int updateByExample(@Param("record") CompanyTaxregPO record, @Param("example") CompanyTaxregPOExample example);

    int updateByPrimaryKeySelective(CompanyTaxregPO record);

    int updateByPrimaryKey(CompanyTaxregPO record);
}