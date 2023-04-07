package com.yedam.exe;

import java.util.Scanner;

import com.yedam.employees.DepImpl;

public class DepartmentResource {
	
	Scanner sc = new Scanner(System.in);
	DepImpl di = new DepImpl();
	
	public DepartmentResource() {
		run();
	}
	
	private void run() {
		while(true) {
			System.out.println("1.전체 조회 | 2. 부서 정보 조회 | 3. 부서 생성 | 4. 부서 수정 | 5. 부서 삭제 | 99. 프로그램 종료");
			System.out.println("메뉴 입력 > ");
			int menu = Integer.parseInt(sc.nextLine());
			if(menu == 1) {
				di.getDepartmentsList();
			}else if(menu == 2) {
				di.getDepartment();
			}else if(menu == 3) {
				di.depAdd();
			}else if(menu == 4) {
				di.depUpdate();
			}else if(menu == 5) {
				di.depDelete();
			}
			
			
			else if (menu == 99) {
				System.out.println("프로그램 종료");
				break;
			} 
			
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
