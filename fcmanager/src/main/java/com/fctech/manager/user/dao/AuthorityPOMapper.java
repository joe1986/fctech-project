package com.fctech.manager.user.dao;

import com.fctech.manager.user.po.AuthorityPO;
import com.fctech.manager.user.example.AuthorityPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthorityPOMapper {
    int countByExample(AuthorityPOExample example);

    int deleteByExample(AuthorityPOExample example);

    int deleteByPrimaryKey(String authorityId);

    int insert(AuthorityPO record);

    int insertSelective(AuthorityPO record);

    List<AuthorityPO> selectByExample(AuthorityPOExample example);

    AuthorityPO selectByPrimaryKey(String authorityId);

    int updateByExampleSelective(@Param("record") AuthorityPO record, @Param("example") AuthorityPOExample example);

    int updateByExample(@Param("record") AuthorityPO record, @Param("example") AuthorityPOExample example);

    int updateByPrimaryKeySelective(AuthorityPO record);

    int updateByPrimaryKey(AuthorityPO record);
}