package org.icms.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.icms.util.RequestUtil;

public class TestServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestInfo1 = RequestUtil.printRequestInfo(request);
		ServletConfig config = this.getServletConfig();
		request.setAttribute("requestInfo1", requestInfo1);
		//String requestInfo2 = RequestUtil.printRequestInfoByClass(request);
		//request.setAttribute("requestInfo2", requestInfo2);
		System.out.println("TestServlet");
		request.getRequestDispatcher("/test.jsp").forward(request, response);
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public TestServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public String getServletInfo() {
		return "This is my default servlet created by Eclipse";
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
