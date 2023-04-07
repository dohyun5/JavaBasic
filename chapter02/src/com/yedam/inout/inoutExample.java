package com.yedam.inout;

import java.io.IOException;
import java.util.Scanner;

public class inoutExample {

	public static void main(String[] args) throws Exception {
		int value = 123;
		String name = "상품";
		double price = 1000.10;
		System.out.printf("상품의 가격 : %d\n", value);
		System.out.printf("%s의 가격 : %d\n", name, value);
		System.out.printf("%s의 가격 : %d, %f\n", name, value, price);
		
		// 1) 정수 사용
		value = 11;
		System.out.printf("%d\n", value);
		System.out.printf("%6d\n", value);
		System.out.printf("%-6d\n", value);
		System.out.printf("%06d\n", value);
		
		// 2) 실수 사용
		price = 321.4567;
		System.out.printf("%f\n", price);
		System.out.printf("%10.2f\n", price);
		System.out.printf("%-10.2f\n", price);
		System.out.printf("%010.2f\n", price);
		
		//문자열 사용
		System.out.printf("%s\n","문자사용");
		System.out.printf("%6s\n","문자사용");
		System.out.printf("%-6s\n","문자사용");
		
		//기본 출력문
		System.out.println("아무것도 없는 print\n");
		
		//입력
//		int keyCode;
//		System.out.println("원하는 값 입력 >");
//		keyCode = System.in.read();
//		System.out.println("KeyCode : " + keyCode);
//		
//		System.out.println("원하는 값 입력 >");
//		keyCode = System.in.read();
//		System.out.println("KeyCode : " + keyCode);
//		
//		System.out.println("원하는 값 입력 >");
//		keyCode = System.in.read();
//		System.out.println("KeyCode : " + keyCode);
		
		//스캐너(Scanner)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("데이터 입력>");
		
		String word = sc.nextLine(); //문자열 받아오는 nextLine (단 엔터키전의 값)
		
		System.out.println(word);
		
		//String.equals() - 문자열 비교 문자열은 기본타입이 아니기 때문에 등호로 비교 불가능.
		if(word.equals("test")) {
			System.out.println("equal : 입력하신 문자열과 비교 문자열 같음");
		}
		if(word == "text") {
			System.out.println("== : 입력하신 문자열과 비교 문자열이 같음");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
