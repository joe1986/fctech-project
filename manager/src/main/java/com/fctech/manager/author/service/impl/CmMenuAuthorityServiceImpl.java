package com.fctech.manager.author.service.impl;


import com.fctech.manager.author.po.MenuAuthorPO;
import com.fctech.manager.author.service.CmMenuAuthorityService;
import com.fctech.manager.common.base.Dto;
import com.fctech.manager.common.dao.BaseDao;
import com.fctech.manager.common.service.BaseServiceImpl;
import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 * Created by joe on 15/6/24.
 */
public class CmMenuAuthorityServiceImpl extends BaseServiceImpl<MenuAuthorPO,String> implements CmMenuAuthorityService {


	@Override
	public void addAll(List<String> menuAuthoritys, String menuId) throws Exception {

	}

	@Override
	public String getAuthority(Dto dto) throws Exception {
		return null;
	}

	@Override
	protected BaseDao getBaseDao() {
		return null;
	}

	@Override
	public Integer count(String[] propertyNames, Object... propertyValues) {
		return null;
	}

	@Override
	public Integer count(Map<String, Object> map) {
		return null;
	}

	@Override
	public Integer countLikeByMap(String[] propertyNames, Object[] propertyValues) {
		return null;
	}

	@Override
	public Integer countByStatementPostfix(String statementPostfix, String[] properties, Object[] propertyValues) {
		return null;
	}

	@Override
	public Integer countByStatementPostfix(String statementPostfix, Map<String, Object> map) {
		return null;
	}

	@Override
	public MenuAuthorPO selectById(String s) {
		return null;
	}

	@Override
	public MenuAuthorPO selectByProperties(String propertie, Object values) {
		return null;
	}

	@Override
	public MenuAuthorPO selectByProperties(String[] properties, Object... values) {
		return null;
	}

	@Override
	public List<MenuAuthorPO> selectAll() {
		return null;
	}

	@Override
	public List<MenuAuthorPO> queryByPage(Map<String, Object> map) {
		return null;
	}

	@Override
	public List<MenuAuthorPO> queryByPage(Map<String, Object> map, RowBounds rowBounds) {
		return null;
	}

	@Override
	public List<MenuAuthorPO> queryByPage(String[] properties, Object[] propertyValues, RowBounds rowBounds) {
		return null;
	}

	@Override
	public List<MenuAuthorPO> selectByIds(List<String> strings) {
		return null;
	}

	@Override
	public MenuAuthorPO selectById(String properties, String values) {
		return null;
	}

	@Override
	public MenuAuthorPO selectById(String[] properties, Object... values) {
		return null;
	}

	@Override
	public List<String> findIdsByMap(String[] properties, Object[] propertyValues, String orderBy, String order) {
		return null;
	}

	@Override
	public List<MenuAuthorPO> findByMap(String[] properties, Object[] propertyValues, String orderBy, String order) {
		return null;
	}

	@Override
	public List<MenuAuthorPO> pageQueryByMap(String[] properties, Object[] propertyValues, String orderBy, String order, int pageSize, int pageNo) {
		return null;
	}

	@Override
	public List<String> pageQueryIdsByMap(String[] properties, Object[] propertyValues, String orderBy, String order, int pageSize, int pageNo) {
		return null;
	}

	@Override
	public List<MenuAuthorPO> pageLikeByMap(String[] properties, Object[] propertyValues, String orderBy, String order, int pageSize, int pageNo) {
		return null;
	}

	@Override
	public MenuAuthorPO insert(MenuAuthorPO entity) throws PersistenceException {
		return null;
	}

	@Override
	public MenuAuthorPO update(MenuAuthorPO entity) throws PersistenceException {
		return null;
	}

	@Override
	public int update(String s, String propertie, Object propertyValue) throws PersistenceException {
		return 0;
	}

	@Override
	public int update(String s, String[] properties, Object[] propertyValues) throws PersistenceException {
		return 0;
	}

	@Override
	public int updateByIdsMap(List<String> strings, String[] properties, Object[] propertyValues) throws PersistenceException {
		return 0;
	}

	@Override
	public void deleteById(String s) throws PersistenceException {

	}

	@Override
	public void deleteByIds(List<String> strings) throws PersistenceException {

	}

	@Override
	public void deleteByIdsMap(List<String> strings, String[] properties, Object[] propertyValues) throws PersistenceException {

	}

	@Override
	public int deleteByMap(String[] properties, Object[] propertyValues) throws PersistenceException {
		return 0;
	}

	@Override
	public List<MenuAuthorPO> findByStatementPostfix(String statementPostfix, String[] properties, Object[] propertyValues, String orderBy, String order) {
		return null;
	}

	@Override
	public List<MenuAuthorPO> findByStatementPostfix(String statementPostfix, Map<String, Object> map, String orderBy, String order) {
		return null;
	}

	@Override
	public MenuAuthorPO findOneByStatementPostfix(String statementPostfix, String[] properties, Object[] propertyValues, String orderBy, String order) {
		return null;
	}

	@Override
	public List<MenuAuthorPO> pageQueryByStatementPostfix(String statementPostfix, String[] properties, Object[] propertyValues, String orderBy, String order, int pageSize, int pageNo) {
		return null;
	}

	@Override
	public void updateByStatementPostfix(String statementPostfix, String[] properties, Object[] propertyValues) throws PersistenceException {

	}

	@Override
	public void deleteByStatementPostfix(String statementPostfix, String[] properties, Object[] propertyValues) throws PersistenceException {

	}

	@Override
	public void insertByStatementPostfix(String statementPostfix, String[] properties, Object[] propertyValues) throws PersistenceException {

	}
}
