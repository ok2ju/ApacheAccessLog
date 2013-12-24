package by.grsu.oop.apacheAccessLog.generators.randomFactory;

import by.grsu.oop.apacheAccessLog.generators.Generator;
import by.grsu.oop.apacheAccessLog.generators.LogFactory;
import by.grsu.oop.apacheAccessLog.generators.randomFactory.randomGenerators.ClientGenerator;
import by.grsu.oop.apacheAccessLog.generators.randomFactory.randomGenerators.DateGenerator;
import by.grsu.oop.apacheAccessLog.generators.randomFactory.randomGenerators.ErrorGenerator;
import by.grsu.oop.apacheAccessLog.generators.randomFactory.randomGenerators.IpGenerator;
import by.grsu.oop.apacheAccessLog.generators.randomFactory.randomGenerators.MethodGenerator;
import by.grsu.oop.apacheAccessLog.generators.randomFactory.randomGenerators.ObjectSizeGenerator;
import by.grsu.oop.apacheAccessLog.generators.randomFactory.randomGenerators.PathGenerator;
import by.grsu.oop.apacheAccessLog.generators.randomFactory.randomGenerators.ProtocolGenerator;
import by.grsu.oop.apacheAccessLog.model.Client;
import by.grsu.oop.apacheAccessLog.model.Date;
import by.grsu.oop.apacheAccessLog.model.Error;
import by.grsu.oop.apacheAccessLog.model.Ip;
import by.grsu.oop.apacheAccessLog.model.Method;
import by.grsu.oop.apacheAccessLog.model.ObjectSize;
import by.grsu.oop.apacheAccessLog.model.Path;
import by.grsu.oop.apacheAccessLog.model.Protocol;

public class RandomLogFactory implements LogFactory {

	public Generator<Client> generateClient() {
		return new ClientGenerator();
	}

	public Generator<Date> generateDate() {
		return new DateGenerator();
	}

	public Generator<Error> generateError() {
		return new ErrorGenerator();
	}

	public Generator<Ip> generateIp() {
		return new IpGenerator();
	}

	public Generator<Method> generateMethod() {
		return new MethodGenerator();
	}

	public Generator<ObjectSize> generateObjectSize() {
		return new ObjectSizeGenerator();
	}

	public Generator<Path> generatePath() {
		return new PathGenerator();
	}

	public Generator<Protocol> generateProtocol() {
		return new ProtocolGenerator();
	}

}
