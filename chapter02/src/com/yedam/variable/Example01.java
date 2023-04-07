package com.yedam.variable;

public class Example01 {
	public static void main(String[] arg) {
		//int 
		int var1 = 0b1011; // 2진수(0b)
		int var2 = 0206; // 8진수(0)
		int var3 = 365; // 10진수 
		int var4 = 0xB3; // 16진수(0x)
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);

		//byte 최대 127 까지 담을수있다
		byte bVal = -128;
		byte bVal2 = 0;
		byte bVal3 = 127;
		//byte bVal4 = 500; //최대 127 까지 담을수있다 .
		int bVal4 = 500;
		
		System.out.println(bVal4);
		
		//long 정수 데이터 타입중에 가장 큰 값을 가질 수 있음
		// 정수 -> 기준 int 
		long lval = 10;
		long lval2 = 20;
		// 기준int의 데이터 범위를 벗어나서 , L을 붙여주는것.
		long lval3 = 1000000000000000L;// 마지막에 L을 붙여서 Long이라는걸 알려줘야함. 
		
		//char(유니코드)
		//문자('') -> 하나의 문자만 들어가는 경
		//ex) 'A', 'B'
		//문자열("") -> 하나 이상의 문자가 모이는 경우
		//ex) "apple"
		
		char charVal1 = 'A';
		char charVal2 = '가';
		char charVal3 = 67; //아스키코드 
		char charVal4 = 0x0041; //유니코드
		
		System.out.println(charVal1);
		System.out.println(charVal2);
		System.out.println(charVal3);
		System.out.println(charVal4);
		
		//문자열
		//String
		
		char charVal5 = '홍'; 
		String str1 = "홍길동";
		String str2 = "프   로그 래  머a;sdklfjiwo";
		
		System.out.println(str1);
		System.out.println(str2);
		
		
		//이스케이프 
		//탭만큼 띄움
		
		System.out.println("번호\t이름\t직업");
		//엔터키
		System.out.println("행 단위 출력\n");
		//특수문자 사용
		System.out.println("우리는 \"개발자\" 입니다.");
		//특수문자 사용2
		System.out.println("봄\\여름\\가을\\겨울");
		
		//실수 타입
		//float
		float fVal = 3.14f;  // float 사용시에는 뒤에 f를 붙여서 마무리
		//double
		double dVal = 3.14;
		
		//e사용
		double dVal2 = 3e6; // 3.0 * 10의 6승
		float fVal2 = 3e6f; // 3.0 * 10의 6승
		double dVal3 = 2e-3; // 2.0* 10의 -3승 => 2/1000
		
		System.out.println(dVal2);
		System.out.println(fVal2);
		System.out.println(dVal3);
		
		//논리타입 - true false
		boolean stop = true;
		
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
