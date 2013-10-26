package by.grsu.oop.apacheAccessLog.generators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import by.grsu.oop.apacheAccessLog.model.Path;

public class PathGenerator {
	
	private List<String> extensionList = new ArrayList<String>();
	private List<String> foldersList = new ArrayList<String>();
	private List<String> fileNameList = new ArrayList<String>();
	private Random random = new Random();
	
	public PathGenerator(){
		extensionList.add("exe");
		extensionList.add("pdf");
		extensionList.add("doc");
		extensionList.add("txt");
		
		foldersList.add("media");
		foldersList.add("documents");
		foldersList.add("books");
		
		fileNameList.add("red-book");
		fileNameList.add("sum41");
		fileNameList.add("history");
	}
	
	public Path generate(){
		Path path = new Path();
		path.setExtension(extensionList.get(random.nextInt(extensionList.size())));
		path.setFileName(fileNameList.get(random.nextInt(fileNameList.size())));
		path.setFolders(foldersList);
		
		return path;
	}
	
}
