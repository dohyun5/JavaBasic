package com.yedam.exe;

import java.util.Scanner;

import com.yedam.member.MemberService;

public class ExeApp {
	
	int menu = 0;
	MemberService ms = new MemberService();
	Scanner sc = new Scanner(System.in);
	public void run() {
		//사용할 내용 
		exe();
	}
	private void exe() {
		boolean run = true;
		String menu = "";
		while(run) {
			//로그인한 경우
			if(MemberService.memberInfo != null) {
				System.out.println("1. 회원 조회 | 2. 회원 등록 | 3. 회원 탈퇴 | 4. 회원 수정 | 5.로그 아웃");
				System.out.println("메뉴 > ");
				menu = sc.nextLine();
				switch (menu) {
				case "1":
					ms.getMemberList();
					break;
				case "2":
					ms.memberAdd();
					break;
				case "3":
					ms.memberDelete();
					break;
				case "4":
					ms.memberUpdate();
					break;
				case "5":
					ms.logout();
					break;
				}
			}
			//로그인 안한 경우
			else if(MemberService.memberInfo == null) {
				System.out.println("1. 로그인 | 2. 종료");
				System.out.println("메뉴 > ");
				menu = sc.nextLine();
				if(menu.equals("1")) {
					ms.login();
				}else {
					System.out.println("종료");
					break;
				}
			}
		}
	}

	private void menu() {
		//로그인이 되어 있냐 안되어 있냐?
		//로그인,, 메뉴를 이동할때마다 그 로그인 정보가 남아 있어야 한다.
		//정적멤버(static)
	}
	private void login() {
	}
}
