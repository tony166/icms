package org.icms.util;

import java.util.Map;

public class MapUtil {
	public static void printMap(Map<String, Object> map){
		for (String s : map.keySet()){
			System.out.println(s + ": " + map.get(s));
		}
	}
	
	public static String mapToHtmlString(Map<String, Object> map){
		StringBuilder sb = new StringBuilder("");
		for (String s : map.keySet()){
			sb.append("<b>" + s + "</b>: " + map.get(s) + "<br/>");
		}
		return sb.toString();
	}
}
