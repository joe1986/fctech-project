package com.fctech.manager.common.base;

import com.mysql.jdbc.log.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Hashtable;
import java.util.Iterator;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;



/**
 * Session监听器 完成对Seesion会话资源的实时监控
 * 
 * @author weizhao.dong
 * @see HttpSessionBindingListener
 */
public class SessionListener implements HttpSessionListener {
	
	private static Logger log = LoggerFactory.getLogger(SessionListener.class);
	/*private static PSEssionService pSEssionService;*/
	// 集合对象，保存session对象的引用
	static Hashtable ht = new Hashtable();

	/**
	 * 实现HttpSessionListener接口，完成session创建事件控制
	 * 说明：此时的Session状态为无效会话，只有用户成功登录系统后才将此Session写入EAHTTPSESSION表作为有效SESSION来管理
	 */
	public void sessionCreated(HttpSessionEvent event) {
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {

	}


}
