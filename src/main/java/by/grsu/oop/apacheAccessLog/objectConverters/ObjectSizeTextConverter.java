package by.grsu.oop.apacheAccessLog.objectConverters;

import by.grsu.oop.apacheAccessLog.model.ObjectSize;

public class ObjectSizeTextConverter {
	
	public String convertToText(ObjectSize objectSize){
		
		return String.valueOf(objectSize.getObjectSize());
	}
	
}
