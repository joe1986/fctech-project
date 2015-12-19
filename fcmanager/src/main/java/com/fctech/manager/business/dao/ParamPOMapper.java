package com.fctech.manager.business.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fctech.manager.business.example.ParamPOExample;
import com.fctech.manager.business.po.ParamPO;

public interface ParamPOMapper {
	int countByExample(ParamPOExample example);

	int deleteByExample(ParamPOExample example);

	int deleteByPrimaryKey(Integer parameterid);

	int insert(ParamPO record);

	int insertSelective(ParamPO record);

	List<ParamPO> selectByExample(ParamPOExample example);

	ParamPO selectByPrimaryKey(Integer parameterid);

	int updateByExampleSelective(@Param("record") ParamPO record,
			@Param("example") ParamPOExample example);

	int updateByExample(@Param("record") ParamPO record,
			@Param("example") ParamPOExample example);

	int updateByPrimaryKeySelective(ParamPO record);

	int updateByPrimaryKey(ParamPO record);
}