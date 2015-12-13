package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.UserInfoPO;
import com.fctech.manager.author.po.UserInfoPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoPOMapper {
    int countByExample(UserInfoPOExample example);

    int deleteByExample(UserInfoPOExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(UserInfoPO record);

    int insertSelective(UserInfoPO record);

    List<UserInfoPO> selectByExample(UserInfoPOExample example);

    UserInfoPO selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") UserInfoPO record, @Param("example") UserInfoPOExample example);

    int updateByExample(@Param("record") UserInfoPO record, @Param("example") UserInfoPOExample example);

    int updateByPrimaryKeySelective(UserInfoPO record);

    int updateByPrimaryKey(UserInfoPO record);
}