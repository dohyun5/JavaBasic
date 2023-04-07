package com.yedam.oop;

public class Book {
	
	//book이라는 클래스는 아래의 정보를 가집니다.
	//책이름, 책종류, 가격, 도서번호, 출판사
	
	String name;
	String type = "학습서";
	int price;
	String NO;
	String BS;
	
	//생성자는 3개 생성
	//1)기본 생성자
	Book(){
		
	}
	//2)모든 데이터를 초기화 할 수 있는 생성자
	Book(String name, String type, int price, String NO, String BS){
		this.name = name;
		this.type = type;
		this.price = price;
		this.BS = BS;
		this.NO = NO;
	};
	//3)책이름, 책가격, 도서번호를 받아오는 생성자
	Book(String name, int price, String NO){
		this.name = name;
		this.price = price;
		this.NO = NO;
	}
	
	
	
	//Book book1 = new Book();
	
	//public Book(String n, String ty, int p, String no, String bs) {
//		name = n;
//		type = "학습서";
//		price = p;
//		NO = no;
//		BS = bs;
//	}
	public Book(String name, int price, String NO, String BS) {
		this.name = name;
		this.price = price;
		this.BS = BS;
		this.NO = NO;
	}
	
	//메소드는 getInfo() 메소드를 가진다.
	//getInfo() 메소드를 클래스 외부에서 실행하였을때,
	//다음과 같은 출력물이 나오도록 구현.
	//객체.getInfo()
	//	# 책 이름: 혼자 공부하는 자바
	//	# 내용
	//1) 종류 : 학습서
	//2) 가격 : 24000원
	//3) 출판사 : 한빛 미디어
	//4) 도서번호 : yedam001
	void getInfo() {
		System.out.println("# 책 이름 : " + name);
		System.out.println("# 내용");
		System.out.println("종류 : " + type);
		System.out.println("가격 : " + price + "원");
		System.out.println("출판사 : " + BS);
		System.out.println("도서번호 : " + NO);
	}
	
	
	//	# 책 이름: HTML
	//	# 내용
	//1) 종류 : 학습서
	//2) 가격 : 15000원
	//3) 출판사 : 길벗
	//4) 도서번호 : yedam002
	
	//	# 책 이름: JavaScript
	//	# 내용
	//1) 종류 : 학습서
	//2) 가격 : 20000원
	//3) 출판사 : 길벗
	//4) 도서번호 : yedam003
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
