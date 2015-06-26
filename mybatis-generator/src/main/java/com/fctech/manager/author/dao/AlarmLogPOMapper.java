package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.AlarmLogPO;

public interface AlarmLogPOMapper {
    int deleteByPrimaryKey(Integer alartid);

    int insert(AlarmLogPO record);

    int insertSelective(AlarmLogPO record);

    AlarmLogPO selectByPrimaryKey(Integer alartid);

    int updateByPrimaryKeySelective(AlarmLogPO record);

    int updateByPrimaryKeyWithBLOBs(AlarmLogPO record);

    int updateByPrimaryKey(AlarmLogPO record);
}