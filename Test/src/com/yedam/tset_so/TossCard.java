package com.yedam.tset_so;

public class TossCard extends Card{
	String company;
	String cardStaff;
	
	public TossCard(String company, String cardStaff) {
		this.company = "Toss";
		this.cardStaff = cardStaff;
	}
	
	
	@Override
	public void showCardInfo() {
		System.out.println("카드정보 - Card NO :" + cardNo + "\n" 
						+ "담당 직원 : " + cardStaff + "," + company);
	}
	
	
	
	
	
	
	
	
	
	
}
