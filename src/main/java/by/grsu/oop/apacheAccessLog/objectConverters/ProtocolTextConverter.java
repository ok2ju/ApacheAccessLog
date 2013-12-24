package by.grsu.oop.apacheAccessLog.objectConverters;

import by.grsu.oop.apacheAccessLog.model.Protocol;

public class ProtocolTextConverter {
	
	public String convertToText(Protocol protocol){
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append(protocol.getProtocol());
		stringBuilder.append("/");
		stringBuilder.append(protocol.getVersion());
		
		return stringBuilder.toString();
		
	}
}
