/*
 * Copyright (c)  2012, Newtouch
 * All rights reserved. 
 *
 * $id: BaseDao.java 9552 2012-7-8 上午01:11:03 WangLijun$
 */
package com.market.basedao;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.LockModeType;

import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * Title:数据操作�?
 * </p>
 * <p>
 * Description:该类支持SQL、HSQL等方式进行查询，用保存�?查询、更新�?分页等功�?
 * </p>
 * <p>
 * Copyright: Copyright (c) 2012
 * </p>
 * <p>
 * Company: Newtouch
 * </p>
 * 
 * @author WangLijun
 * @version 1.0
 */
public interface BaseDao<T> extends Serializable {
	
	
	/***
	 * 
	 * findById 根据Id查询对象
	 * 
	 * @Title: findById
	 * @Description: 根据Id查询对象
	 * @param @param id Long
	 * @param @return 设定文件
	 * @return T 返回类型
	 */
	public T findById(Long id);
	
	
	
	/***
	 * 
	 * @param obj
	 * @return
	 */
	public List<T> find(T obj);
	


	/**
	 * findAl()
	 * 
	 * @Title: findAll
	 * @Description: 查询�?��对象
	 * @return List<T> 返回类型
	 */
	public List<T> findAll();
	
	
	/***
	 * 
	 * @param hql 
	 * @param params
	 * @return
	 */
	public int updateHQL( String hql, Map<String, ?> params);
	

	
	/***
	 * 强制进行�?Session缓存到数据库的同步，然后清除Session缓存，事务提交前默认会执行这个方法�?
	 * setFlushMode(FlushMode flushMode)可以设置flush�?��时�?执行�?
	 * FlushMode.Always|AUTO|COMMIT|NEVER|MANUAL Always:任何代码都会Flush AUTO:默认方式–自�?Commit:COMMIT�?Never:始终�?MANUAL:手动方式
	 */
	public void flush();
	
	/***
	* @Title:强制清除Session缓存
	* @Description: 清除缓存数据
	* @param  设定文件
	* @return void 返回类型
	 */
	public void clear();
	
	

	/***
	 * 根据SQL和参数，统计当前记录总数
	 * @param countSql
	 * @param params
	 * @return
	 */
	public Long nativeQueryCountSQL(final String countSql,
			final Map<String, ?> params);
	
	/***
	 * 根据SQL语句更新数据
	 * @param sql SQL语句
	 * @param params 参数
	 * @return int 更新记录�?
	 */
	public int nativeUpdateSQL(final String sql, final Map<String, ?> params);

	/***
	 * 根据HQL，参数进行查询，
	 * @param hql  HQL语句
	 * @param params 参数 类型�?String,?>
	 * @return List<T>
	 */
	public List<T> query(String hql, Map<String, ?> params);


	/***
	 * 根据HQL、params的参数，用于计算返回查询的行�?
	 * @param countHql
	 * @param params
	 * @return int
	 */
	public Long queryCount(String countHql, Map<String, ?> params);

	/**
	 * 用于保存对象
	 * @param obj为T对象
	 */
	public void save(T obj);
	

	/**
	 * 用于保存集合对象
	 * saveObjects
	 * @param objs Collection<T>
	 */
	public void saveObjects(Collection<T> objs);

	
	/***
	 * 删除对象
	 * @param obj 对象
	 */
	public void remove(T obj);
	/***
	 * 
	 * @param objs
	 */
	public void removeObjects(Collection<T> objs);
	
	/***
	 * 根据Model类返回该Model对象�?��的数�?
	 * @param clazz 类对�?
	 * @return List<T>
	 */
	public List<T> findEntityAll(Class<T> clazz);
	
	
	/**
	 * 更新对象 
	 * @param obj
	 */
	public void update(T obj);
	
	/**
	 * 批理s更新对象 
	 * @param objs
	 */
	public void updateObjects(Collection<T> objs);
	
	
	/***
	 * 根据sequenceName获取序列的下�?���?
	 * @param sequenceName
	 * @return
	 */
	public long getsSequenceNextval(String sequenceName);
	
	
}
