package by.grsu.oop.apacheAccessLog.objectConverters;

import by.grsu.oop.apacheAccessLog.model.Method;


public class MethodTextConverter {
	
	public String convertToText(Method method){
		
		return method.getMethod();
	}
	
}
