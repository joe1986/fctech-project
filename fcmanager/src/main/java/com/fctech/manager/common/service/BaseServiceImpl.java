package com.fctech.manager.common.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.fctech.manager.common.dao.BaseDao;
import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by joe on 15/6/24.
 */
public abstract class BaseServiceImpl<E, PK extends Serializable> implements
		BaseService<E, PK> {

	protected Logger log = LoggerFactory.getLogger(BaseServiceImpl.class);

	protected abstract BaseDao getBaseDao();

/*	public Integer count(String propertyName, Object propertyValue) {
		// TODO Auto-generated method stub
		return getBaseDao().count(propertyName, propertyValue);
	}*/

	public Integer count(String[] propertyNames, Object... propertyValues) {
		return getBaseDao().count(propertyNames, propertyValues);
	}

	public Integer count(Map<String,Object> map){
		return getBaseDao().count(map);
	}
	public Integer countLikeByMap(String[] propertyNames,
			Object[] propertyValues) {
		// TODO Auto-generated method stub
		return getBaseDao().countLikeByMap(propertyNames, propertyValues);
	}

	public Integer countByStatementPostfix(String statementPostfix,
			String[] properties, Object[] propertyValues) {
		// TODO Auto-generated method stub
		return getBaseDao().countByStatementPostfix(statementPostfix,
				properties, propertyValues);
	}
	/** 根据自定义SqlMap中的条件语句查询出记录数量 */
	public Integer countByStatementPostfix(String statementPostfix,Map<String,Object> map){
			return getBaseDao().countByStatementPostfix(statementPostfix, map);
	}

	public E selectById(PK id) {
		// TODO Auto-generated method stub
		return (E) getBaseDao().selectById(id);
	}

	public E selectById(String properties, String values){
		return (E) getBaseDao().selectById(properties, values);
	}
    
	public E selectById(String[] properties, Object... values){
		return (E) getBaseDao().selectById(properties, values);
	}
	
	public E selectByProperties(String propertie, Object values) {
		return (E) getBaseDao().selectByProperties(propertie, values);
	}

	public E selectByProperties(String[] properties, Object... values) {
		// TODO Auto-generated method stub
		return (E) getBaseDao().selectByProperties(properties, values);
	}

	public List<E> selectAll() {
		// TODO Auto-generated method stub
		return getBaseDao().selectAll();
	}
	public List<E> queryByPage(Map<String,Object> map){
		return getBaseDao().queryByPage(map);
	}
	@Override
	public List<E> queryByPage(Map<String,Object> map, RowBounds rowBounds) {
		return getBaseDao().queryByPage(map, rowBounds);
	}
	@Override
	public List<E> queryByPage(String[] properties, Object[] propertyValues,RowBounds rowBounds){
		return getBaseDao().queryByPage(properties, propertyValues, rowBounds);
	}

	public List<E> selectByIds(List<PK> ids) {
		// TODO Auto-generated method stub
		return getBaseDao().selectByIds(ids);
	}

	public List<PK> findIdsByMap(String[] properties, Object[] propertyValues,
			String orderBy, String order) {
		// TODO Auto-generated method stub
		return getBaseDao().findIdsByMap(properties, propertyValues, orderBy,
				order);
	}

	public List<E> findByMap(String[] properties, Object[] propertyValues,
			String orderBy, String order) {
		// TODO Auto-generated method stub
		return getBaseDao().findByMap(properties, propertyValues, orderBy,
				order);
	}

	public List<E> pageQueryByMap(String[] properties, Object[] propertyValues,
			String orderBy, String order, int pageSize, int pageNo) {
		// TODO Auto-generated method stub
		return getBaseDao().pageQueryByMap(properties, propertyValues, orderBy,
				order, pageSize, pageNo);
	}

	public List<PK> pageQueryIdsByMap(String[] properties,
			Object[] propertyValues, String orderBy, String order,
			int pageSize, int pageNo) {
		// TODO Auto-generated method stub
		return getBaseDao().pageQueryIdsByMap(properties, propertyValues,
				orderBy, order, pageSize, pageNo);
	}

	public List<E> pageLikeByMap(String[] properties, Object[] propertyValues,
			String orderBy, String order, int pageSize, int pageNo) {
		// TODO Auto-generated method stub
		return getBaseDao().pageLikeByMap(properties, propertyValues, orderBy,
				order, pageSize, pageNo);
	}

	public E insert(E entity) throws PersistenceException {
		// TODO Auto-generated method stub
		return (E) getBaseDao().insert(entity);
	}

	public E update(E entity) throws PersistenceException {
		// TODO Auto-generated method stub
		return (E) getBaseDao().update(entity);
	}

	public int update(PK id, String propertie, Object propertyValue)
			throws PersistenceException {
		// TODO Auto-generated method stub
		return getBaseDao().update(id, propertie, propertyValue);
	}

	public int update(PK id, String[] properties, Object[] propertyValues)
			throws PersistenceException {
		// TODO Auto-generated method stub
		return getBaseDao().update(id, properties, propertyValues);
	}

	public int updateByIdsMap(List<PK> ids, String[] properties,
			Object[] propertyValues) throws PersistenceException {
		// TODO Auto-generated method stub
		return getBaseDao().updateByIdsMap(ids, properties, propertyValues);
	}

	public void deleteById(PK id) throws PersistenceException {
		// TODO Auto-generated method stub
		getBaseDao().deleteById(id);
	}

	public void deleteByIds(List<PK> ids) throws PersistenceException {
		// TODO Auto-generated method stub
		getBaseDao().deleteByIds(ids);
	}

	public void deleteByIdsMap(List<PK> ids, String[] properties,
			Object[] propertyValues) throws PersistenceException {
		getBaseDao().deleteByIdsMap(ids, properties, propertyValues);

	}

	public int deleteByMap(String[] properties, Object[] propertyValues)
			throws PersistenceException {
		// TODO Auto-generated method stub
		return getBaseDao().deleteByMap(properties, propertyValues);
	}

	public List<E> findByStatementPostfix(String statementPostfix,
			String[] properties, Object[] propertyValues, String orderBy,
			String order) {
		// TODO Auto-generated method stub
		return getBaseDao().findByStatementPostfix(statementPostfix,
				properties, propertyValues, orderBy, order);
	}

	 /**
     * 根据自定义SqlMap中的条件语句查询出列表
     */
    public List<E> findByStatementPostfix(String statementPostfix, Map<String,Object> map, String orderBy, String order)throws PersistenceException{
    	// TODO Auto-generated method stub
    return getBaseDao().findByStatementPostfix(statementPostfix,
    		map, orderBy, order);
    }
    
	public E findOneByStatementPostfix(String statementPostfix,
			String[] properties, Object[] propertyValues, String orderBy,
			String order) {
		// TODO Auto-generated method stub
		return (E) getBaseDao().findOneByStatementPostfix(statementPostfix,
				properties, propertyValues, orderBy, order);
	}

	public List<E> pageQueryByStatementPostfix(String statementPostfix,
			String[] properties, Object[] propertyValues, String orderBy,
			String order, int pageSize, int pageNo) {
		// TODO Auto-generated method stub
		return getBaseDao().pageQueryByStatementPostfix(statementPostfix,
				properties, propertyValues, orderBy, order, pageSize, pageNo);
	}

	public void updateByStatementPostfix(String statementPostfix,
			String[] properties, Object[] propertyValues)
			throws PersistenceException {
		// TODO Auto-generated method stub
		getBaseDao().updateByStatementPostfix(statementPostfix, properties,
				propertyValues);
	}

	public void deleteByStatementPostfix(String statementPostfix,
			String[] properties, Object[] propertyValues)
			throws PersistenceException {
		// TODO Auto-generated method stub
		getBaseDao().deleteByStatementPostfix(statementPostfix, properties,
				propertyValues);
	}

	public void insertByStatementPostfix(String statementPostfix,
			String[] properties, Object[] propertyValues)
			throws PersistenceException {
		getBaseDao().insertByStatementPostfix(statementPostfix, properties,
				propertyValues);

	}

}
