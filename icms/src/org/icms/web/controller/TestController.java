package org.icms.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.icms.core.manager.DictionaryMng;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	public final Log log = LogFactory.getLog(getClass());
	
	@RequestMapping("/**/test")
	public String test(String viewName){
		dictionaryMng.testTransaction();
		return viewName;
	}
	
	@Autowired
	private DictionaryMng dictionaryMng;
	
	
}
