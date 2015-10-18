package org.icms.web.controller;

import  org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.icms.bean.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	public final Log log = LogFactory.getLog(getClass());
	
	@RequestMapping("/**/test.do")
	public String test(){
		log.info("test log: " + (null == testBean ? null : testBean.getName()));
		return "/test.jsp";
	}

	private TestBean testBean;

	public TestBean getTestBean() {
		return testBean;
	}

	@Autowired
	public void setTestBean(TestBean testBean) {
		this.testBean = testBean;
	}
	
	
}
