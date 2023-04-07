package com.yedam.customer;

import lombok.Data;

@Data

public class Customer {
	private int customerId;
	private String customerPw;
	private String customerName;
	private int accountId;
	private String customerGrade;
	
	//private int balance;// JOIN의 기준점으로 하기 위해 
	
	
	
}
