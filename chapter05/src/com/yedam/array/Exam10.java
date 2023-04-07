package com.yedam.array;

public class Exam10 {

	public static void main(String[] args) {
		
		//참조 배열 참조타입은 new 로 만들어 져야 사용 가능
		String[] strArray = new String[3];
		strArray[0] = "yedam";
		strArray[1] = "yedam";
		strArray[2] = new String("yedam");
		
		//번지수가 같은지 확인
		System.out.println(strArray[0] == strArray[1]); //True
		System.out.println(strArray[1] == strArray[2]); //False
		System.out.println(strArray[0] == strArray[2]); //False
		System.out.println(strArray[1].equals(strArray[2])); //True
		
		//배열 복사
		int[] oldArray = {1,2,3};
		
		int[] newArray = new int[5];
		
		for(int i=0; i < oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}	
		for(int i=0; i<newArray.length;i++) {
			System.out.println(newArray[i]);
		}
		
		//자바에서 만든 기능
		int[] oldArray2 = {1,2,3,4,5,6,7,8};
		int[] newArray2 = new int[10];
		System.arraycopy(oldArray2, 0, newArray2,0,oldArray2.length);
		//          복사     원본  몇번째부터  저장할곳 어디부터 몇개나복사?
		System.out.println("-----------------------------------");
		for(int i=0; i < newArray2.length;i++) {
			System.out.println(newArray2[i]);
		}
		
		//향상된 for문(배열에서만 사용가능) (자바스크립트의 for of 와 비슷!)
		System.out.println("-----------------------------------");
		for(int tmep : newArray2) { //tmep와 newArray2의 데이터 타입이 같아야 가져올수 있다.
			System.out.println(tmep + "\t");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
