package com.yedam.member;

import java.util.List;
import java.util.Scanner;

public class MemberService {
		//impl = service	
		//로그인이 되어 있냐 안되어 있냐?
		//로그인,, 메뉴를 이동할때마다 그 로그인 정보가 남아 있어야 한다.
		//정적멤버(static)
		//1. login
		//login 성공시 
		//login -> id/pw -> 정보 조회 성공 -> 로그인
		//로그인 -> 정적 필드에게 로그인한 정보를 입력.
		//login 실패시
		//정보 조회 실패 -> 정적 필드에 데이터 안 넣어 준다.
		public static Member memberInfo = null; //  이 한줄이 무엇을 의미하는지 이해해야 함! 
		Scanner sc = new Scanner(System.in);
		public void login() {
			//id 입력
			System.out.println("ID > ");
			String id = sc.nextLine();
			
			System.out.println("PW > ");
			String pw = sc.nextLine();
			
			//1. member == null (id가 없다)
			//2. member != null (회원 정보가 있다)
			Member member = MemberDAO.getInstance().login(id);
			if(member != null) {
				if(member.getPw().equals(pw)) {
					System.out.println("정상 로그인 되었습니다.");
					System.out.println(member.getName() + "님 환영합니다.😉");
					memberInfo = member;//정보 전달.
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
			
		}
		
		public void logout() {
			memberInfo = null;
			System.out.println("로그 아웃 성공.");
		}
		
		//전체 조회
		public void getMemberList() {
			List<Member> list = MemberDAO.getInstance().getMemberList();
			for(Member member : list) {
				System.out.println("ID : " + member.getId());
				System.out.println("PW : " + member.getPw());
				System.out.println("NM : " + member.getName());
				
			}
		}
		// 회원 등록
		public void memberAdd() {
			
			String id = "";
			
			while(true) {
				System.out.println("ID > ");
				id = sc.nextLine();
				Member member = MemberDAO.getInstance().login(id);
				if(member == null) { //member 대신에 MemberDAO.getInstance().login(id) 사용 가능   if문 안에 메소드는 반드시 실행되고 그 결과값을 가져오는것.
					System.out.println("회원가입 가능");
					break;
				}else {
					System.out.println("ID중복, 재입력");
				}
			}
			
			System.out.println("PW > ");
			String pw = sc.nextLine();
				
			System.out.println("이름 > ");
			String name = sc.nextLine();
			
			Member member = new Member();
			member.setId(id);
			member.setPw(pw);
			member.setName(name);
			
			int result = MemberDAO.getInstance().memberAdd(member);
			
			if(result == 1) {
				System.out.println("회원 등록 성공");
			}else {
				System.out.println("회원 등록 실패");
			}
		}
		
		//회원 수정 
		//login 되어있는 정보를 수정하는지 -> 실시간으로 로그인된 정보도 바꿔 줘야 한다.(데이터의 무결성)
		//login 되어있지 않은 정보를 수정하는지 
		public void memberUpdate() {
			System.out.println("ID>");
			String id = sc.nextLine();
			
			System.out.println("PW > ");
			String Pw = sc.nextLine();
			
			System.out.println("NAME > ");
			String Name = sc.nextLine();
			
			Member member = new Member();
			member.setId(id);
			member.setPw(Pw);
			member.setName(Name);
			
			int result = MemberDAO.getInstance().memberUpdate(member);
			
			if(result > 0) {
				//실시간으로 로그인된 정보도 바꿔 줌.
				if(id.equals(memberInfo.getId())) {
					memberInfo = MemberDAO.getInstance().login(id);
					// 수정하고 DB의 데이터와도 일치 해야 하기때문에 바로 업데이트 해줘야한다. 
					// DB데이터 먼저 업데이트 하고 그 결과값을 비교한뒤 로그인정보를 변경 적용할것.
				}
			}else {
				System.out.println("PW 변경 실패");
			}
		}
			//회원 탈퇴
			public void memberDelete() {
				System.out.println("삭제 ID > ");
				String id = sc.nextLine();
				
				int result = MemberDAO.getInstance().memberDelete(id);
			
			
			if(result > 0) {
				if(id.equals(memberInfo.getId())) {
					memberInfo = null;
				}
			}else {
				System.out.println("삭제 완료");
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	
}
