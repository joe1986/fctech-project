package com.fctech.manager.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fctech.manager.user.example.ProjectPOExample;
import com.fctech.manager.user.po.ProjectPO;

public interface ProjectPOMapper {
	int countByExample(ProjectPOExample example);

	int deleteByExample(ProjectPOExample example);

	int deleteByPrimaryKey(Integer projectId);

	int insert(ProjectPO record);

	int insertSelective(ProjectPO record);

	List<ProjectPO> selectByExample(ProjectPOExample example);

	ProjectPO selectByPrimaryKey(Integer projectId);

	int updateByExampleSelective(@Param("record") ProjectPO record,
			@Param("example") ProjectPOExample example);

	int updateByExample(@Param("record") ProjectPO record,
			@Param("example") ProjectPOExample example);

	int updateByPrimaryKeySelective(ProjectPO record);

	int updateByPrimaryKey(ProjectPO record);
}