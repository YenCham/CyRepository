package com.model.structure.bridgePattern;

public class DB2Driver implements Driver {

	@Override
	public void connect() {
		System.out.println("connect db2 done!");
	}

}
