package com.model.structure.bridgePattern;

public class MysqlDriver implements Driver {

	@Override
	public void connect() {
		System.out.println("connect mysql done!");
	}

}
