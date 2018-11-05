package com.model.structure.adapterPattern.classAdapter;

import com.model.structure.adapterPattern.Targetable;

public class AdapterTest {

	public static void main(String[] args) {
		Targetable target = new Adapter();
		target.method1();
		target.method2();
	}

}
