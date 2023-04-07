package com.yedam.poly;

public class Casting {
	
	//매개변수를 활용한 다형성 (안전하게 타입변환 하기위함)
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("Casting 성공");
		}else {
			System.out.println("Casting 실패");
		}
	}
	
	
	
	public static void main(String[] args) {
		Parent p1 = new Child02();
		
		//Child02 child = (Child02)p1;
		//child.method1();
		method1(p1);
		
		
		
		
		
		
		
		
		
	}
}
