package by.grsu.oop.apacheAccessLog;

import by.grsu.oop.apacheAccessLog.generators.Generator;
import by.grsu.oop.apacheAccessLog.generators.LogFactory;
import by.grsu.oop.apacheAccessLog.model.Client;
import by.grsu.oop.apacheAccessLog.model.Date;
import by.grsu.oop.apacheAccessLog.model.Error;
import by.grsu.oop.apacheAccessLog.model.Ip;
import by.grsu.oop.apacheAccessLog.model.Method;
import by.grsu.oop.apacheAccessLog.model.ObjectSize;
import by.grsu.oop.apacheAccessLog.model.Path;
import by.grsu.oop.apacheAccessLog.model.Protocol;

public class LogEntryGenerator {
	
	private LogFactory logFactory;
	
	public LogEntryGenerator(LogFactory logFactory){
		this.logFactory = logFactory;
	}
	
	public LogEntry generate(){
		
		Generator<Client> clientGenerator = logFactory.generateClient();
		Client client = clientGenerator.generate();
		
		Generator<Date> dateGenerator = logFactory.generateDate();
		Date date = dateGenerator.generate();
		
		Generator<Error> errorGenerator = logFactory.generateError();
		Error error = errorGenerator.generate();
		
		Generator<Ip> ipGenerator = logFactory.generateIp();
		Ip ip = ipGenerator.generate();
		
		Generator<Method> methodGenerator = logFactory.generateMethod();
		Method method = methodGenerator.generate();
		
		Generator<ObjectSize> objectSizeGenerator = logFactory.generateObjectSize();
		ObjectSize objectSize = objectSizeGenerator.generate();
		
		Generator<Path> pathGenerator = logFactory.generatePath();
		Path path = pathGenerator.generate();
		
		Generator<Protocol> protocolGenerator = logFactory.generateProtocol();
		Protocol protocol = protocolGenerator.generate();
		
		return new LogEntry(client, date, error, ip, method, objectSize, path, protocol);
	}
	
}
