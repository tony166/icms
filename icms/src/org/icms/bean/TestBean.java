package org.icms.bean;

import org.springframework.stereotype.Service;

@Service
public class TestBean {
	
	private String name = "ÖìÈð";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
