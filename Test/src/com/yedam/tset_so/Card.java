package com.yedam.tset_so;

public class Card {
	int cardNo;
	int validDate;
	int cvc;
	public Card() {}
	
	public Card(int cardNo, int validDate, int cvc) {
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.cvc = cvc;
	}

	public int getCardNo() {
		return cardNo;
	}


	public int getValidDate() {
		return validDate;
	}


	public int getCvc() {
		return cvc;
	}

	
	public void showCardInfo() {
		System.out.println("카드정보 ( Card NO :" + cardNo + ", 유효기간 : " + validDate + "CVC :" + cvc);		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
