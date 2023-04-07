package com.yedam.oop;

	public class Student {
	//학생이름, 학번, 국, 영, 수 점수를 가지는 학생
	//기본 생성자와 모든 데이터를 초기화 할 수 있다.
	//학생의 정보를 출력하는 getInfo()
	//1)총점
	//2)평균
	//-----출력결과-------
	//이름 : 김또치
	//학번 : 20230330
	//총점 : 200
	//평균 : 68.xxxx
	
	String name;
	int studentNo;
	int k;
	int e;
	int m;
	
	public Student(){
		
	}
	public Student(String name, int studentNo, int k, int e, int m){
		this.name = name;
		this.studentNo = studentNo;
		this.k = k;
		this.e = e;
		this.m = m;
	}
	//메소드 
	void getInfo() {
		System.out.println("이름 :" + name);
		System.out.println("학번 :" + studentNo);
		System.out.println("총점 :" + sum());
		System.out.println("평균 :" + avg());
	}
	int sum() {
		return k+e+m;
	}
	double avg() {
		return(double)sum()/3;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
