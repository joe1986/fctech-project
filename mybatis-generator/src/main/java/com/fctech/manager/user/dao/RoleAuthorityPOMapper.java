package com.fctech.manager.user.dao;

import com.fctech.manager.user.po.RoleAuthorityPO;
import com.fctech.manager.user.po.RoleAuthorityPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleAuthorityPOMapper {
    int countByExample(RoleAuthorityPOExample example);

    int deleteByExample(RoleAuthorityPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(RoleAuthorityPO record);

    int insertSelective(RoleAuthorityPO record);

    List<RoleAuthorityPO> selectByExample(RoleAuthorityPOExample example);

    RoleAuthorityPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RoleAuthorityPO record, @Param("example") RoleAuthorityPOExample example);

    int updateByExample(@Param("record") RoleAuthorityPO record, @Param("example") RoleAuthorityPOExample example);

    int updateByPrimaryKeySelective(RoleAuthorityPO record);

    int updateByPrimaryKey(RoleAuthorityPO record);
}