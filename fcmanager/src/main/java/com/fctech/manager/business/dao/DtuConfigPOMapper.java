package com.fctech.manager.business.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fctech.manager.business.example.DtuConfigPOExample;
import com.fctech.manager.business.po.DtuConfigPO;

public interface DtuConfigPOMapper {
	int countByExample(DtuConfigPOExample example);

	int deleteByExample(DtuConfigPOExample example);

	int deleteByPrimaryKey(Integer terminalconfigid);

	int insert(DtuConfigPO record);

	int insertSelective(DtuConfigPO record);

	List<DtuConfigPO> selectByExample(DtuConfigPOExample example);

	DtuConfigPO selectByPrimaryKey(Integer terminalconfigid);

	int updateByExampleSelective(@Param("record") DtuConfigPO record,
			@Param("example") DtuConfigPOExample example);

	int updateByExample(@Param("record") DtuConfigPO record,
			@Param("example") DtuConfigPOExample example);

	int updateByPrimaryKeySelective(DtuConfigPO record);

	int updateByPrimaryKey(DtuConfigPO record);
}