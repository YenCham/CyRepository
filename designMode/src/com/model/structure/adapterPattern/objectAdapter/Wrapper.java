package com.model.structure.adapterPattern.objectAdapter;

import com.model.structure.adapterPattern.Source;
import com.model.structure.adapterPattern.Targetable;

public class Wrapper implements Targetable {

	private Source source;
	
	public Wrapper(Source source) {
		super();
		this.source = source;
	}
	
	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("This is the targetable method!");
	}

}
