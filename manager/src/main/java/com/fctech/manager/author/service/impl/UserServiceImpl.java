package com.fctech.manager.author.service.impl;

import com.fctech.manager.author.service.UserService;
import com.fctech.manager.common.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

/**
 * Created by joe on 15/6/24.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    protected MessageSource messageSource;

    @Override
    public void doBusiness( int type ) throws BusinessException {
       switch (type){
           case 1:
                throw new BusinessException(null,"0001",null);
           case 2:
               throw new BusinessException(null,"0002","无异常体，自定义系统异常");
           case 3:
               throw new BusinessException(new Exception(),"0003",null);
           case 4:
               throw new BusinessException(new Exception(),"0004","有异常体，自定义系统异常");
           case 5:
               throw new BusinessException(null,messageSource,"0005",null);
           case 6:
               throw new BusinessException(null,messageSource,"0006","尽管有messagesource， 无异常体，自定义业务异常");
           case 7:
               throw new BusinessException(new Exception(),messageSource,"0007",null);
           case 8:
               throw new BusinessException(new Exception(),messageSource,"0008","尽管有messagesource，有异常体，自定义业务异常");
           default:
               break;
       }
    }
}
