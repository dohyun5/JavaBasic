package com.yedam.Homework;

import java.util.Scanner;

public class homework0330 {

	public static void main(String[] args) {
		
		// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 		1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		//		출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		
		Scanner sc = new Scanner(System.in);
		int prodCount = 0;
		hw0330product[] prodAry = null;
		while(true) {
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("메뉴 입력 >");
			int selectNo = sc.nextInt();
						   sc.nextLine();
			if(selectNo == 1) {
				System.out.println("상품 수 입력 >");
				prodCount = Integer.parseInt(sc.nextLine());
				
			}else if(selectNo == 2) {
				prodAry = new hw0330product[prodCount];
				for(int i=0; i<prodAry.length ;i++) {
					prodAry[i] = new hw0330product();
					System.out.println("제품 명>");
					String prodName = sc.nextLine();
					prodAry[i].prodName = prodName;
					
					System.out.println("가격 입력>");
					int price = Integer.parseInt(sc.nextLine());
					prodAry[i].price = price;
				}
			}else if(selectNo == 3) {
				System.out.println("제품별 가격");
				for(int i=0;i<prodAry.length;i++) {
					System.out.println("제품명 : " + prodAry[i].prodName + "  가격 : " + prodAry[i].price);
				}
			}else if(selectNo == 4) {
				int max = prodAry[0].price;
				for(int i=0; i<prodAry.length;i++) {
					if(prodAry[0].price < prodAry[i].price) {
						max = prodAry[i].price;
					}
				}
				int sum = 0;
				for(int i=0; i<prodAry.length;i++) {
					sum += prodAry[i].price;
				} int sum2 = sum - max;
				
				System.out.println("가장 비싼 제품 :" + max + " 가격 합 : "+ sum2);
				
			}else if(selectNo == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			
			}
		}
	}

