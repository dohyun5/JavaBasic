package com.yedam.exception;

public class Application {
	public static void main(String[] args) {
//		try {
//			//예외가 발생 할 것 같은 실행코드
//		}catch(예외){
//			//예외가 발생하면 처리하는 코드
//		}finally{
//			//옵션(선택사항/ try catch에서 사용해도 되고 작성하지 않아도 try catch는 실행 가능함.)
//			//try문 또는 catch문 실행하고 나서
//			//무.조.건 실행해야하는 코드
//		}
		String data1 = null;
		String data2 = null;
		try {
			//data1 = args[0]; //args 외부에서 들어오는 데이터를 담아두는곳.
			//data2 = args[1];
			
			//double avg = 1/0;
			
			//String str = "자바";
			//int a = Integer.parseInt(str);
			
			//Class clazz = Class.forName("java.lang.String2");
			
			
			
			//catch문은 switch문과 비슷하게 해당 항목이 아니라면 다음 catch로 넘어가서 순서대로 점검해서 도출함.
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(NumberFormatException e) {
			System.out.println("문자열 변환 에러");
		//}catch(ClassNotFoundException e) {
			//System.out.println("클래스를 찾을 수 없다.");
		}catch(Exception e) {
			System.out.println("위에서 처리 못하면 내가 처리한다.");
			//Exception은 예외 자체를 잡는건 좋지만 특정 예외처리에 추가 기능을 사용할수 없다는 단점이 있다. 
		}finally {
			System.out.println("Finally! 무조건 실행");
		}
		
		
		
		
		
		
		
		
		
		
	}
}
