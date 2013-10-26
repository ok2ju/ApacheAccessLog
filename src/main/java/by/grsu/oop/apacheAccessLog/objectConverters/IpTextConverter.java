package by.grsu.oop.apacheAccessLog.objectConverters;

import by.grsu.oop.apacheAccessLog.model.Ip;

public class IpTextConverter {
	
	public String convertToText(Ip ip){
		
		return ip.getFirstOctet()+"."+ip.getSecondOctet()+"."+ip.getThirdOctet()+"."+ip.getFourthOctet();
	}
}
