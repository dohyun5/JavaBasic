package com.yedam.inheri;

public class Application02 {

	public static void main(String[] args) {
		DmbCellPhone dmb = new DmbCellPhone(0, null, null);
		//
		
		//부모 클래스 메소드 사용
		dmb.powerOn();
		dmb.powerOff();
		dmb.bell();
		dmb.hangUp();
		
		//자식 클래스 메소드 사용
		dmb.turnOnDmb();
		dmb.turnOffDmb();
		
		
		
		
		
		

	}

}
