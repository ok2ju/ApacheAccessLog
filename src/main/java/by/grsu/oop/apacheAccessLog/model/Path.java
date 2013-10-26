package by.grsu.oop.apacheAccessLog.model;

import java.util.List;

public class Path {
	
	private String fileName;
	private String extension;
	private List<String> folders;
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public List<String> getFolders() {
		return folders;
	}
	public void setFolders(List<String> folders) {
		this.folders = folders;
	}
	
}
