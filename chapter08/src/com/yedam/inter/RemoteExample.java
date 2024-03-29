package com.yedam.inter;

import java.rmi.Remote;

public class RemoteExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Audio();
		rc = new Television();
		
		
		rc.turnOn();
		rc.setVolume(5);
		rc.setVolume(12);
		rc.setVolume(-5);
		rc.turnOff();
		
		SmartTelevision tv = new SmartTelevision();
		
		//2개의 인터페이스를 상속 = tv 
		RemoteControl rc2 = tv;
		
		rc2.turnOn();
		rc2.setVolume(4);
		rc2.turnOff();
		
		//rc2.search("naver");
		
		Searchable search = tv; //인터페이스간 상속으로 두가지를 합쳐서 한곳으로 사용 가능.
		search.turnOn();
		search.setVolume(8);
		search.search("www.naver.com");
		search.turnOff();
		
		
		
		
	}

}
