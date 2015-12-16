package com.fctech.manager.user.dao;



import com.fctech.manager.user.example.AlarmLogPOExample;
import com.fctech.manager.user.po.AlarmLogPO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AlarmLogPOMapper {
    int countByExample(AlarmLogPOExample example);

    int deleteByExample(AlarmLogPOExample example);

    int deleteByPrimaryKey(Integer alartid);

    int insert(AlarmLogPO record);

    int insertSelective(AlarmLogPO record);

    List<AlarmLogPO> selectByExampleWithBLOBs(AlarmLogPOExample example);

    List<AlarmLogPO> selectByExample(AlarmLogPOExample example);

    AlarmLogPO selectByPrimaryKey(Integer alartid);

    int updateByExampleSelective(@Param("record") AlarmLogPO record, @Param("example") AlarmLogPOExample example);

    int updateByExampleWithBLOBs(@Param("record") AlarmLogPO record, @Param("example") AlarmLogPOExample example);

    int updateByExample(@Param("record") AlarmLogPO record, @Param("example") AlarmLogPOExample example);

    int updateByPrimaryKeySelective(AlarmLogPO record);

    int updateByPrimaryKeyWithBLOBs(AlarmLogPO record);

    int updateByPrimaryKey(AlarmLogPO record);
}