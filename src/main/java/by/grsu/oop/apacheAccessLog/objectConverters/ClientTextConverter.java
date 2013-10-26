package by.grsu.oop.apacheAccessLog.objectConverters;

import by.grsu.oop.apacheAccessLog.model.Client;

public class ClientTextConverter {
	
	public String convertToText(Client client){
		
		return client.getClient();
	}
	
}
