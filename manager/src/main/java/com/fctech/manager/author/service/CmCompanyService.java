package com.fctech.manager.author.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.fctech.manager.author.po.CompanyPO;
import com.fctech.manager.author.vo.CompanyVO;
import com.fctech.manager.common.service.BaseService;

/**
 * 
 * 公司管理服务接口
 * @author weizhao.dong
 *
 */
public interface CmCompanyService extends BaseService<CompanyPO,String> {

	/**
	 * 查找母公司
	 * @return
	 */
 public List<CompanyPO> findParent(HttpServletRequest request);
 /**
  * 查询公司名称存不存在
  * @param companyVO
  * @return
  */
 public boolean   findByName(CompanyVO companyVO) throws Exception;

 public CompanyPO selectByCode(String companyCode) throws Exception;
 
}