package com.model.create.factoryPattern.statical;

import com.model.create.factoryPattern.MyInterface;

public class FactoryTest {

	public static void main(String[] args) {
		MyInterface mi = MyStaticFactory.produceOne();
		mi.print();
	}

}
