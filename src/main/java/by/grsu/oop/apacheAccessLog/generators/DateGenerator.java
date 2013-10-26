package by.grsu.oop.apacheAccessLog.generators;

import java.util.GregorianCalendar;

import by.grsu.oop.apacheAccessLog.model.Date;

public class DateGenerator {
	
	public Date generate(){
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		Date date = new Date();
		date.setGregorianCalendar(gregorianCalendar);
		
		return date;
	}
	
}
