package org.icms.core.manager.impl;

import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.icms.common.hibernate4.BaseManagerImpl;
import org.icms.core.entity.Dictionary;
import org.icms.core.manager.DictionaryMng;
import org.springframework.stereotype.Service;

@Service
public class DictionaryMngImpl extends BaseManagerImpl<Dictionary> implements DictionaryMng{
	public final Log log = LogFactory.getLog(getClass());
	
	@Override
	public void testTransaction() {
		Dictionary bean = new Dictionary("test1", "测试1");
		bean = save(bean);
		bean = new Dictionary("test2", "测2");
		int a = 1;
		if (a == 1){
			throw new RuntimeException("test");
		}
		bean = save(bean);
		log.info("bean.id: " + bean.getId());		
	}

}
