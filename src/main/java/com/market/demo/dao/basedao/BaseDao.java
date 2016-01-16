/*
 * Copyright (c)  2012, Newtouch
 * All rights reserved. 
 *
 * $id: BaseDao.java 9552 2012-7-8 上午01:11:03 WangLijun$
 */
package com.market.demo.dao.basedao;

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
 * Title:数据操作类
 * </p>
 * <p>
 * Description:该类支持SQL、HSQL等方式进行查询，用保存、查询、更新、分页等功能
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
	
	
	/**
	 * 根据Id查询对象
	 * @Title getById
	 * @param id
	 * @return T 返回类型
	 */
	public T getById(Long id);
	
	/***
	 * 
	 * @param obj
	 * @return
	 */
	public List<T> find(T obj);
	
	
	/***
	 * 
	 * @param id
	 * @return
	 */
	public T findByIdNoWaitLock(Long id);

	/**
	 * findAl()
	 * 
	 * @Title: findAll
	 * @Description: 查询所有对象
	 * @return List<T> 返回类型
	 */
	public List<T> findAll();
	
	/***
	 * TODO
	 * @param obj
	 */
	public void eagerLoad(T obj);
	
	/**
	 * TODO
	 * @param obj
	 */
	public void evict(T obj);
	
	/***
	 * 
	 * @param hql 
	 * @param params
	 * @return
	 */
	public int updateHQL( String hql, Map<String, ?> params);
	
	/***
	 * 
	 * @param queryName
	 * @param params
	 * @return
	 */
	public List<T> findByNamedQuery(String queryName, Map<String, ?> params);
	
	/***
	 * 强制进行从 Session缓存到数据库的同步，然后清除Session缓存，事务提交前默认会执行这个方法。
	 * setFlushMode(FlushMode flushMode)可以设置flush什么时候执行。
	 * FlushMode.Always|AUTO|COMMIT|NEVER|MANUAL Always:任何代码都会Flush AUTO:默认方式–自动 Commit:COMMIT时 Never:始终不 MANUAL:手动方式
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
	 * 
	 * @param entity
	 * @param lockMode
	 */
	public void lock(T entity, LockModeType lockModeType);
	/***
	 * 根据SQL和参数，统计当前记录总数
	 * @param countSql
	 * @param params
	 * @return
	 */
	public Long nativeQueryCountSQL(final String countSql,
			final Map<String, ?> params);
	
	/***
	 * 根据SQL语句进行分页查询
	 * @param sql SQL语句
	 * @param countSql 统计语句
	 * @param params 参数
	 * @param offsetIndex 当前页 
	 * @param pageSize 每页记录数
	 * @return
	 */
//	public PageResult<T> nativeQuerySQL(final String sql,
//			final String countSql, final Map<String, ?> params,
//			final int offsetIndex, final int pageSize);
	
	/***
	 * 根据SQL语句更新数据
	 * @param sql SQL语句
	 * @param params 参数
	 * @return int 更新记录数
	 */
	public int nativeUpdateSQL(final String sql, final Map<String, ?> params);

	/***
	 * 根据HQL，参数进行查询，
	 * @param hql  HQL语句
	 * @param params 参数 类型为<String,?>
	 * @return List<T>
	 */
	public List<T> query(String hql, Map<String, ?> params);

	/***
	 * 根据HQL、CountHQL,params,offsetIndex，pageSize参数，用户查询分页对象
	 * @param hql 查询HQL
	 * @param countHql 统计行数
	 * @param params 参数
	 * @param offsetIndex 当前页数
	 * @param pageSize  页面大小数据
	 * @return
	 */
//	public PageResult<T> query(String hql, String countHql,
//			Map<String, ?> params, int offsetIndex, int pageSize);

	/***
	 * 根据HQL、params的参数，用于计算返回查询的行数
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

	/**
	 * 先去数据库查询与参数object具有相同id的对象，
	 * 然后判断这个对象与参数object比较是否有改变，
	 * 如果有则产生Update语句把数据库记录更新为参数object的状态。
	 * 函数不会把参数object设置为持久态(就是说参数object不会被放到session缓存里)，
	 * 函数会返回一个新对象，这个返回的新对象跟参数object具有相同的属性，而且是持久态的。
	 * @param obj 查询对象
	 */
	public void mergeObject(T obj);
	
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
	 * 根据Model类返回该Model对象所有的数据 
	 * @param clazz 类对象
	 * @return List<T>
	 */
	public List<T> findEntityAll(Class<T> clazz);
	
	/***
	 * 
	 * @param queryName 查询名称
	 * @param params 参数
	 * @return int 返回更新数量
	 */
	public int updateByNamedQuery(String queryName, Map<String, ?> params);
	
	/**
	 * 更新对象 
	 * @param obj
	 */
	public void update(T obj);
	/***
	 * 更新对象和更新日期
	 * @param obj
	 * @param updateDate
	 */
	public void update(T obj, Date updateDate);
	
	/**
	 * 批理s更新对象 
	 * @param objs
	 */
	public void updateObjects(Collection<T> objs);
	/***
	 * 批理更新对象和更新日期
	 * @param objs
	 * @param updateDate
	 */
	public void updateObjects(Collection<T> objs, Date updateDate);
	
	
	/***
	 * 根据sequenceName获取序列的下一个值
	 * @param sequenceName
	 * @return
	 */
	public long getsSequenceNextval(String sequenceName);
	
	/***
	 * 根据schemaPattern,tableNamePattern获取表对象
	 * @param schemaPattern
	 * @param tableNamePattern
	 * @return List<String>
	 */
	public List<String> getTables(String schemaPattern, String tableNamePattern);
	
	
	/***
	 * 根据数据库表名称获取该表的所有列的名称
	 * @param tableName 数据库表名
	 * @return List<String> 返回表的列表名
	 */
	public List<String> getColumns(String tableName);
	
}
