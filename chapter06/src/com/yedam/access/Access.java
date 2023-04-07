package com.yedam.access;

public class Access {
	/* 필드, 메소드, 클래스, 인터페이스 접근 가능 여부 => 접근 제한자
	 * public : 어디서든 누구나 다 접근 가능
	 * protected : 상속(부모자식)이라는 관계를 성립 시켜준 다음에 부모의 필드, 메소드 영역을
	 * 				자식이 사용할 수 있게 해준다(패키지가 달라도 사용이 가능하다)
	 * 				같은 패키지에서만 접근 가능, 단 상속의 관계라면 상관 없다.
	 * default : 같은 패키지에서만 접근 가능
	 * private : 내가 속한 클래스에서만 사용 가능
	 */
	
	//필드
	public String free;
	protected String parent;
	String basic;
	private String privacy;
	
	//생성자에 접근 제한자 -> 객체를 생성하는 범위를 조절
	public Access() {
		//어디서든 객체 생성 가능
	}
	
	protected Access(int a) {
		//같은 패키지, 자식 클래스에서 사용 가능.
	}
	Access(String s){
		//같은 패키지에서만 객체 생성 가능
	}
	private Access(double e) {
		//객체 생성 금지.
	}
	
	//메소드
	public void instead() {
		info();
	} 
	private void info() {
		System.out.println("private 메소드");
	} //객체지향 특징 1.정보은닉(캡슐화) 2.다향성 3.상속
	  
	protected void parent() {
		System.out.println("protected 메소드");
	}
	void basic() {
		System.out.println("default 메소드");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
