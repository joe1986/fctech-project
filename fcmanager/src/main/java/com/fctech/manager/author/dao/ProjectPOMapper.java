package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.ProjectPO;

public interface ProjectPOMapper {
    int deleteByPrimaryKey(Integer projectId);

    int insert(ProjectPO record);

    int insertSelective(ProjectPO record);

    ProjectPO selectByPrimaryKey(Integer projectId);

    int updateByPrimaryKeySelective(ProjectPO record);

    int updateByPrimaryKey(ProjectPO record);
}