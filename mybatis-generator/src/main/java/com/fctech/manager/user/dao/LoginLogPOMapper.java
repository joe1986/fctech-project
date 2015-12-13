package com.fctech.manager.user.dao;

import com.fctech.manager.user.po.LoginLogPO;
import com.fctech.manager.user.po.LoginLogPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginLogPOMapper {
    int countByExample(LoginLogPOExample example);

    int deleteByExample(LoginLogPOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LoginLogPO record);

    int insertSelective(LoginLogPO record);

    List<LoginLogPO> selectByExample(LoginLogPOExample example);

    LoginLogPO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LoginLogPO record, @Param("example") LoginLogPOExample example);

    int updateByExample(@Param("record") LoginLogPO record, @Param("example") LoginLogPOExample example);

    int updateByPrimaryKeySelective(LoginLogPO record);

    int updateByPrimaryKey(LoginLogPO record);
}