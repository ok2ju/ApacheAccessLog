package by.grsu.oop.apacheAccessLog.generators.randomFactory.randomGenerators;

import java.util.Random;

import by.grsu.oop.apacheAccessLog.generators.Generator;
import by.grsu.oop.apacheAccessLog.model.ObjectSize;

public class ObjectSizeGenerator implements Generator<ObjectSize> {
	
	private Random random = new Random();
	
	public ObjectSize generate(){
		ObjectSize objectSize = new ObjectSize();
		objectSize.setObjectSize(random.nextInt(100000)+1000);
		
		return objectSize;
		
	}
	
}
