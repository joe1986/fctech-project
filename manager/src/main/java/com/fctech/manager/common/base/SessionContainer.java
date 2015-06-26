package com.fctech.manager.common.base;

import java.io.Serializable;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

import com.fctech.manager.author.vo.UserVO;


/**
 * Session容器
 * 
 * @see HttpSessionBindingListener
 */
public class SessionContainer implements HttpSessionBindingListener, Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 登陆用户对象
     */
    private UserVO userInfo;

    /**
     * 报表对象集
     */
    private Dto reportDto;


    public SessionContainer() {
        super();
        reportDto = new BaseDto();
    }


    /**
     * 清除会话容器缓存对象
     */
    public void cleanUp() {
        // userInfo不能在此批量重置,只能使用setUserInfo(null)方法对其进行独立操作
        // userInfo = null;
        reportDto.clear();
    }


    public void valueBound(HttpSessionBindingEvent event) {
        // System.out.println("会话创建了");
    }


    public void valueUnbound(HttpSessionBindingEvent event) {
        // System.out.println("会话销魂了");
    }


    /**
     * 获取用户会话对象
     * 
     * @return UserInfo
     */
    public UserVO getUserInfo() {
        return userInfo;
    }


    /**
     * 设置用户会话对象
     * 
     * @param userInfo
     */
    public void setUserInfo(UserVO userInfo) {
        this.userInfo = userInfo;

    }


    public Dto getReportDto() {
        return reportDto;
    }


    public void setReportDto(Dto reportDto) {
        this.reportDto = reportDto;
    }

}
