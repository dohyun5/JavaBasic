package com.yedam.inter;

public class MyClassExample {
	public static void main(String[] args) {
		System.out.println("1)필드-----------------");
		
		//클래스 내부에 인터페이스를 활용해서 필드로 선언
		MyClass myClass1 = new MyClass();
		
		myClass1.rc.turnOn();
		myClass1.rc.turnOff();
		
		System.out.println("2)생성자-----------------");
		//생성자 매개변수를 활용해서 인터페이스를 사용.
		MyClass myClass2 = new MyClass(new Audio());
		//audio를 재정의한 내용을 넣음
		
		System.out.println("3)메소드 매개변수X-----------------");
		
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		System.out.println("4)메소드 매개변수O-----------------");
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
		myClass4.methodB(new Audio());
		
	}
	
	
	
	
}
