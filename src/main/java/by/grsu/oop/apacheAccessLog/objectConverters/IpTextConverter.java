package by.grsu.oop.apacheAccessLog.objectConverters;

import by.grsu.oop.apacheAccessLog.model.Ip;

public class IpTextConverter {
	
	public String convertToText(Ip ip){
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append(ip.getFirstOctet());
		stringBuilder.append(".");
		stringBuilder.append(ip.getSecondOctet());
		stringBuilder.append(".");
		stringBuilder.append(ip.getThirdOctet());
		stringBuilder.append(".");
		stringBuilder.append(ip.getFourthOctet());
		
		
		return stringBuilder.toString();
	}
}
