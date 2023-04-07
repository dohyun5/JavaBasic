package com.yedam.set;

public class Member {
	
	//필드
	String name;
	int age;
	//생성자
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	//재정의 
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj; //강제타입 변환 
			if(member.name.equals(name) && member.age == age) {
				return true;
			}
		}
		return false;
	}

	
	@Override
	public int hashCode() {
		
		return name.hashCode(); 
		//return name.hashCode() + age; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
