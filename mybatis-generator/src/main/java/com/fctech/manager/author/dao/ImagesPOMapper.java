package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.ImagesPO;
import com.fctech.manager.author.po.ImagesPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImagesPOMapper {
    int countByExample(ImagesPOExample example);

    int deleteByExample(ImagesPOExample example);

    int deleteByPrimaryKey(Integer imageId);

    int insert(ImagesPO record);

    int insertSelective(ImagesPO record);

    List<ImagesPO> selectByExample(ImagesPOExample example);

    ImagesPO selectByPrimaryKey(Integer imageId);

    int updateByExampleSelective(@Param("record") ImagesPO record, @Param("example") ImagesPOExample example);

    int updateByExample(@Param("record") ImagesPO record, @Param("example") ImagesPOExample example);

    int updateByPrimaryKeySelective(ImagesPO record);

    int updateByPrimaryKey(ImagesPO record);
}