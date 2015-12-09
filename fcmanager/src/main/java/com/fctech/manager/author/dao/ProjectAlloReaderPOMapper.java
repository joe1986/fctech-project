package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.ProjectAlloReaderPO;

public interface ProjectAlloReaderPOMapper {
    int deleteByPrimaryKey(Integer projectReaderid);

    int insert(ProjectAlloReaderPO record);

    int insertSelective(ProjectAlloReaderPO record);

    ProjectAlloReaderPO selectByPrimaryKey(Integer projectReaderid);

    int updateByPrimaryKeySelective(ProjectAlloReaderPO record);

    int updateByPrimaryKey(ProjectAlloReaderPO record);
}