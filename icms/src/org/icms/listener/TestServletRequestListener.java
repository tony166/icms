package org.icms.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class TestServletRequestListener implements ServletRequestListener{

	@Override
	public void requestDestroyed(ServletRequestEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event.getServletRequest() + "创建");
	}

	@Override
	public void requestInitialized(ServletRequestEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event.getServletRequest() + "销毁");

	}

}
