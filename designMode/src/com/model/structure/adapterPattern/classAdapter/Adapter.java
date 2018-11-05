package com.model.structure.adapterPattern.classAdapter;

import com.model.structure.adapterPattern.Source;
import com.model.structure.adapterPattern.Targetable;

public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("This is the targetable method!");
	}

}
