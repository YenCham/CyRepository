package com.model.structure.bridgePattern;

public class MyDriverManager extends DriverManager {
	public void connect() {
		System.out.println("before connect");
		super.connect();
		System.out.println("after connect");
	}
}
