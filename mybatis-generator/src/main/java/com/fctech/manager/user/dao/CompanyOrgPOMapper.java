package com.fctech.manager.user.dao;

import com.fctech.manager.user.po.CompanyOrgPO;
import com.fctech.manager.user.po.CompanyOrgPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyOrgPOMapper {
    int countByExample(CompanyOrgPOExample example);

    int deleteByExample(CompanyOrgPOExample example);

    int deleteByPrimaryKey(Integer organizationcodeId);

    int insert(CompanyOrgPO record);

    int insertSelective(CompanyOrgPO record);

    List<CompanyOrgPO> selectByExample(CompanyOrgPOExample example);

    CompanyOrgPO selectByPrimaryKey(Integer organizationcodeId);

    int updateByExampleSelective(@Param("record") CompanyOrgPO record, @Param("example") CompanyOrgPOExample example);

    int updateByExample(@Param("record") CompanyOrgPO record, @Param("example") CompanyOrgPOExample example);

    int updateByPrimaryKeySelective(CompanyOrgPO record);

    int updateByPrimaryKey(CompanyOrgPO record);
}