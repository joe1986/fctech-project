package com.fctech.manager.dao;

import com.fctech.manager.po.FormulaPO;
import com.fctech.manager.po.FormulaPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FormulaPOMapper {
    int countByExample(FormulaPOExample example);

    int deleteByExample(FormulaPOExample example);

    int deleteByPrimaryKey(Integer formulaid);

    int insert(FormulaPO record);

    int insertSelective(FormulaPO record);

    List<FormulaPO> selectByExample(FormulaPOExample example);

    FormulaPO selectByPrimaryKey(Integer formulaid);

    int updateByExampleSelective(@Param("record") FormulaPO record, @Param("example") FormulaPOExample example);

    int updateByExample(@Param("record") FormulaPO record, @Param("example") FormulaPOExample example);

    int updateByPrimaryKeySelective(FormulaPO record);

    int updateByPrimaryKey(FormulaPO record);
}