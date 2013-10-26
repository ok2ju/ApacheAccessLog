package by.grsu.oop.apacheAccessLog.objectConverters;

import by.grsu.oop.apacheAccessLog.model.Error;

public class ErrorTextConverter {
	
	public String convertToText(Error error){
		
		return error.getError();
	}
	
}
