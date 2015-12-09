package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.OperLogPO;
import com.fctech.manager.author.po.OperLogPOWithBLOBs;

public interface OperLogPOMapper {
    int deleteByPrimaryKey(Integer operateId);

    int insert(OperLogPOWithBLOBs record);

    int insertSelective(OperLogPOWithBLOBs record);

    OperLogPOWithBLOBs selectByPrimaryKey(Integer operateId);

    int updateByPrimaryKeySelective(OperLogPOWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OperLogPOWithBLOBs record);

    int updateByPrimaryKey(OperLogPO record);
}