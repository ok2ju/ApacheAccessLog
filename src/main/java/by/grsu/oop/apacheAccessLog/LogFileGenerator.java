package by.grsu.oop.apacheAccessLog;

import java.io.IOException;

import by.grsu.oop.apacheAccessLog.file_worker.TextWriter;
import by.grsu.oop.apacheAccessLog.generators.LogFactory;
import by.grsu.oop.apacheAccessLog.generators.randomFactory.RandomLogFactory;

public class LogFileGenerator {

	private LogFactory logFactory = new RandomLogFactory();
	private LogEntryGenerator logGenerator = new LogEntryGenerator(logFactory);
	private LogConverter logConverter = new LogConverter();
	private TextWriter textWriter = new TextWriter();

	public void saveToTextFile(int count) throws IOException {

		for (int i = 0; i < count; i++) {
			String source = logConverter.convertToText(logGenerator.generate());
			textWriter.writeToTextFile(source);
		}

	}

}
