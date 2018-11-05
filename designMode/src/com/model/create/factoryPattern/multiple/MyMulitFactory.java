package com.model.create.factoryPattern.multiple;

import com.model.create.factoryPattern.MyClassOne;
import com.model.create.factoryPattern.MyClassTwo;
import com.model.create.factoryPattern.MyInterface;

public class MyMulitFactory {
	
	public MyInterface produceOne() {
		return new MyClassOne();
	}
	
	public MyInterface produceTwo() {
		return new MyClassTwo();
	}
}
