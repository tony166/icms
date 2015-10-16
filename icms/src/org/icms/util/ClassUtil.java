package org.icms.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;

public class ClassUtil {
	
	public static Map<String, Object> getMethodPropertities(Object object){
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		Class<?> clazz = object.getClass();
		for (Method method : clazz.getMethods()){
			String methodName = method.getName();
			Class<?>[] paramtypes = method.getParameterTypes();
			if (paramtypes.length == 0 && methodName.startsWith("get") && methodName.length() > 3){
				String propertityName = methodName;
				propertityName = methodName.substring(3);
				propertityName = propertityName.substring(0, 1).toLowerCase() + propertityName.substring(1);
				try {
					Class<?> returnTypeClass = method.getReturnType();
					boolean validReturnClass = returnTypeClass.equals(int.class) 
							|| returnTypeClass.equals(String.class);
					validReturnClass = true;
					if (validReturnClass){
						Object returnValue = method.invoke(object);
						map.put(propertityName, returnValue);
					}
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return map;
	}

}
