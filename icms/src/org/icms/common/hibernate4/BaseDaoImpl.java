package org.icms.common.hibernate4;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseDaoImpl<T extends Serializable> implements BaseDao<T>{
	private SessionFactory sessionFactory;
	private Class<T> persistentClass;
	
	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	private Session getSession(){
		  return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(Serializable id) {
		return (T) getSession().get(persistentClass, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T load(Serializable id) {
		return (T) getSession().load(persistentClass, id);
	}

	@Override
	public T save(T entity) {
		getSession().save(entity);
		return entity ;
	}

	@Override
	public T update(T entity) {
		getSession().update(entity);
		return entity;
	}

	@Override
	public T delete(T entity) {
		getSession().delete(entity);
		return entity;
	}

	@Override
	public T deleteById(Serializable id) {
		T entity = this.load(id);
		getSession().delete(entity);
		return entity;
	}

}
