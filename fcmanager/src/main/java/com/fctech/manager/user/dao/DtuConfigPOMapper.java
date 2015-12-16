package com.fctech.manager.dao;

import com.fctech.manager.po.DtuConfigPO;
import com.fctech.manager.po.DtuConfigPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtuConfigPOMapper {
    int countByExample(DtuConfigPOExample example);

    int deleteByExample(DtuConfigPOExample example);

    int deleteByPrimaryKey(Integer terminalconfigid);

    int insert(DtuConfigPO record);

    int insertSelective(DtuConfigPO record);

    List<DtuConfigPO> selectByExample(DtuConfigPOExample example);

    DtuConfigPO selectByPrimaryKey(Integer terminalconfigid);

    int updateByExampleSelective(@Param("record") DtuConfigPO record, @Param("example") DtuConfigPOExample example);

    int updateByExample(@Param("record") DtuConfigPO record, @Param("example") DtuConfigPOExample example);

    int updateByPrimaryKeySelective(DtuConfigPO record);

    int updateByPrimaryKey(DtuConfigPO record);
}