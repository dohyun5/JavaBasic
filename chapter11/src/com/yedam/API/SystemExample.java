package com.yedam.API;

public class SystemExample {
	public static void main(String[] args) {
		//System 클래스
		//System.exit(0) - 강제종료
//		for(int i=0; i<=10; i++) {
//			System.out.println(i);
//			if(i==5) {
//				System.exit(0);//확실하게 관리할 자신이 없으면 사용하지 말자. system 안에는 어지간하면 static
//			}
//		}
//		System.out.println("프로그램 종료");
		
		//현재 시간 읽기
		long time1 = System.nanoTime();
		
		int sum = 0;
		
		for(int i=0;i<=1000000; i++) {
			sum += i;
		}
		long time2 = System.nanoTime();
		System.out.println(time1);
		System.out.println(time2);
		System.out.println("1~1000000의 합 : "+ sum);
		System.out.println("소요 시간 : " + (time2-time1) + "나노 초 소요");
		
		System.out.println(System.currentTimeMillis());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
