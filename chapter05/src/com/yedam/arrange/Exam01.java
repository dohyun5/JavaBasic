package com.yedam.arrange;

import java.util.Calendar;

public class Exam01 {

	public static void main(String[] args) {
		week today = null;
		
		Calendar cal = Calendar.getInstance();
		int Week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(Week) {
		case 1:
			today = week.SUNDAY;
			break;
		case 2:
			today = week.MONDAY;
			break;
		case 3:
			today = week.TUESDAY;
			break;
		case 4:
			today = week.WEDNESDAY;
			break;
		case 5:
			today = week.THURSDAY;
			break;
		case 6:
			today = week.FRIDAY;
			break;
		case 7:
			today = week.SATURDAY;
			break;
		}
		System.out.println("오늘 요일 : " + today);
		
		
		
		
		

	}

}
