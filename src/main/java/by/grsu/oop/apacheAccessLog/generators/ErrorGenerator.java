package by.grsu.oop.apacheAccessLog.generators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import by.grsu.oop.apacheAccessLog.model.Error;

public class ErrorGenerator {
	
	private List<String> errorList = new ArrayList<String>();
	private Random random = new Random();
	
	public ErrorGenerator(){
		errorList.add("404");
		errorList.add("501");
		errorList.add("500");
	}
	
	public Error generate(){
		Error error = new Error();
		error.setError(errorList.get(random.nextInt(errorList.size())));
		
		return error;
	}
	
}