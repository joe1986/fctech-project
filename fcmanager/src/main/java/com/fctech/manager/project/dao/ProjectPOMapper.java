package com.fctech.manager.project.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fctech.manager.project.example.ProjectPOExample;
import com.fctech.manager.project.po.ProjectPO;

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