package com.fctech.manager.author.service.impl;


import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtils;

import com.cupdata.zicon.uccp.commons.dubbo.Request;
import com.cupdata.zicon.uccp.commons.dubbo.Response;
import com.cupdata.zicon.uccp.commons.dubbo.factory.ResponseFactory;
import com.cupdata.zicon.uccp.commons.utils.StringUtil;
import com.cupdata.zicon.uccp.arm.dao.TmccInfoDao;
import com.cupdata.zicon.uccp.arm.po.TmccInfoPO;
import com.cupdata.zicon.uccp.arm.service.TmccInfoService;


public class TmccInfoServiceImpl  implements TmccInfoService{

        private TmccInfoDao tmccInfoDao;
	
	    public void setTmccInfoDao(TmccInfoDao dao) {
		   this.tmccInfoDao = dao;
	     }

		

	    /**
	     * 增加
	     */
		@Override
		public Response<TmccInfoPO> add(Request<TmccInfoPO> request) throws Exception {
			TmccInfoPO tmccInfopo=new TmccInfoPO();
			if(StringUtil.isNotEmpty(request.getRequestData())){
				PropertyUtils.copyProperties(tmccInfopo, request.getRequestData());
				TmccInfoPO TmccInfoPO=new TmccInfoPO();
				PropertyUtils.copyProperties(TmccInfoPO, tmccInfoDao.insert(tmccInfopo));
				return ResponseFactory.getResponse(TmccInfoPO, request);
			}
			return null;
			
		}

		/**
		 * 删除
		 */
		@Override
		public void delete(Request<String> request) throws Exception {
			tmccInfoDao.deleteById(request.getRequestData());
		}
		
	    /**
	     * 修改
	     */
		@Override
		public Response<TmccInfoPO> update(Request<TmccInfoPO> request) throws Exception {
			TmccInfoPO tmccInfopo=new TmccInfoPO();
			if(StringUtil.isNotEmpty(request.getRequestData())){
				PropertyUtils.copyProperties(tmccInfopo, request.getRequestData());
				TmccInfoPO TmccInfoPO=new TmccInfoPO();
				PropertyUtils.copyProperties(TmccInfoPO, tmccInfoDao.update(tmccInfopo));
				return ResponseFactory.getResponse(TmccInfoPO, request);
			}
			return null;
		}
		
	    /**
	     * 查找
	     * @throws NoSuchMethodException 
	     * @throws InvocationTargetException 
	     * @throws IllegalAccessException 
	     */
		@Override
		public Response<TmccInfoPO> selectById(Request<String> request) throws Exception   {
			TmccInfoPO tmccInfopo=tmccInfoDao.selectById(request.getRequestData());
			if(StringUtil.isNotEmpty(tmccInfopo)){
				TmccInfoPO TmccInfoPO=new TmccInfoPO();
				PropertyUtils.copyProperties(TmccInfoPO, tmccInfopo);
				return ResponseFactory.getResponse(TmccInfoPO, request);
			}
			return null;
		}



		@Override
		public List<TmccInfoPO> selectMcc() {
			// TODO Auto-generated method stub
			return tmccInfoDao.findByStatementPostfix(".selectMCC", new String[]{}, new String[]{}, "", "");
		}
		

}
