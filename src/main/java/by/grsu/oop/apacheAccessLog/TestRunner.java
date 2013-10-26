package by.grsu.oop.apacheAccessLog;

import java.io.IOException;

public class TestRunner {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		LogFileGenerator logFileGenerator = new LogFileGenerator();
		logFileGenerator.saveToTextFile(10);
	}

}
