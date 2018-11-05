package com.model.create.abstractFactoryPattern;

import com.model.create.factoryPattern.MyClassOne;
import com.model.create.factoryPattern.MyInterface;

public class MyFactoryOne implements Provider {

	@Override
	public MyInterface produce() {
		return new MyClassOne();
	}

}
