package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.UserRolePO;
import com.fctech.manager.author.po.UserRolePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRolePOMapper {
    int countByExample(UserRolePOExample example);

    int deleteByExample(UserRolePOExample example);

    int deleteByPrimaryKey(String authorityId);

    int insert(UserRolePO record);

    int insertSelective(UserRolePO record);

    List<UserRolePO> selectByExample(UserRolePOExample example);

    UserRolePO selectByPrimaryKey(String authorityId);

    int updateByExampleSelective(@Param("record") UserRolePO record, @Param("example") UserRolePOExample example);

    int updateByExample(@Param("record") UserRolePO record, @Param("example") UserRolePOExample example);

    int updateByPrimaryKeySelective(UserRolePO record);

    int updateByPrimaryKey(UserRolePO record);
}