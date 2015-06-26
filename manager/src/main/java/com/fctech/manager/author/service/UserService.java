package com.fctech.manager.author.service;

import com.fctech.manager.common.exception.BusinessException;

/**
 * Created by joe on 15/6/24.
 */
public interface UserService {
    public void doBusiness(int type ) throws BusinessException;
}
