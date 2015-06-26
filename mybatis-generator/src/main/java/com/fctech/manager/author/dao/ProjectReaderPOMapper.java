package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.ProjectReaderPO;

public interface ProjectReaderPOMapper {
    int deleteByPrimaryKey(Integer readerId);

    int insert(ProjectReaderPO record);

    int insertSelective(ProjectReaderPO record);

    ProjectReaderPO selectByPrimaryKey(Integer readerId);

    int updateByPrimaryKeySelective(ProjectReaderPO record);

    int updateByPrimaryKey(ProjectReaderPO record);
}