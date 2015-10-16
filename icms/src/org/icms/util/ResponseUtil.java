package org.icms.util;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

public class ResponseUtil {
	
	public static void printResponseInfo(HttpServletResponse response){
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		response.getCharacterEncoding();
		response.getBufferSize();
		response.getContentType();
		response.getStatus();
		int notFountd = response.SC_NOT_FOUND;
	}

}
