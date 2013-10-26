package by.grsu.oop.apacheAccessLog.objectConverters;

import by.grsu.oop.apacheAccessLog.model.Protocol;

public class ProtocolTextConverter {
	
	public String convertToText(Protocol protocol){
		
		return protocol.getProtocol()+"/"+protocol.getVersion();
		
	}
}
