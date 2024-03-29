package com.yedam.member;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class MemberDAO extends DAO{
	//team project 주석 사용 방법
	//230406 KDH MemberDAO 생성 아래 기능 구현
	//로그인 - login()
	//로그아웃 - logout()
	
	private static MemberDAO memberDao = null;
	
	private MemberDAO() {
		
	}
	public static MemberDAO getInstance() {
		if(memberDao == null) {
			memberDao = new MemberDAO();
		}
		return memberDao;
	}
	
	//1.로그인
	public Member login(String id) {
		//1. id가 틀렸다, pw가 틀렸다
		//2. 존재하지 않거나 id&pw가 틀렸습니다.
		//실습에서는 1번 사용
		
		//기능
		//1.login
		//2. 회원가입할때 id중복 체크 (프라이머리키 입력 하지 않았을때) 
		Member member = null;
		
		try {
			conn();
			String sql = "SELECT * FROM member WHERE id = ?"; 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			//정상적으로 id가 조회가 되었을 때
			if(rs.next()) {
				member = new Member();
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
				
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return member;
		
	}
	//1. 회원 조회
	public List<Member> getMemberList(){
		List<Member> list = new ArrayList<>();
		Member member = null;
		try {
			conn();
			String sql = "SELECT * FROM member";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				member = new Member();
				
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
				
				list.add(member);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	
	//2. 회원 등록
	public int memberAdd(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "insert into member values (?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getName());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return result;
	}
	
	//3. 회원 수정 - pw변경
	public int memberUpdate(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "update member set pw = ? , name = ? where id = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getPw());
			pstmt.setString(3, member.getId());
			pstmt.setString(2, member.getName());
			
			result = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		
		return result;
	}
	
	
	//4. 회원 삭제
	public int memberDelete(String id) {
		int result = 0;
		
		try {
			conn();
			String sql = "delete from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			result = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		
		
		return result;
	}
	
	
	
	
}
