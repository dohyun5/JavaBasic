package com.yedam.poly;

public class DriveExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//Vehicle vehicle = new Bus();
		
		
		driver.drive(bus);
		driver.drive(taxi);
	}
	
	

}
