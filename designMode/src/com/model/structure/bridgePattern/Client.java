package com.model.structure.bridgePattern;

public class Client {

	public static void main(String[] args) {
		DriverManager driverManager = new MyDriverManager();
		Driver driver_1 = new MysqlDriver();
		driverManager.setDriver(driver_1);
		driverManager.connect();
		
		Driver driver_2 = new DB2Driver();
		driverManager.setDriver(driver_2);
		driverManager.connect();
	}
}
