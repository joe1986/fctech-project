package com.fctech.manager.user.dao;

import com.fctech.manager.user.po.MenuAuthorityPO;
import com.fctech.manager.user.example.MenuAuthorityPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuAuthorityPOMapper {
    int countByExample(MenuAuthorityPOExample example);

    int deleteByExample(MenuAuthorityPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(MenuAuthorityPO record);

    int insertSelective(MenuAuthorityPO record);

    List<MenuAuthorityPO> selectByExample(MenuAuthorityPOExample example);

    MenuAuthorityPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MenuAuthorityPO record, @Param("example") MenuAuthorityPOExample example);

    int updateByExample(@Param("record") MenuAuthorityPO record, @Param("example") MenuAuthorityPOExample example);

    int updateByPrimaryKeySelective(MenuAuthorityPO record);

    int updateByPrimaryKey(MenuAuthorityPO record);
}