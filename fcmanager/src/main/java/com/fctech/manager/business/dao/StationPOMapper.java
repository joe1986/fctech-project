package com.fctech.manager.business.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fctech.manager.business.example.StationPOExample;
import com.fctech.manager.business.po.StationPO;

public interface StationPOMapper {
	int countByExample(StationPOExample example);

	int deleteByExample(StationPOExample example);

	int deleteByPrimaryKey(Integer stationid);

	int insert(StationPO record);

	int insertSelective(StationPO record);

	List<StationPO> selectByExample(StationPOExample example);

	StationPO selectByPrimaryKey(Integer stationid);

	int updateByExampleSelective(@Param("record") StationPO record,
			@Param("example") StationPOExample example);

	int updateByExample(@Param("record") StationPO record,
			@Param("example") StationPOExample example);

	int updateByPrimaryKeySelective(StationPO record);

	int updateByPrimaryKey(StationPO record);
}