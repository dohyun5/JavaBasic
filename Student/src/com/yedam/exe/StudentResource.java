package com.yedam.exe;

import java.util.Scanner;

public class StudentResource {

	
	
	Scanner sc = new Scanner(System.in);
	public StudentResource() {
		run();
	}
	private void run() {
		while(true) {
			System.out.println("1. 전체 조회 | 2. 학생 등록 | 3. 학생 전공 변경 | 4. 학생 정보 삭제 | 5. 종료");
			System.out.println("메뉴 입력 > ");
			int menu = Integer.parseInt(sc.nextLine());
			
			if(menu == 1) {
				
			}else if(menu == 2) {
				
			}else if(menu == 3) {
				
			}else if(menu == 4) {
				
			}else if(menu == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
