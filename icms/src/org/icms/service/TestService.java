package org.icms.service;

import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.icms.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TestService{
	private Log log = LogFactory.getLog(getClass());
	
	@Autowired
	private TestDao testDao;
	
	public void test(){
		//List<Integer> list = testDao.getSession().createSQLQuery("select bean.user_id from jc_user_role bean").list();
		log.info("test");
	}

}
