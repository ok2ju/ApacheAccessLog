package by.grsu.oop.apacheAccessLog.objectConverters;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import by.grsu.oop.apacheAccessLog.model.Date;

public class DateTextConverter {
	
	public String convertToText(Date date){
		DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss Z");
		
		return dateFormat.format(date.getGregorianCalendar().getTime());
	}
	
}
