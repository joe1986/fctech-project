package com.fctech.manager.project.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fctech.manager.business.example.ImagesPOExample;
import com.fctech.manager.business.po.ImagesPO;

public interface ImagesPOMapper {
	int countByExample(ImagesPOExample example);

	int deleteByExample(ImagesPOExample example);

	int deleteByPrimaryKey(Integer imageId);

	int insert(ImagesPO record);

	int insertSelective(ImagesPO record);

	List<ImagesPO> selectByExample(ImagesPOExample example);

	ImagesPO selectByPrimaryKey(Integer imageId);

	int updateByExampleSelective(@Param("record") ImagesPO record,
			@Param("example") ImagesPOExample example);

	int updateByExample(@Param("record") ImagesPO record,
			@Param("example") ImagesPOExample example);

	int updateByPrimaryKeySelective(ImagesPO record);

	int updateByPrimaryKey(ImagesPO record);
}