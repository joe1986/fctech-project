package com.fctech.manager.user.dao;

import com.fctech.manager.user.po.DtuPO;
import com.fctech.manager.user.po.DtuPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtuPOMapper {
    int countByExample(DtuPOExample example);

    int deleteByExample(DtuPOExample example);

    int deleteByPrimaryKey(Integer dtuid);

    int insert(DtuPO record);

    int insertSelective(DtuPO record);

    List<DtuPO> selectByExample(DtuPOExample example);

    DtuPO selectByPrimaryKey(Integer dtuid);

    int updateByExampleSelective(@Param("record") DtuPO record, @Param("example") DtuPOExample example);

    int updateByExample(@Param("record") DtuPO record, @Param("example") DtuPOExample example);

    int updateByPrimaryKeySelective(DtuPO record);

    int updateByPrimaryKey(DtuPO record);
}