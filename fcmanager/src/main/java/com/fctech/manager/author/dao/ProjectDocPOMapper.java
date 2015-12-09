package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.ProjectDocPO;

public interface ProjectDocPOMapper {
    int deleteByPrimaryKey(Integer projectdocId);

    int insert(ProjectDocPO record);

    int insertSelective(ProjectDocPO record);

    ProjectDocPO selectByPrimaryKey(Integer projectdocId);

    int updateByPrimaryKeySelective(ProjectDocPO record);

    int updateByPrimaryKey(ProjectDocPO record);
}