package com.yedam.test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		//Q.1
		int x = 10;
		double y = 2.0;
		
		System.out.println(x + "+" + y + " = " + (double)(x+y));
		System.out.println(x + "-" + y + " = " + (double)(x-y));
		System.out.println(x + "x" + y + " = " + (double)(x*y));
		System.out.println(x + "/" + y + " = " + (double)(x/y));
		
		
		//Q.2
		int num1 = 10;
		int num2 = 20;
		boolean result;
		
		result = ((num1 > 10) && (num2 > 10));
		System.out.println(result); 			//false
		result = ((num1 > 10) || (num2 > 10));
		System.out.println(result);				//true
		System.out.println(!result);			//false
		
		
		//Q.3
		//큰 금액부터 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money=" + money);
		
		for(int i=0; i <coinUnit.length;i++) {
			//if(money/coinUnit[i] > 0) {
				System.out.println(coinUnit[i] + "원" + money/coinUnit[i] + "개");
				money %= coinUnit[i];
			//}
		}
		
		//Q.4
		for(int i=2; i<10;i++) {
			for(int j=1;j<10;j++) {
				if(j <= i) {
					System.out.println(i + "x" + j + "=" + i*j);
				}
			}
		}
		
	
		
		//Q.5
//		Scanner sc = new Scanner(System.in);
//		int menu = 0;
//		int saiNo = 0;
//		while(true) {
//			System.out.println("===1.주사위 크기 2.주사위 글리기 3.결과 보기 4.가장 많이 나온 수 5. 종료 ===");
//			System.out.println("메뉴 >");
//			menu = sc.nextInt();
//			int[] saiAry = new int[saiNo];
//			if(menu == 1) {
//				System.out.println("주사위 크기(5~10) >");
//				int sai = sc.nextInt();
//				if(sai > 10) {
//					System.out.println("주사위 크기를 다시 설정해주세요");
//					//break;
//				}else if(sai < 5) {
//					System.out.println("주사위 크기를 다시 설정해주세요");
//				}else {
//					saiNo = sai;
//				}
//			}else if(menu == 2) {
//				int a = (int)((Math.random()*saiNo));
//				for(int i=1; i<=saiAry.length;i++) {
//					if((int)(a+1) == 5) {
//						System.out.println("5가 나올 때까지 주사위를"+ i +"번 굴렸습니다.");
//						break;
//					}else if((int)(a+1) != 5){
//						saiAry[saiNo] ++;
//					}
//				}
//			}else if(menu == 3) {
//				System.out.println("결과 >");
//				for(int i=0; i <= saiAry.length;i++) {
//					System.out.println((i+1) + "=" + saiAry[i]);
//				}
//			}else if(menu == 4) {
//				int max = 0;
//				for(int i = 0; i<saiAry.length; i++) {
//					if(max < saiAry[i]) {
//						max = saiAry[i];
//					}
//				}
//				System.out.println("가장 많이 나온 수>" + max );
//			}else if(menu == 5) {
//				System.out.println("프로그램 종료");
//				break;
//			}
//		}
			//-------------5번 풀이--------------------------------
			
			Scanner sc = new Scanner(System.in);
			int size = 0; //주사위 크기
			int[] dice = null;
			boolean run = true;
			
			while(run) {
				System.out.println("===1.주사위 크기 2.주사위 글리기 3.결과 보기 4.가장 많이 나온 수 5. 종료 ===");
				System.out.println("메뉴 >");
				
				String selectNo = sc.nextLine();
				switch (selectNo) {
				case "1":
					System.out.println("주사위 크기>");
					size = Integer.parseInt(sc.nextLine());
					if(size < 5 || size > 10) {
						System.out.println("5~10사이의 수를 입력하세요.");
						size = 0;
					}
					break;
				case "2":
					//만약 주사위의 크기가 5보다 작고 10보다 크다면 ? 
//					if(size != 0) {
//						//주사위를 돌린다.
//					}else {
//						System.out.println("주사위 크기 재입력 하세요.");
//					}
					//주사위 크기 설정
					dice = new int[size];
					//몇번 반복 했는지
					int count = 0;
					//5가 언제 나올지 모르기때문에 , while 나올때 까지 반복문을 사용하기 위함.
					while(true) {
						int random = (int)(Math.random()* size)+1;
						System.out.println(random);
						//각 주사위 숫자 -> 배열 저장
						//dice[random-1] = dice[random-1]+1;
						//주사위 숫자 1,2,3,4,5
						//배열에 저장 0,1,2,3,4
						
						dice[random-1]++;
						count++;
						if(random == 5) {
							break;
						}
					}
					System.out.println("5가 나올 때까지 주사위를" + count + "번 굴렸습니다.");
					break;
				case "3":
					for(int i=0; i<dice.length;i++) {
						System.out.println((i+1) + "은" + dice[i] + "번 나왔습니다");
					}
					
					break;
				case "4":
					int max = dice[0];
					int index = 0;
					for(int i=0;i<dice.length;i++) {
						if(max < dice[i]) {
							max = dice[i];
							index = i;
						}
					}
					System.out.println("가장 많이 나온 수는" + (index+1) + "입니다.");
					break;
				case "5":
					System.out.println("프로그램 종료");
				}
				break;
			}
	
		
	}
}

