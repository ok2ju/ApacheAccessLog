package by.grsu.oop.apacheAccessLog.objectConverters;

import by.grsu.oop.apacheAccessLog.model.Path;

public class PathTextConverter {
	
	public String convertToText(Path path){
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append("/");
		stringBuilder.append(path.getFolders().get(0));
		stringBuilder.append("/");
		stringBuilder.append(path.getFolders().get(1));
		stringBuilder.append("/");
		stringBuilder.append(path.getFolders().get(2));
		stringBuilder.append("/");
		stringBuilder.append(path.getFileName());
		stringBuilder.append(".");
		stringBuilder.append(path.getExtension());
		
		return stringBuilder.toString();
	}
	
}
