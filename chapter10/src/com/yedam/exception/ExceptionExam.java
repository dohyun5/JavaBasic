package com.yedam.exception;

public class ExceptionExam {
	public static void main(String[] args) {
		//NullPointException 
		//String data = null;
		//System.out.println(data.toString());
		
		//Example example = null;
		//System.out.println(example.toString());
		
		//ArrayIndexOutOfBoundsException 배열 범위가 넘어가면 발생하는 오류
		//int[] intAry = new int[3];
		//intAry[2] = 3;
		//intAry[4] = 3; //Index 4 out of bounds for length 3 배열 3칸있는데 왜 4번째에 넣냐?
		
//		for(int i=0; i<=intAry.length;i++) {
//			System.out.println(intAry[i]);
//		}
		
		//NumberFormatException
		//정상출력
//		String str= "123";
//		int val = Integer.parseInt(str);
//		System.out.println(val);
//		//예외 (exception)
//		String str2 = "자바";
//		val = Integer.parseInt(str2);
//		System.out.println(str2); 
		
		//ClassCastException
		//자동타입변환 된 객체를 강제타입변환 할 때 발생
		
		//정상출력
//		Example exam = new Exam();
//		Exam exam02 = (Exam)exam;
//		
//		//예외(exception)
//		Example exam2 = new Exam();
//		Exam02 exam03 = (Exam02)exam2; 잘못된 클래스를 이용해서 강제타입변환이라 오류
		
		
		//ClassNotFoundException -> Class 파일 찾지 못할 때
		//실행메소드(main) 찾지 못할 때 자주 발생
		
		//ArithmeticException -> 분모가 0일때 발생
		//ex) double a = 1/0; 
		
		//반복문을 종료하지 못하고 무한 루프 등등 발생할때
		//OutOfMemberError -> 메모리가 부족할 때 생기는 오류
		//메모리 누수, memory leak
		
		//IOException -> 입출력 오류
		//file reading/write 
		
		//FileNotfoundException 
		//Java - > file reading -> 경로가 안 맞아서 파일을 찾지 못할때.
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
