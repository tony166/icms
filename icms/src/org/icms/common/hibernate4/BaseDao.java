package org.icms.common.hibernate4;

import java.io.Serializable;

public interface BaseDao <T extends Serializable>{
	
	/**
	 * 立即向数据库发出sql语句,没找到返回Null
	 * @since 1.0 
	 * @param id
	 * @return
	 * <br><b>作者： @author 朱瑞</b>
	 * <br>创建时间：2015年10月20日 下午3:41:31
	 */
	public T get(Serializable id);
	
	/**
	 * 延迟加载对象,没找到抛出异常
	 * @since 1.0 
	 * @param id
	 * @return
	 * <br><b>作者： @author 朱瑞</b>
	 * <br>创建时间：2015年10月20日 下午3:42:23
	 */
	public T load(Serializable id);
	
	public T save(T entity);
	
	public T update(T entity);
	
	public T delete(T entity);
	
	/**
	 * 根据id删除对象
	 * @since 1.0 
	 * @param id
	 * @return
	 * <br><b>作者： @author 朱瑞</b>
	 * <br>创建时间：2015年10月20日 下午3:48:36
	 */
	public T deleteById(Serializable id);
	
	
	
}
