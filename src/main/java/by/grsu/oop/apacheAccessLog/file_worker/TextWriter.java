package by.grsu.oop.apacheAccessLog.file_worker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextWriter {
	
	private File file = new File("Text-ApacheAccessLog.txt");

	public void writeToTextFile(String source) throws IOException {
		
		FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(), true);
		fileWriter.write(source);
		fileWriter.close();
	}

}
