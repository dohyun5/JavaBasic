package com.yedam.tset_so;

public class Application0405 {
	public static void main(String[] args) {
		int price = 10000;
		
		System.out.println("*** 카드로 결제 시 할인정보");
		Payment card = new CardPayment(0.08);
		card.showInfo();
		System.out.println("온라인 결제 금액 : " + card.online(price));
		System.out.println("오프라인 결제 금액 : " + card.offline(price));
		
		System.out.println("*** 간결제 시 할인정보");
		Payment simple = new SimplePayment(0.05);
		simple.showInfo();
		System.out.println("온라인 결제 금액 : " + simple.online(price));
		System.out.println("오프라인 결제 금액 : " + simple.offline(price));
		
	
		
	}
}
