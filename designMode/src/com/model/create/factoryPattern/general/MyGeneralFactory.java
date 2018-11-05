package com.model.create.factoryPattern.general;

import com.model.create.factoryPattern.MyClassOne;
import com.model.create.factoryPattern.MyClassTwo;
import com.model.create.factoryPattern.MyInterface;

public class MyGeneralFactory {
	public MyInterface produce(String type) {
		if("One".equals(type)) {
			return new MyClassOne();
		} else if("Two".equals(type)) {
			return new MyClassTwo();
		} else {
			System.out.println("没有要找的类型");
			return null;
		}
	}
}
