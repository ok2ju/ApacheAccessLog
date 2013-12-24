package by.grsu.oop.apacheAccessLog.generators.randomFactory.randomGenerators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import by.grsu.oop.apacheAccessLog.generators.Generator;
import by.grsu.oop.apacheAccessLog.model.Protocol;

public class ProtocolGenerator implements Generator<Protocol> {
	
	private List<String> protocolList = new ArrayList<String>();
	private List<String> versionList = new ArrayList<String>();
	private Random random = new Random();
	
	public ProtocolGenerator(){
		protocolList.add("HTTPS");
		protocolList.add("HTTP");
		protocolList.add("FTP");
		
		versionList.add("1.0");
		versionList.add("2.0");
	}
	
	public Protocol generate(){
		Protocol protocol = new Protocol();
		protocol.setProtocol(protocolList.get(random.nextInt(protocolList.size())));
		protocol.setVersion(versionList.get(random.nextInt(versionList.size())));
		
		return protocol;
		
	}
	
}
