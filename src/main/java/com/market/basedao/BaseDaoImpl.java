/**
 * 
 */
package com.market.basedao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author LiXiaoHao
 *  * @param <T>
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
	
	private  Session session;
	
	
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
	 * ªÒ»°session
	 * @return
	 */
	protected  Session getSession(){
		if(session==null || !session.isOpen()){
			return sessionFactory.getCurrentSession();
//			return sessionFactory.openSession();
		}
		return session;
	}
	
	

	@SuppressWarnings("unchecked")
	public T findById(Long id) {
		// TODO Auto-generated method stub
		return (T)getSession().get(entityClazz, id);
	}


	public List<T> find(T obj) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("from ");
		sb.append(this.entityClazz.getSimpleName());
		
		session = getSession();
		
		Query query = getSession().createQuery(sb.toString());
		return query.list();
	}
	public int updateHQL(String hql, Map<String, ?> params) {
		// TODO Auto-generated method stub
		return 0;
	}
	public void flush() {
		// TODO Auto-generated method stub
		
	}
	public void clear() {
		// TODO Auto-generated method stub
		getSession().clear();
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
		getSession().save(obj);
	}
	public void saveObjects(Collection<T> objs) {
		// TODO Auto-generated method stub
		Session session = getSession();
		for(T obj:objs){
			session.save(obj);
		}
	}
	public void remove(T obj) {
		// TODO Auto-generated method stub
		getSession().delete(obj);
	}
	public void removeObjects(Collection<T> objs) {
		// TODO Auto-generated method stub
		Session session = getSession();
		for(T obj:objs){
			session.delete(obj);
		}
	}
	public List<T> findEntityAll(Class<T> clazz) {
		// TODO Auto-generated method stub
		return null;
	}
	public void update(T obj) {
		// TODO Auto-generated method stub
		session = getSession();
		try {
			session.update(obj);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public void updateObjects(Collection<T> objs) {
		// TODO Auto-generated method stub
		Session session = getSession();
		for(T obj:objs){
			session.update(obj);
		}
		
	}
	public long getsSequenceNextval(String sequenceName) {
		// TODO Auto-generated method stub
		return 0;
	}



}
