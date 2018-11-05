package com.model.create.prototypePattern;

public class PrototypePaternTest {

	public static void main(String[] args) throws Exception {
		Prototype prototype = new Prototype();
		prototype.setBase(1);
		prototype.setObj(new Integer(2));
		// «≥∏¥÷∆
		Prototype prototype_1 = (Prototype) prototype.clone();
		// …Ó∏¥÷∆
		Prototype prototype_2 = (Prototype) prototype.deepClone();
		
		System.out.println(prototype.getObj() == prototype_1.getObj());
		System.out.println(prototype.getObj() == prototype_2.getObj());
	}

}
