package com.fctech.manager.author.dao;

import com.fctech.manager.author.po.MenuAuthorPO;

public interface MenuAuthorPOMapper {
    int deleteByPrimaryKey(String id);

    int insert(MenuAuthorPO record);

    int insertSelective(MenuAuthorPO record);

    MenuAuthorPO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MenuAuthorPO record);

    int updateByPrimaryKey(MenuAuthorPO record);
}