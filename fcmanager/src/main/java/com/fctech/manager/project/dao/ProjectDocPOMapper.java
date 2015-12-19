package com.fctech.manager.project.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fctech.manager.project.example.ProjectDocPOExample;
import com.fctech.manager.project.po.ProjectDocPO;

public interface ProjectDocPOMapper {
	int countByExample(ProjectDocPOExample example);

	int deleteByExample(ProjectDocPOExample example);

	int deleteByPrimaryKey(Integer projectdocId);

	int insert(ProjectDocPO record);

	int insertSelective(ProjectDocPO record);

	List<ProjectDocPO> selectByExample(ProjectDocPOExample example);

	ProjectDocPO selectByPrimaryKey(Integer projectdocId);

	int updateByExampleSelective(@Param("record") ProjectDocPO record,
			@Param("example") ProjectDocPOExample example);

	int updateByExample(@Param("record") ProjectDocPO record,
			@Param("example") ProjectDocPOExample example);

	int updateByPrimaryKeySelective(ProjectDocPO record);

	int updateByPrimaryKey(ProjectDocPO record);
}