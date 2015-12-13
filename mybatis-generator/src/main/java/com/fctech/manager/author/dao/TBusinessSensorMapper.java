package com.fctech.manager.author.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBusinessSensorMapper {
    int countByExample(TBusinessSensorExample example);

    int deleteByExample(TBusinessSensorExample example);

    int deleteByPrimaryKey(Integer sensorid);

    int insert(TBusinessSensor record);

    int insertSelective(TBusinessSensor record);

    List<TBusinessSensor> selectByExample(TBusinessSensorExample example);

    TBusinessSensor selectByPrimaryKey(Integer sensorid);

    int updateByExampleSelective(@Param("record") TBusinessSensor record, @Param("example") TBusinessSensorExample example);

    int updateByExample(@Param("record") TBusinessSensor record, @Param("example") TBusinessSensorExample example);

    int updateByPrimaryKeySelective(TBusinessSensor record);

    int updateByPrimaryKey(TBusinessSensor record);
}