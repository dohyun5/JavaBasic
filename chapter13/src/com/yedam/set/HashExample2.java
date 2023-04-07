package com.yedam.set;

import java.util.HashSet;
import java.util.Set;

public class HashExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		//new는 hashcode값이 달라서 데이터는 같지만 다른 객체로 인식.(재정의 전)
		set.add(new Member("또치", 10));
		set.add(new Member("또치", 10));
		
		System.out.println("총 객체 수 : " + set.size()); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
