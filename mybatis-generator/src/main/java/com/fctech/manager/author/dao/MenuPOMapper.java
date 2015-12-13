package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.MenuPO;
import com.fctech.manager.author.po.MenuPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuPOMapper {
    int countByExample(MenuPOExample example);

    int deleteByExample(MenuPOExample example);

    int deleteByPrimaryKey(String menuId);

    int insert(MenuPO record);

    int insertSelective(MenuPO record);

    List<MenuPO> selectByExample(MenuPOExample example);

    MenuPO selectByPrimaryKey(String menuId);

    int updateByExampleSelective(@Param("record") MenuPO record, @Param("example") MenuPOExample example);

    int updateByExample(@Param("record") MenuPO record, @Param("example") MenuPOExample example);

    int updateByPrimaryKeySelective(MenuPO record);

    int updateByPrimaryKey(MenuPO record);
}