package com.fctech.manager.business.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fctech.manager.business.example.SessorPOExample;
import com.fctech.manager.business.po.SessorPO;

public interface SessorPOMapper {
	int countByExample(SessorPOExample example);

	int deleteByExample(SessorPOExample example);

	int deleteByPrimaryKey(Integer sensorid);

	int insert(SessorPO record);

	int insertSelective(SessorPO record);

	List<SessorPO> selectByExample(SessorPOExample example);

	SessorPO selectByPrimaryKey(Integer sensorid);

	int updateByExampleSelective(@Param("record") SessorPO record,
			@Param("example") SessorPOExample example);

	int updateByExample(@Param("record") SessorPO record,
			@Param("example") SessorPOExample example);

	int updateByPrimaryKeySelective(SessorPO record);

	int updateByPrimaryKey(SessorPO record);
}