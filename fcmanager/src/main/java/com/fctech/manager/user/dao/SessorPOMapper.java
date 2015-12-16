package com.fctech.manager.dao;

import com.fctech.manager.po.SessorPO;
import com.fctech.manager.po.SessorPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessorPOMapper {
    int countByExample(SessorPOExample example);

    int deleteByExample(SessorPOExample example);

    int deleteByPrimaryKey(Integer sensorid);

    int insert(SessorPO record);

    int insertSelective(SessorPO record);

    List<SessorPO> selectByExample(SessorPOExample example);

    SessorPO selectByPrimaryKey(Integer sensorid);

    int updateByExampleSelective(@Param("record") SessorPO record, @Param("example") SessorPOExample example);

    int updateByExample(@Param("record") SessorPO record, @Param("example") SessorPOExample example);

    int updateByPrimaryKeySelective(SessorPO record);

    int updateByPrimaryKey(SessorPO record);
}