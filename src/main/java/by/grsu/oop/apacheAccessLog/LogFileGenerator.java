package by.grsu.oop.apacheAccessLog;

import java.io.IOException;

import by.grsu.oop.apacheAccessLog.file_worker.TextWriter;

public class LogFileGenerator {

	private LogGenerator logGenerator = new LogGenerator();
	private LogConverter logConverter = new LogConverter();
	private TextWriter textWriter = new TextWriter();

	public void saveToTextFile(int count) throws IOException {

		for (int i = 0; i < count; i++) {
			String source = logConverter.convertToText(logGenerator.generate());
			textWriter.writeToTextFile(source);
		}

	}

}
