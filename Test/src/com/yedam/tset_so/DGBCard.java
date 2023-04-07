package com.yedam.tset_so;

public class DGBCard extends Card{
	String company;
	String cardStaff;
	
	public DGBCard(String company, String cardStaff) {
		this.company = "대구은행";
		this.cardStaff = cardStaff;
	}
	
	
	@Override
	public void showCardInfo() {
		System.out.println("카드정보 ( Card NO :" + cardNo + ", 유효기간 : " + validDate + "CVC :" + cvc + "\n"
						+ "담당 직원 - " + cardStaff + "," + company);
	}
	
	
	
	
	
	
	
	
}
