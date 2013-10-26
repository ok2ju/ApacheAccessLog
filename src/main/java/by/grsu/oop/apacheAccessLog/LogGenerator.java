package by.grsu.oop.apacheAccessLog;

import by.grsu.oop.apacheAccessLog.generators.ClientGenerator;
import by.grsu.oop.apacheAccessLog.generators.DateGenerator;
import by.grsu.oop.apacheAccessLog.generators.ErrorGenerator;
import by.grsu.oop.apacheAccessLog.generators.IpGenerator;
import by.grsu.oop.apacheAccessLog.generators.MethodGenerator;
import by.grsu.oop.apacheAccessLog.generators.ObjectSizeGenerator;
import by.grsu.oop.apacheAccessLog.generators.PathGenerator;
import by.grsu.oop.apacheAccessLog.generators.ProtocolGenerator;

public class LogGenerator {
	
	private ClientGenerator clientGenerator = new ClientGenerator();
	private DateGenerator dateGenerator = new DateGenerator();
	private ErrorGenerator errorGenerator = new ErrorGenerator();
	private IpGenerator ipGenerator = new IpGenerator();
	private MethodGenerator methodGenerator = new MethodGenerator();
	private ObjectSizeGenerator objectSizeGenerator = new ObjectSizeGenerator();
	private PathGenerator pathGenerator = new PathGenerator();
	private ProtocolGenerator protocolGenerator = new ProtocolGenerator();
	
	public LogEntry generate(){
		LogEntry logEntry = new LogEntry();
		
		logEntry.setClient(clientGenerator.generate());
		logEntry.setDate(dateGenerator.generate());
		logEntry.setError(errorGenerator.generate());
		logEntry.setIp(ipGenerator.generate());
		logEntry.setMethod(methodGenerator.generate());
		logEntry.setObjectSize(objectSizeGenerator.generate());
		logEntry.setPath(pathGenerator.generate());
		logEntry.setProtocol(protocolGenerator.generate());
		
		return logEntry;
	}
	
}
