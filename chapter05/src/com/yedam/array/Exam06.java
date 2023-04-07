package com.yedam.array;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택 >");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				System.out.println("학생수 입력 >");
//				studentNum = sc.nextInt();
//				sc.nextLine();
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
				
			}else if(selectNo == 2) {
				for(int i=0; i<=scores.length;i++) {
					if(i == 0) {
						System.out.println("첫번째 입력 > ");
						scores[i] = Integer.parseInt(sc.nextLine());
					}else if(i == 1) {
						System.out.println("두번째 입력 > ");
						scores[i] = Integer.parseInt(sc.nextLine());
					}else if(i == 2) {
						System.out.println("세번째 입력 > ");
						scores[i] = Integer.parseInt(sc.nextLine());
					}
				}
			}else if(selectNo == 3) {
				System.out.println("scores[0]>" + scores[0] + "\n" + "scores[1]>" + scores[1] + "\n" + "scores[3]>" + scores[2]);
				
			}else if(selectNo == 4) {
				int max = 0;
				for(int i = 0; i < scores.length;i++) {
					if(max < scores[i]) {
						max = scores[i]; 
					}
				}
				int sum = 0;
				for(int i = 0; i < scores.length;i++) {
					sum += scores[i];
				}
				double avg = (double)sum/scores.length;
				System.out.println("최고점수 : " + max + "\n" + "평균점수 : " + avg);
				
				
			}else if(selectNo == 5) {
				run = false;
				break;
			}
			
		}
		System.out.println("프로그램 종료");
		
		
		
		
	}
}
