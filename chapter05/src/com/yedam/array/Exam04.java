package com.yedam.array;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		//배열에 담긴 최대, 최소값
		Scanner sc = new Scanner(System.in);
		
		int[] ary;
		int no;
		
		System.out.println("배열의 크기>");
		no = sc.nextInt();//ex)1값 입력시 값(1)만 no에들어가고 엔터는 남아있음. 따라서 아래흡수하는걸 작성 해줘야함.
		sc.nextLine();//엔터키 흡수역할
		ary = new int[no];
		
		//배열에 데이터 입력
		for(int i=0;i<ary.length; i++) {
			System.out.println("데이터 입력>");
			ary[i] = Integer.parseInt(sc.nextLine());
		}
		//최대값 구하기
		int max = 0;//int max = ary[0] 내부 데이터를 비교해야 정확하기 때문에 ary[0]쓰는게 적합
		for(int i = 0; i<ary.length; i++) {
			if(max < ary[i]) {
				max = ary[i];
			}
		}
		System.out.println("최대값 : " + max);
		
		//최소값 구하기
		int min = ary[0];
		for(int i=0; i<ary.length; i++) {
			if(min > ary[i]) {
				min = ary[i];
			}
		}
		System.out.println("최소값 : " + min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
