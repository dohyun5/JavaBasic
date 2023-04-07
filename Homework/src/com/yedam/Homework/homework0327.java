package com.yedam.Homework;

public class homework0327 {

	public static void main(String[] args) {
		int iVal1 = 37;
		int iVal2 = 91;
		System.out.println("변수명1 : "+ iVal1 + "변수명2 : " + iVal2);
		
		double dVal1 = iVal2 + iVal1;
		double dVal2 = iVal2 - iVal1;
		double dVal3 = iVal2 * iVal1;
		double dVal4 = iVal2 / iVal1;
		System.out.println(dVal1);
		System.out.println(dVal2);
		System.out.println(dVal3);
		System.out.println(dVal4);
		
		short var1 = 128;
		String var2 = "B";
		int var3 = 44032;
		long var4 = 100000000000L;
		double var5 = 43.93106;
		float var6 = 301.3f;
		
		System.out.printf("%d,short\n",var1);
		System.out.printf("%s,String\n",var2);
		System.out.printf("%d,int\n",var3);
		System.out.printf("%d,long\n",var4);
		System.out.printf("%f,double\n",var5);
		System.out.printf("%f,float\n",var6);
		
		
		byte a = 35;
		byte b = 25;
		int c = 463;
		long d = 1000L;
		
		int result1 = (int)(a + c + d);
		System.out.println(result1);
		
		int result2 = a + b + c;
		System.out.println(result2);
		
		double e = 45.31;
		double result3 = c + d + e;
		System.out.println(result3);
		
		int intValue1 = 24;
		int intValue2 = 3;
		int intValue3 = 8;
		int intValue4 = 10;
		char charValue = 'A';
		String strValue = "번지";
		
		
		System.out.println(charValue + "" + (intValue1 + intValue2) + intValue3 + 
							strValue + (float)intValue4);
		//String strResult = String.valueOf(charValue) + (intValue1 + intValue2) + intValue3 + strValue + (double)intValue4; 
		//System.out.println(strResult);
		
		int value1 = 485;
		System.out.println(((value1 - 85)/100) + ((value1 - 405)/10) + ((value1 - 480)));
		
		//int hundred = value1 / 100;
	    //int ten = (value1 - (100 * hundred)) / 10;
	    //int one = (value1 - (100 * hundred) - (10 * ten));
	    //int intResult = hundred + ten + one;
	    //System.out.println(intResult);
		
		
		
		
	}

}
