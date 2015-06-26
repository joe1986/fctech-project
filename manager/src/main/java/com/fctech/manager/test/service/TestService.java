package com.fctech.manager.test.service;

import com.fctech.manager.common.exception.BusinessException;

/**
 * Created by joe on 15/6/24.
 */
public interface TestService {
    public void doBusiness(int type) throws BusinessException;
}
