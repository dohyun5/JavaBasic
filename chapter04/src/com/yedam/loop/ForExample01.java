package com.yedam.loop;

import java.util.Scanner;

public class ForExample01 {

	public static void main(String[] args) {
		int sum = 0;
//		sum = sum + 1;
//		sum = sum + 2;
//		sum = sum + 3;
//		sum = sum + 4;
//		sum = sum + 5;
//		//1에서 5까지의 합
//		System.out.println(sum);
		
		//규칙찾기도 중요하지만 i의 활용을 어떻게 할지 고민할것! 
		for(int i = 1; i <= 5; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		//1~100사이의 짝수 구하기
		//짝수 -> 2 4 6 8 10 ...
		//홀수 -> 1 3 5 7 9 ...
//		for(int i = 0; i <= 100; i++) {
//			if(i%2 == 0) {
//				System.out.println(i + "는 짝수");
//			}else {
//				System.out.println(i + "는 홀수");
//			}
//		}
		
//		for(int i = 0; i <= 100; i++) {
//			if(i%2 == 1) {
//				System.out.println(i + "는 홀수");
//			}
//		}
		
		//입력한 숫자에 대한 구구단 출력
		//구구단만 출력 -> 입력 구구단 출력
		
		//2x1 = 2, 2x2 = 4, 2x3 = 6
//		for(int i = 1; i < 10; i++) {
//			System.out.println("2 x " + i + " = " + (2*i));
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("구구단 입력>");
//		int gugu = sc.nextInt();
//		for(int i = 1; i <= 9;i++) {
//			System.out.println(gugu + " x " + i + " = " + (gugu*i));
//		}
		
		//입력한 값에 대한 총합, 평균, 최대값, 최소값, "데이터를 받을 개수"를 스캐너 활용해서 데이터 입력	
									//"데이터를 받을 개수" = 반복문 횟수	
		//총합 : 입력 받자 마자 총합이라는 변수에 누적 합계
		//평균 : 총합 / 데이터 입력 개수
		//최대값 : 입력한 데이터와 기존에 들어 있는 데이터 비교 더 큰값
		//최소값 : 입력한 데이터와 기존에 들어 있는 데이터 비교 더 작은값
		
//		int total = 0;
//		double avg = 0;
//		int max = 0;
//		int min = 0;
		
		//데이터 입력
//		System.out.println("데이터 입력 개수>");
		
		//입력할 데이터 갯수 입력 받음
//		int count = sc.nextInt();
//		for(int i = 0; i < count; i++) {
//			System.out.println("데이터 입력>");
//			int data = sc.nextInt();
//			//총합 : total
////			total = total + data;
//			total += data;
//			//최대값, 최소값 초기값 설정
//			if(i==0) {
//				max = data;
//				min = data;
//			}else {
//				if(max < data) {
//					max = data;
//				}
//				if(min > data) {
//					min = data; //else로 사용하면 min값이 조건에 맞지 않게 들어갈수있음.
//				}
//			}
//		
//		}
		//반복문 결과 출력
//		System.out.println("총합 : " + total);
//		System.out.println("평균 : " + (total/(double)count));
//		System.out.println("최대값 : " + max + "최소값 : " + min);
		
		//up & down
		//임의 랜덤값 (1~100)사이의 하나의 정수를 추출해서
		//5번 기회안에 해당하는 랜덤 값을 맞추는 프로그램 구현.
		//예시) 랜덤값 50 
		//입력값 : 30
		//=> up
		//입력값 : 70
		//=> down
		//정답 일 경우
		//=> 정답, 몇번의 기회만에 맞추셨습니다. 맞춘후 break로 빠져나옴
		//정답을 맞추지 못할 경우
		//실패 하였습니다.
		
//		int randomNo = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
//		System.out.println(randomNo);
//		System.out.println("예측 값>");
//		
//		
//		for(int i = 1; i < 6; i++) {	
//			int input = sc.nextInt();
//			if(randomNo == input) {
//				System.out.println("정답," + i + "번의 기회에 맞추셨습니다");
//				break;
//			}
//			else if(randomNo > input) {
//				System.out.println("up");
//			} 
//			else if(randomNo < input) {
//				System.out.println("down");
//			}
//			System.out.println("실패하였습니다.");				
//		}
		//------------------풀이---------------------------
	
		int randomNo = (int)(Math.random()*100)+1;
		
		for(int i=1; i<=5;i++) {
			System.out.println("UP & DOWN>>");
			int num = sc.nextInt();
			
			if(randomNo == num) {
				System.out.println(i + "번의 기회에 맞추셨습니다.");
				break;
			}else if (randomNo > num) {
				System.out.println("up");
			}else if (randomNo < num) {
				System.out.println("down");
			}
			if(i == 5) {
				System.out.println("기회를 모두 소진하였습니다.");
			}
		}
		
		// i = 0 이고 i < 6 일때 왜 안나옴?
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
