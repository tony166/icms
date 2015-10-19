package org.icms.web.tag;

import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TestTag extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
		JspContext jspContext = getJspContext();
		jspContext.getOut().append("Hello World");
	}

}
