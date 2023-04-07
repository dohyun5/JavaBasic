package com.yedam.API;

import java.util.Random;

public class BoxingExample {
	public static void main(String[] args) {
		//Boxing : 기본타입 -> 객체로 포장
		
		//사용은 할 수 있지만, 권장하지 않는다.(단어에 가운데 줄그어져 있는것)
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		
		Integer obj3 = Integer.valueOf(300);
		Integer obj4 = Integer.valueOf("400");
		
		//unBoxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		int value4 = obj4.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		//자동 박싱
		Integer obj5 = 500;
		System.out.println("value : " + obj5.intValue());
		
		//대입 시 자동 언박싱
		int value5 = obj5;
		System.out.println("value : " + value5);
		
		//연산시 자동 언박싱 
		int value6 = obj5 + 500;
		System.out.println("value : " + value6);
		
		//포장 값 비교(포장된 박스가 같은지 비교)
		Integer obj6 = 200;
		Integer obj7 = 200;
		System.out.println(obj6 == obj7); //포장된 상태로 비교 (값의 범위에 주의 p.503)
		System.out.println(obj6.intValue() == obj7.intValue()); //포장 해제하고 비교
		
		//형 변환(타입 변환)
		double value7 = Double.parseDouble("3.014");
		System.out.println(value7); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}
