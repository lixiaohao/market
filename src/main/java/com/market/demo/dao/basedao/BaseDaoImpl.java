/**
 * 
 */
package com.market.demo.dao.basedao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.LockModeType;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author LiXiaoHao
 * @param <T>
 *
 */
public class BaseDaoImpl<T> implements BaseDao<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Class<T> entityClazz;
//	@Autowired
	private SessionFactory sessionFactory;
	
//	private  Session session;
	
	
	/**
	 * @param sessionFactory
	 */
	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		Type type = getClass().getGenericSuperclass();  
        if (type instanceof ParameterizedType) {  
            this.entityClazz = (Class<T>) ((ParameterizedType) type).getActualTypeArguments()[0];  
        } else {  
            this.entityClazz = null;  
        }  
	}
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {  
        this.sessionFactory = sessionFactory;  
    }
	
	/****
	 * ��ȡsession
	 * @return
	 */
	protected  Session getSession(){
//		if(session==null || !session.isOpen()){
//			return sessionFactory.getCurrentSession();
//		}
		return sessionFactory.getCurrentSession();
	}
	
	

	@SuppressWarnings("unchecked")
	public T findById(Long id) {
		// TODO Auto-generated method stub
		Transaction  transaction = null;
		transaction = getSession().beginTransaction();
		return (T)getSession().get(entityClazz, id);
	}

	public T getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> find(T obj) {
		// TODO Auto-generated method stub
		return null;
	}

	public T findByIdNoWaitLock(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("from ");
		sb.append(this.entityClazz.getSimpleName());
		
//		Transaction  transaction = null;
		Session session = getSession();
//		 transaction = session.beginTransaction();
		
		Query query = getSession().createQuery(sb.toString());
		return query.list();
	}

	public void eagerLoad(T obj) {
		// TODO Auto-generated method stub
		
	}

	public void evict(T obj) {
		// TODO Auto-generated method stub
		
	}

	public int updateHQL(String hql, Map<String, ?> params) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<T> findByNamedQuery(String queryName, Map<String, ?> params) {
		// TODO Auto-generated method stub
		return null;
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public void lock(T entity, LockModeType lockModeType) {
		// TODO Auto-generated method stub
		
	}

	public Long nativeQueryCountSQL(String countSql, Map<String, ?> params) {
		// TODO Auto-generated method stub
		return null;
	}

	public int nativeUpdateSQL(String sql, Map<String, ?> params) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<T> query(String hql, Map<String, ?> params) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long queryCount(String countHql, Map<String, ?> params) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(T obj) {
		// TODO Auto-generated method stub
		
	}

	public void saveObjects(Collection<T> objs) {
		// TODO Auto-generated method stub
		
	}

	public void mergeObject(T obj) {
		// TODO Auto-generated method stub
		
	}

	public void remove(T obj) {
		// TODO Auto-generated method stub
		
	}

	public void removeObjects(Collection<T> objs) {
		// TODO Auto-generated method stub
		
	}

	public List<T> findEntityAll(Class<T> clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByNamedQuery(String queryName, Map<String, ?> params) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void update(T obj) {
		// TODO Auto-generated method stub
		
	}

	public void update(T obj, Date updateDate) {
		// TODO Auto-generated method stub
		
	}

	public void updateObjects(Collection<T> objs) {
		// TODO Auto-generated method stub
		
	}

	public void updateObjects(Collection<T> objs, Date updateDate) {
		// TODO Auto-generated method stub
		
	}

	public long getsSequenceNextval(String sequenceName) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<String> getTables(String schemaPattern, String tableNamePattern) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> getColumns(String tableName) {
		// TODO Auto-generated method stub
		return null;
	}

}
