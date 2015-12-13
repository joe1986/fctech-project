package com.fctech.manager.user.dao;

import com.fctech.manager.user.po.OperLogPO;
import com.fctech.manager.user.po.OperLogPOExample;
import com.fctech.manager.user.po.OperLogPOWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperLogPOMapper {
    int countByExample(OperLogPOExample example);

    int deleteByExample(OperLogPOExample example);

    int deleteByPrimaryKey(Long operateId);

    int insert(OperLogPOWithBLOBs record);

    int insertSelective(OperLogPOWithBLOBs record);

    List<OperLogPOWithBLOBs> selectByExampleWithBLOBs(OperLogPOExample example);

    List<OperLogPO> selectByExample(OperLogPOExample example);

    OperLogPOWithBLOBs selectByPrimaryKey(Long operateId);

    int updateByExampleSelective(@Param("record") OperLogPOWithBLOBs record, @Param("example") OperLogPOExample example);

    int updateByExampleWithBLOBs(@Param("record") OperLogPOWithBLOBs record, @Param("example") OperLogPOExample example);

    int updateByExample(@Param("record") OperLogPO record, @Param("example") OperLogPOExample example);

    int updateByPrimaryKeySelective(OperLogPOWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OperLogPOWithBLOBs record);

    int updateByPrimaryKey(OperLogPO record);
}