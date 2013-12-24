package by.grsu.oop.apacheAccessLog.generators.randomFactory.randomGenerators;

import java.util.GregorianCalendar;

import by.grsu.oop.apacheAccessLog.generators.Generator;
import by.grsu.oop.apacheAccessLog.model.Date;

public class DateGenerator implements Generator<Date> {
	
	public Date generate(){
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		Date date = new Date();
		date.setGregorianCalendar(gregorianCalendar);
		
		return date;
	}
	
}
