package com.fctech.manager.common.base;

import java.util.Hashtable;

import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Session鐩戝惉鍣�瀹屾垚瀵筍eesion浼氳瘽璧勬簮鐨勫疄鏃剁洃鎺�
 * 
 * @author weizhao.dong
 * @see HttpSessionBindingListener
 */
public class SessionListener implements HttpSessionListener {

	private static Logger log = LoggerFactory.getLogger(SessionListener.class);
	/* private static PSEssionService pSEssionService; */
	// 闆嗗悎瀵硅薄锛屼繚瀛榮ession瀵硅薄鐨勫紩鐢�
	static Hashtable ht = new Hashtable();

	/**
	 * 瀹炵幇HttpSessionListener鎺ュ彛锛屽畬鎴恠ession鍒涘缓浜嬩欢鎺у埗
	 * 璇存槑锛氭鏃剁殑Session鐘舵�涓烘棤鏁堜細璇濓紝鍙
	 * 湁鐢ㄦ埛鎴愬姛鐧诲綍绯荤粺鍚庢墠灏嗘Session鍐欏叆EAHTTPSESSION琛ㄤ綔涓烘湁鏁圫ESSION鏉ョ鐞�
	 */
	public void sessionCreated(HttpSessionEvent event) {
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {

	}

}
