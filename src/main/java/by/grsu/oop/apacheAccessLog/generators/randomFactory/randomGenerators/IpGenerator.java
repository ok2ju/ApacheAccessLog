package by.grsu.oop.apacheAccessLog.generators.randomFactory.randomGenerators;

import java.util.Random;

import by.grsu.oop.apacheAccessLog.generators.Generator;
import by.grsu.oop.apacheAccessLog.model.Ip;

public class IpGenerator implements Generator<Ip> {
	
	private Random random = new Random();
	
	public Ip generate(){
		Ip ip = new Ip();
		
		ip.setFirstOctet(random.nextInt(254)+1);
		ip.setSecondOctet(random.nextInt(254)+1);
		ip.setThirdOctet(random.nextInt(254)+1);
		ip.setFourthOctet(random.nextInt(254)+1);
		
		return ip;
	}
	
}
