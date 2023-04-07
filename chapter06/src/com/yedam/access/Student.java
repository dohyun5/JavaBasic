package com.yedam.access;

public class Student {
	//이름, 학과, 학년, 과목별 점수
	//과목 - programing, database, os
	//모든 필드 => 접근 제한자 private
	//setter를 통해서 필드 초기화
	//getter를 통해서 필드(데이터) reading
	//getInfo를 활용해서 학생의 정보를 출력
	
	//필드
	private String stdName;
	private String major;
	private String stdGrade;
	private int programing;
	private int database;
	private int os;
	
	//생성자
	
	
	
	//메소드
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getStdGrade() {
		return stdGrade;
	}
	public void setStdGrade(String stdGrade) {
		this.stdGrade = stdGrade;
	}
	public int getPrograming() {
		//만약에 programing 점수를 0.5배 해서 성적을 표현 하고 싶다면.
		return (int)(programing*1.5);
	}
	public void setPrograming(int programing) {
		//만약 programing 점수가 0 미만인 점수가 들어올 경우
		//그 점수를 0점으로 처리하겠다. 그렇지 않으면 입력한 점수를 객체에 저장.
//		if(programing < 0) {
//			this.programing = 0;
//			return;//메소드 종료 (return값이 없는 void에서 return사용은 메소드 종료하겠다는 의미)
//		}else {
//			this.programing = programing;
//			
//		}
		
		this.programing = (programing<0) ? 0 : programing; //위의 if문 삼항연산자 사용
	}
	public int getDatabase() {
		return database;
	}
	public void setDatabase(int database) {
		this.database = database;
	}
	public int getOs() {
		return os;
	}
	public void setOs(int os) {
		this.os = os;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
