package org.icms.util;

import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import javax.servlet.http.HttpServletRequest;

public class RequestUtil {
	
	public static String printRequestInfoByClass(HttpServletRequest request) {
		Map<String, Object> map = ClassUtil.getMethodPropertities(request);
		MapUtil.printMap(map);
		return MapUtil.mapToHtmlString(map);
	}
	
	public static String printRequestInfo(HttpServletRequest request) {
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		String contextPath = request.getContextPath();
		String servletPath = request.getServletPath();
		String pathInfo = request.getPathInfo();
		String url = request.getRequestURL().toString();
		String uri = request.getRequestURI();
		String queryString = request.getQueryString();
		String localAddr = request.getLocalAddr();
		int localPort = request.getLocalPort();
		String remoteAddr = request.getRemoteAddr();
		int remotePort = request.getRemotePort();
		String serverName = request.getServerName();
		int severPort = request.getServerPort();
		String scheme = request.getScheme();
		String authType = request.getAuthType();
		String characterEncoding = request.getCharacterEncoding();
		String contentType = request.getContentType();
		int contentLength = request.getContentLength();
		String localName = request.getLocalName();
		String method = request.getMethod();
		String pathTransLated = request.getPathTranslated();
		String protocol = request.getProtocol();
		String remoteUser = request.getRemoteUser();
		String requestedSessionId = request.getRequestedSessionId();
		ServletContext servletContext = request.getServletContext();
		map.put("servletContext", servletContext); 
		map.put("servletContext.getFilterRegistration(\"TestFilter\")", servletContext.getFilterRegistration("TestFilter")); 
		map.put("servletContext.getServletRegistration(\"TestServlet\")", servletContext.getServletRegistration("TestServlet")); 
		map.put("servletContext.getInitParameter(\"name\")", servletContext.getInitParameter("name")); 
		map.put("servletContext.getInitParameterNames()", getServletContextInitParamNames(request)); 
		map.put("servletContext.getEffectiveMajorVersion()", servletContext.getEffectiveMajorVersion()); 
		map.put("servletContext.getEffectiveMinorVersion()", servletContext.getEffectiveMinorVersion()); 
		map.put("servletContext.getMajorVersion()", servletContext.getMajorVersion()); 
		map.put("servletContext.getMajorVersion()", servletContext.getMinorVersion()); 
		map.put("servletContext.getServletContextName()(web.xml中display-name)", servletContext.getServletContextName()); 
		map.put("servletContext.getRealPath(\"\")", servletContext.getRealPath("")); 
		map.put("servletContext.getRealPath(\"/\")", servletContext.getRealPath("/")); 
		map.put("servletContext.getContextPath()", servletContext.getContextPath()); 
		map.put("servletContext.getServerInfo()", servletContext.getServerInfo()); 
		map.put("ServletContext.ORDERED_LIBS", ServletContext.ORDERED_LIBS); 
		map.put("ServletContext.TEMPDIR", ServletContext.TEMPDIR);
		map.put("remoteUser", remoteUser);
		map.put("requestedSessionId", requestedSessionId);
		map.put("method", method);
		map.put("pathTransLated", pathTransLated);
		map.put("protocol(具体的协议)", protocol);
		map.put("scheme(协议)", scheme);
		map.put("characterEncoding", characterEncoding);
		map.put("contentType", contentType);
		map.put("contentLength", contentLength);
		map.put("authType", authType);
		map.put("contextPath", contextPath);
		map.put("servletPath", servletPath);
		map.put("pathInfo", pathInfo);
		map.put("url", url);
		map.put("uri", uri);
		map.put("queryString", queryString);
		map.put("remoteAddr(客户端IP地址)", remoteAddr);
		map.put("remotePort(客户端端口)", remotePort);
		map.put("localAddr(服务器IP地址)", localAddr);
		map.put("localPort(服务器端口号)", localPort);
		map.put("localName", localName);
		map.put("serverName(服务器域名)", serverName);
		map.put("severPort(服务器端口号)", severPort);
		//MapUtil.printMap(map);
		return MapUtil.mapToHtmlString(map);
	}
	
	public static String getServletContextInitParamNames(HttpServletRequest request){
		Enumeration<String> paramNames = request.getServletContext().getInitParameterNames();
		StringBuilder sb = new StringBuilder("");
		while (paramNames.hasMoreElements()){
			sb.append(paramNames.nextElement() + ",");
		}
		return sb.toString();
	} 
	
	public static String getServletRegistrationInfo(HttpServletRequest request){
		ServletRegistration  servletRegistration = request.getServletContext().getServletRegistration("TestServlet");
		return servletRegistration.toString();
	} 
	
}
