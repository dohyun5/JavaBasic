package com.yedam.tset_so;

public class CardPayment implements Payment{
	
	
	double cardRatio;
	
	public CardPayment(double asd) {
		this.cardRatio = asd;
	}

	@Override
	public int online(int price) {

		return (int)(price-(ONLINE_PAYMENT_RATIO + cardRatio)*price);
		
	}

	@Override
	public int offline(int price) {
		
		return (int)(price-(OFFLINE_PAYMENT_RATIO + cardRatio)*price);
	}

	@Override
	public void showInfo() {
		System.out.println("온라인 결제시 총 할인율 :" + (double)(ONLINE_PAYMENT_RATIO + cardRatio));
		System.out.println("오프라인 결제시 총 할인율 : " + (double)(OFFLINE_PAYMENT_RATIO + cardRatio));
		
	}
	
	
	
	
	
	
}
