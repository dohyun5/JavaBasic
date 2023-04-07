package com.yedam.condition;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		int number = (int)(Math.random()*6)+1;
		//1~6의값
		System.out.println(number);
		
		// ex) number = 5 -> case 5번 출력후 break(탈출)
		// ex) number = 6 -> default 출력후 break(탈출)
		switch(number){
			case 1:
				System.out.println("1번 나옴");
				break;
			case 2:
				System.out.println("2번 나옴");
				break;	
			case 3:
				System.out.println("3번 나옴");
				break;	
			case 4:
				System.out.println("4번 나옴");
				break;
			case 5:
				System.out.println("5번 나옴");
				break;
			default:
				System.out.println("6번 나옴");
				break;	
		}
		
		//성적 확인
		char grade = 'B';
		
		switch(grade) {
		case 'A':
			System.out.println("A학점 취득");
			break;
		case 'B':
			System.out.println("B학점 취득");
			break;
		case 'C':
			System.out.println("C학점 취득");
			break;
		case 'D':
			System.out.println("D학점 취득");
			break;
		}
		
		//문자열 활용한 switch
		String position = "과장";
		
		switch (position) {
		case "부장":
			System.out.println("성과금 : 1000만원");
			break;
		case "차장":
			System.out.println("성과금 : 500만원");
			break;
		case "과장":
			System.out.println("성과금 : 300만원");
			break;
		default:
			System.out.println("성과금 : 100만원");
			break;
		}
		
		//입력한 성적을 등급으로 환산
		//추가
		//100점일때도 A출력,
		//단, System.out.println("A") 한번만 사용할것
		
		//규칙 찾을때는 경우에따라 데이터 나열해보면 쉽게 찾을수 있다 
		//90점 이상은 A
		//80 ~ 89 B 80,81,82,83,84,85,86,87,88,89 
		//70 ~ 79 C
		//60 ~ 69 D
		Scanner sc = new Scanner(System.in);
		System.out.println("성적입력>");
		int score = sc.nextInt();
		
//		int score1 = (score/10); 
//		
//		switch(score1) {
//		
//		case 9:
//			System.out.println("A");
//			break;
//		case 8:
//			System.out.println("B");
//			break;
//		case 7:
//			System.out.println("C");
//			break;
//		case 6:
//			System.out.println("D");
//			break;
//		default : 
//			System.out.println("NO");
//			break;
//		}
		
		//-----------풀이 ------------------
		
		switch(score/10) {
		case 10: //break문이 없기 때문에 아래로 내려가서 실행후 종료
		case 9://90~99
			System.out.println("A");
			break;
		case 8://80~89
			System.out.println("B");
			break;
		case 7://70~79
			System.out.println("C");
			break;
		case 6://60~69
			System.out.println("D");
			break;
		default : //그 외
			System.out.println("NO");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
