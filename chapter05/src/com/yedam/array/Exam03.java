package com.yedam.array;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		
		//한 학생의 국어, 영어, 수학 점수를 배열에 담아서 성적 관리
		
		//{국어, 영어, 수학} 순서로 들어간다고 가정
		
		Scanner sc = new Scanner(System.in);
		
		int[] point = new int[3];
		int sum = 0;
		double avg = 0;
		//학생의 성적 입력
		//국어
		//System.out.println("국어 점수>");
		//point[0] = sc.nextInt();
		//영어
		//System.out.println("영어 점수>");
		//point[1] = sc.nextInt();
		//수학
		//System.out.println("수학 점수>");
		//point[2] = sc.nextInt();
		
		for(int i=0; i<point.length;i++) {
			if(i == 0) {
				System.out.println("국어성적 입력 > ");
				point[i] = sc.nextInt();
			}else if(i == 1) {
				System.out.println("영어성적 입력 > ");
				point[i] = sc.nextInt();
			}else if(i == 2) {
				System.out.println("수학성적 입력 > ");
				point[i] = sc.nextInt();
			}
		}
		
		//학생의 점수 총 합계
		//for(int i = 0; i < point.length;i++) {
		//	sum += point[i]; 
		//}
		for(int i = 0; i < 3;i++) {
			sum += point[i]; 
		}
		System.out.println("합계 : " + sum);
		
		//학생의 성적 평균
		avg = (double)sum/point.length;
		System.out.println("평균 : " + avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
