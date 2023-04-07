package com.yedam.inter;

public class MyClass {
	//인터페이스를 사용하는 위치
	//필드
	RemoteControl rc =  new Television();
	
	//생성자
	public MyClass() {
		
	}
	public MyClass(RemoteControl rc) {
		//ex) rc = new Audio() || rc = new Television() 
		this.rc = rc;
		this.rc.turnOn();
		this.rc.turnOff();
	}
	
	//메소드
	public void methodA() {
		RemoteControl rc = new Audio(); //메소드 실행하면서 생성
		rc.turnOn();
		rc.turnOff();
	}
	
	public void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
