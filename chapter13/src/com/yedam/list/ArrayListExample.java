package com.yedam.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//String 문자열을 넣을 수 있는 ArrayList
		List<String> list = new ArrayList<String>();
		
		//list 데이터 추가
		list.add("Java"); //인덱스 0에 객체 추가
		list.add("JDBC"); //인덱스 1에 객체 추가
		list.add("Servley/JSP"); //인덱스 2에 객체 추가
		
		list.add(2,"DataBase"); //인덱스 2자리에 객체 추가하고 기존 인덱스 2자리에 있는데이터는 인덱스 3으로 이동
		list.add("iBatis");
		
		//list.size() = > list의 크기, 객체의 수(배열의 length와 비슷)
		//list.get() -> list에 있는 데이터 가져오는것
		for(int i=0; i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println("-----------------------------------");
		//향상된 for문
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("-----------------------------------");
		//list에 있는 인덱스 2번 객체 삭제
		list.remove(2);
		
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("-----------------------------------");
		//list에 저장된 객체를 활용해서 객체 삭제
		list.remove("JDBC");
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("-----------------------------------");
		
		list.clear();
		System.out.println("list 사이즈 : " + list.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
