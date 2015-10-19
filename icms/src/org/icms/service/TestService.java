package org.icms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.icms.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TestService implements Test{
	
	@Autowired
	private TestDao testDao;
	
	public void test(){
		List<Integer> list = testDao.getSession().createSQLQuery("select bean.user_id from jc_user_role bean").list();
	}

}
