package by.grsu.oop.apacheAccessLog.generators.randomFactory.randomGenerators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import by.grsu.oop.apacheAccessLog.generators.Generator;
import by.grsu.oop.apacheAccessLog.model.Method;

public class MethodGenerator implements Generator<Method> {
	
	private List<String> methodArray = new ArrayList<String>();
	private Random random = new Random();
	
	public MethodGenerator(){
		methodArray.add("POST");
		methodArray.add("GET");
	}
	
	public Method generate(){
		Method method = new Method();
		method.setMethod(methodArray.get(random.nextInt(methodArray.size())));
		
		return method;
	}
	
}
