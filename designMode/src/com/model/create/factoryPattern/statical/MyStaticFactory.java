package com.model.create.factoryPattern.statical;

import com.model.create.factoryPattern.MyClassOne;
import com.model.create.factoryPattern.MyClassTwo;
import com.model.create.factoryPattern.MyInterface;

public class MyStaticFactory {
	
	public static MyInterface produceOne() {
		return new MyClassOne();
	}
	
	public static MyInterface produceTwo() {
		return new MyClassTwo();
	}
}
