package com.yedam.inter;

public interface RemoteControl {
	//상수 = > static final 생략되어 있다
	public int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	//추상 메소드 -> abstract 생략가능 
	public void turnOn();//abstract 생략 가능 
	public abstract void turnOff();
	public void setVolume(int volume);
	
	
	
}
