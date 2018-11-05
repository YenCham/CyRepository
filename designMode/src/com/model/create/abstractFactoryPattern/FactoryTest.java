package com.model.create.abstractFactoryPattern;

import com.model.create.factoryPattern.MyInterface;

public class FactoryTest {

	public static void main(String[] args) {
		Provider provider = new MyFactoryOne();
		MyInterface mi = provider.produce();
		mi.print();
	}

}
