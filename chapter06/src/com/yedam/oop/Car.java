package com.yedam.oop;

public class Car {
	
	//필드
	String name;
	int price;
	String company = "현대자동차";
	
	
	// 생성자
	//기본생성자
	
	
	//매개변수를 가지는 생성자
//	public Car(String n, int p) {
//		name = n;
//		price = p;
//	}
	
	
	public Car() {
		
	}
	public Car(String name) {
		this(name, 10000,"기아자동차");
	}
	public Car(int price) {
		this.price = price;
	}
	public Car(String name, int price) {
		this.name = name; //this는 class의 Car
		this.price = price;
	}
	public Car(int price, String name) {
		this.name = name;
		this.price = price;
	}
	
	public Car(String name, int price, String company) {
		this.name = name;
		this.price = price;
		this.company = company;
	}
	
	
	
	
	//메소드
	
	
	
	
	
	
	
	
}
