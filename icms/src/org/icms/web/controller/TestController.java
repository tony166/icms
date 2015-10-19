package org.icms.web.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.icms.bean.TestBean;
import org.icms.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	public final Log log = LogFactory.getLog(getClass());
	
	@RequestMapping("/**/test")
	public String test(String viewName){
		testService.test();
		log.info("test log: " + (null == testBean ? null : testBean.getName()));
		return viewName;
	}

	private TestBean testBean;

	public TestBean getTestBean() {
		return testBean;
	}

	@Autowired
	public void setTestBean(TestBean testBean) {
		this.testBean = testBean;
	}
	
	@Autowired
	private TestService testService;
	
	
}
