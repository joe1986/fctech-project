package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.RoleReportPO;

public interface RoleReportPOMapper {
    int deleteByPrimaryKey(String id);

    int insert(RoleReportPO record);

    int insertSelective(RoleReportPO record);

    RoleReportPO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RoleReportPO record);

    int updateByPrimaryKey(RoleReportPO record);
}