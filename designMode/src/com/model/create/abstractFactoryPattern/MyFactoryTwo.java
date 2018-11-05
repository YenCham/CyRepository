package com.model.create.abstractFactoryPattern;

import com.model.create.factoryPattern.MyClassTwo;
import com.model.create.factoryPattern.MyInterface;

public class MyFactoryTwo implements Provider {

	@Override
	public MyInterface produce() {
		return new MyClassTwo();
	}

}
