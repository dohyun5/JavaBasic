package com.yedam.variable;

public class Example02 {
	public static void main(String[] args) {
		//자동 타입 변환
		char charVal = 'A' +1;
		System.out.println(charVal);
		int iVal = charVal;
		System.out.println(iVal);
		double dVal = iVal;
		System.out.println(dVal); // 66.0
		System.out.println();
		
		//강제 타입 변환
		iVal = (int)dVal; //66
		System.out.println(iVal);
		charVal = (char)iVal; //'B'
		System.out.println(charVal);
		System.out.println();
		
		double dVal2 = 3.1444444;
		int iVal2 = (int)dVal2; // 3
		System.out.println(iVal2);
		
		// 자동 타입 변환을 활용한 연산
		byte result = 10 + 20;
		System.out.println(result);
		byte x = 10;
		byte y = 20;
//		byte result2 = x+y; //오류
		// 자동 타입변환
		int result3 = x + y;
		// 강제 타입변환
		byte result4 = (byte)(x+y);
		
		//데이터 타입 크기에 따른 연산
		//long + int  = long
		// byte + int = int
		// double + int = double
		
		byte bVal = 10;
		int iVal3 = 100;
		long lVal = 1000;
		long result5 = bVal + iVal3 + lVal;
		System.out.println(result5); //연산시 타입이 큰것을 따라서 적용됨
		
		int iVal4 = 1;
		double dVal3 = iVal4/2; // int/int = int(0)
		System.out.println(dVal3); // 0.0
		double dVal4 = (double)iVal4/2;
		System.out.println(dVal4); //연산전에 타입을 변환해주면 계산값도 변경됨
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
