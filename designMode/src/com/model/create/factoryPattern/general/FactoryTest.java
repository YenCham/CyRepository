package com.model.create.factoryPattern.general;

import com.model.create.factoryPattern.MyInterface;

public class FactoryTest {
	
	public static void main(String[] args) {
		MyGeneralFactory factory = new MyGeneralFactory();
		MyInterface mi = factory.produce("One");
		mi.print();
	}
}
