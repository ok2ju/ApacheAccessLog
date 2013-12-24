package by.grsu.oop.apacheAccessLog.generators.randomFactory.randomGenerators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import by.grsu.oop.apacheAccessLog.generators.Generator;
import by.grsu.oop.apacheAccessLog.model.Client;

public class ClientGenerator implements Generator<Client> {
	
	private List<String> clientList = new ArrayList<String>();
	private Random random = new Random();
	
	public ClientGenerator(){
		clientList.add("Opera");
		clientList.add("Chrome");
		clientList.add("Mozilla");
		clientList.add("IE");
		clientList.add("Safari");
	}
	
	public Client generate(){
		Client client = new Client();
		client.setClient(clientList.get(random.nextInt(clientList.size())));
		
		return client;
	}
	
}
