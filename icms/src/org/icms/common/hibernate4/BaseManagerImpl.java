package org.icms.common.hibernate4;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseManagerImpl<T extends Serializable> implements BaseManager<T>{

	private BaseDao<T> baseDao;

	@Autowired
	protected void setBaseDao(BaseDao<T> baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public T get(Serializable id) {
		return baseDao.get(id);
	}

	@Override
	public T load(Serializable id) {
		return baseDao.load(id);
	}

	@Override
	public T save(T entity) {
		return baseDao.save(entity);
	}

	@Override
	public T update(T entity) {
		return baseDao.update(entity);
	}

	@Override
	public T delete(T entity) {
		return baseDao.delete(entity);
	}

	@Override
	public T deleteById(Serializable id) {
		return baseDao.deleteById(id);
	}
	
	
}
