package com.yedam.test0407;

import java.util.Scanner;

public class Cafe {
	
	CafeImpl ci = new CafeImpl();
	Scanner sc = new Scanner(System.in);
	
	public Cafe() {
		run();
	}
	private void run() {
		while(true) {
			System.out.println("1. 메뉴 조회 | 2. 메뉴 상세 조회 | 3. 메뉴 등록 | 4. 판매 | 5. 메뉴 삭제 | 6. 매출 | 7. 종료");
			System.out.println("메뉴 입력 >");
			int menu = Integer.parseInt(sc.nextLine());
			if(menu == 1) {
				ci.getCafeList();
			}else if(menu == 2) {
				ci.getCafe();
			}else if(menu == 3) {
				ci.cfAdd();
			}else if(menu == 4) {
				ci.cfSales();
			}else if(menu == 5) {
				ci.cfDelete();
			}else if(menu == 6) {
				ci.cfSalseAll();
			}else if(menu == 7) {
				System.out.println("end of prog");
				break;
			}

			
		}
	}
	
}
