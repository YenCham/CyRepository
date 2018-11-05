package com.model.create.factoryPattern.multiple;

import com.model.create.factoryPattern.MyInterface;

public class FactoryTest {

	public static void main(String[] args) {
		MyMulitFactory factory = new MyMulitFactory();
		MyInterface mi = factory.produceOne();
		mi.print();
	}

}
