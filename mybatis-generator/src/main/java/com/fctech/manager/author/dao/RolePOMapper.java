package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.RolePO;
import com.fctech.manager.author.po.RolePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePOMapper {
    int countByExample(RolePOExample example);

    int deleteByExample(RolePOExample example);

    int deleteByPrimaryKey(String roleId);

    int insert(RolePO record);

    int insertSelective(RolePO record);

    List<RolePO> selectByExample(RolePOExample example);

    RolePO selectByPrimaryKey(String roleId);

    int updateByExampleSelective(@Param("record") RolePO record, @Param("example") RolePOExample example);

    int updateByExample(@Param("record") RolePO record, @Param("example") RolePOExample example);

    int updateByPrimaryKeySelective(RolePO record);

    int updateByPrimaryKey(RolePO record);
}