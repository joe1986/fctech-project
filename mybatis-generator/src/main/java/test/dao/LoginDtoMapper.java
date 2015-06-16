package test.dao;

import test.model.LoginDto;

public interface LoginDtoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LoginDto record);

    int insertSelective(LoginDto record);

    LoginDto selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LoginDto record);

    int updateByPrimaryKey(LoginDto record);
}