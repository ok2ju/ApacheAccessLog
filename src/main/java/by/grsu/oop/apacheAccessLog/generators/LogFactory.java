package by.grsu.oop.apacheAccessLog.generators;

import by.grsu.oop.apacheAccessLog.model.Client;
import by.grsu.oop.apacheAccessLog.model.Date;
import by.grsu.oop.apacheAccessLog.model.Error;
import by.grsu.oop.apacheAccessLog.model.Ip;
import by.grsu.oop.apacheAccessLog.model.Method;
import by.grsu.oop.apacheAccessLog.model.ObjectSize;
import by.grsu.oop.apacheAccessLog.model.Path;
import by.grsu.oop.apacheAccessLog.model.Protocol;

public interface LogFactory {
	
	public Generator<Client> generateClient();
	
	public Generator<Date> generateDate();
	
	public Generator<Error> generateError();
	
	public Generator<Ip> generateIp();
	
	public Generator<Method> generateMethod();
	
	public Generator<ObjectSize> generateObjectSize();
	
	public Generator<Path> generatePath();
	
	public Generator<Protocol> generateProtocol();
	
}
