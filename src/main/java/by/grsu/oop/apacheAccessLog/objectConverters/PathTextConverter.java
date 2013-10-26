package by.grsu.oop.apacheAccessLog.objectConverters;

import by.grsu.oop.apacheAccessLog.model.Path;

public class PathTextConverter {
	
	public String convertToText(Path path){
		
		return path.getFolders().get(0)+"/"+path.getFolders().get(1)+"/"
		+path.getFolders().get(2)+"/"+path.getFileName()+"."+path.getExtension();
	}
	
}
