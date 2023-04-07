package com.yedam.inter2;

public class Application {
	public static void main(String[] args) {
		A a = new B();
		a.info();
		a = new C();//손자
		a.info(); //B클래스 상속 받고 있음 
		
	}
}



