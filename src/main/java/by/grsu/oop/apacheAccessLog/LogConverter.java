package by.grsu.oop.apacheAccessLog;

import by.grsu.oop.apacheAccessLog.objectConverters.ClientTextConverter;
import by.grsu.oop.apacheAccessLog.objectConverters.DateTextConverter;
import by.grsu.oop.apacheAccessLog.objectConverters.ErrorTextConverter;
import by.grsu.oop.apacheAccessLog.objectConverters.IpTextConverter;
import by.grsu.oop.apacheAccessLog.objectConverters.MethodTextConverter;
import by.grsu.oop.apacheAccessLog.objectConverters.ObjectSizeTextConverter;
import by.grsu.oop.apacheAccessLog.objectConverters.PathTextConverter;
import by.grsu.oop.apacheAccessLog.objectConverters.ProtocolTextConverter;

public class LogConverter {
	
	String newLine = System.getProperty("line.separator");
	
	private ClientTextConverter clientTextConverter = new ClientTextConverter();
	private DateTextConverter dateTextConverter = new DateTextConverter();
	private ErrorTextConverter errorTextConverter = new ErrorTextConverter();
	private IpTextConverter ipTextConverter = new IpTextConverter();
	private MethodTextConverter methodTextConverter = new MethodTextConverter();
	private ObjectSizeTextConverter objectSizeTextConverter = new ObjectSizeTextConverter();
	private PathTextConverter pathTextConverter = new PathTextConverter();
	private ProtocolTextConverter protocolTextConverter = new ProtocolTextConverter();
	
	public String convertToText(LogEntry logEntry){
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(ipTextConverter.convertToText(logEntry.getIp()));
		stringBuilder.append(" - ");
		stringBuilder.append(clientTextConverter.convertToText(logEntry.getClient()));
		stringBuilder.append(" ");
		stringBuilder.append(dateTextConverter.convertToText(logEntry.getDate()));
		stringBuilder.append(" ");
		stringBuilder.append('"');
		stringBuilder.append(methodTextConverter.convertToText(logEntry.getMethod()));
		stringBuilder.append(" ");
		stringBuilder.append(pathTextConverter.convertToText(logEntry.getPath()));
		stringBuilder.append(" ");
		stringBuilder.append(protocolTextConverter.convertToText(logEntry.getProtocol()));
		stringBuilder.append('"');
		stringBuilder.append(" ");
		stringBuilder.append(errorTextConverter.convertToText(logEntry.getError()));
		stringBuilder.append(" ");
		stringBuilder.append(objectSizeTextConverter.convertToText(logEntry.getObjectSize()));
		stringBuilder.append(newLine);
		
		return stringBuilder.toString();
	}
	
}
