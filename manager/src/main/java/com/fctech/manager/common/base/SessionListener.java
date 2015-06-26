package com.fctech.manager.common.base;

import java.util.Hashtable;
import java.util.Iterator;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.cupdata.zicon.uccp.arm.service.PSEssionService;
import com.cupdata.zicon.uccp.arm.vo.UserInfoVo;
import com.cupdata.zicon.uccp.common.util.G4Utils;

/**
 * Session监听器 完成对Seesion会话资源的实时监控
 * 
 * @author weizhao.dong
 * @see HttpSessionBindingListener
 */
public class SessionListener implements HttpSessionListener {
	
	private static Log log = LogFactory.getLog(SessionListener.class);
	private static PSEssionService pSEssionService;
	// 集合对象，保存session对象的引用
	static Hashtable ht = new Hashtable();

	/**
	 * 实现HttpSessionListener接口，完成session创建事件控制
	 * 说明：此时的Session状态为无效会话，只有用户成功登录系统后才将此Session写入EAHTTPSESSION表作为有效SESSION来管理
	 */
	public void sessionCreated(HttpSessionEvent event) {
	}

	/**
	 * 实现HttpSessionListener接口，完成session销毁事件控制
	 */
	public void sessionDestroyed(HttpSessionEvent event) {
		HttpSession session = event.getSession();
		SessionContainer sessionContainer =  (SessionContainer)session.getAttribute("SessionContainer");
		try {
			if(sessionContainer.getUserInfo()!=null){
				pSEssionService.delete(new String[]{"sessionid","username"}, 
						new Object[]{session.getId(),sessionContainer.getUserInfo().getLoginName()});
			}
		} catch (Exception e) {
			log.info("删除Session记录失败 " + G4Utils.getCurrentTime());
		}
		sessionContainer.setUserInfo(null); //配合RequestFilter进行拦截
		sessionContainer.cleanUp();
		ht.remove(session.getId());
		log.info("销毁了一个Session连接:" + session.getId() + " " + G4Utils.getCurrentTime());
	}
	
	/**
	 * 增加一个有效Session
	 * @param session
	 */
	static public void addSession(HttpSession session, UserInfoVo userInfo) {
		ht.put(session.getId(), session);
		try {
			pSEssionService.add(userInfo);
		} catch (Exception e) {
			log.info("新增Session记录失败 " + G4Utils.getCurrentTime());
		}
	}

	/**
	 * 返回全部session对象集合
	 * @return
	 */
	static public Iterator getSessions() {
		return ht.values().iterator();
	}

	/**
	 * 依据session id返回指定的session对象
	 * @param sessionId
	 * @return
	 */
	static public HttpSession getSessionByID(String sessionId) {
		return (HttpSession) ht.get(sessionId);
	}

	public static void setpSEssionService(PSEssionService pSEssionService) {
		SessionListener.pSEssionService = pSEssionService;
	}
	
	
}
