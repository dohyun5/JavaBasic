package com.yedam.test0407;

import java.util.List;
import java.util.Scanner;

import com.yedam.common.CafeDAO;

public class CafeImpl {

	Scanner sc = new Scanner(System.in);
	
	public void getCafeList() {
		List<CafeDTO> list = CafeDAO.getInstance().getCafeList();
		
		for(int i=0; i<list.size();i++) {
			System.out.print("메뉴 : " + list.get(i).getCoffeeMenu() + " ");
			System.out.print("가격 : " + list.get(i).getCoffeePrice());
			System.out.println();
		}
		
	}
	public void getCafe() {
		System.out.println("메뉴 입력 >");
		String coffeeMenu = sc.nextLine();
		CafeDTO cf = CafeDAO.getInstance().getCafe(coffeeMenu);
		
		if(cf != null) {
			System.out.print(cf.getCoffeeMenu()+ " ");
			System.out.print(cf.getCoffeePrice() + "\t");
			System.out.print(cf.getCoffeeExplain());
			System.out.println();
		}
	}
	
	public void cfAdd() {
		CafeDTO cf = new CafeDTO();
		
		System.out.println("메뉴 이름 입력 >");
		String cafeMenu = sc.nextLine();
		System.out.println("메뉴 가격 입력 >");
		int cafePrice = Integer.parseInt(sc.nextLine());
		System.out.println("메뉴 설명 입력 >");
		String cafeExplain = sc.nextLine();
		
		cf.setCoffeeMenu(cafeMenu);
		cf.setCoffeePrice(cafePrice);
		cf.setCoffeeExplain(cafeExplain);
		
		int result = CafeDAO.getInstance().cfAdd(cf);
		
		if(result == 1) {
			System.out.println("메뉴 등록 완료");
		}else {
			System.out.println("메뉴 등록 실패");
		}
	}
	
	public void cfSales() {
		CafeDTO cf = new CafeDTO();
		System.out.println("메뉴 입력 > ");
		String cafeMenu = sc.nextLine();
		
		cf.setCoffeeMenu(cafeMenu);
		
		
		int result = CafeDAO.getInstance().cfSalse(cf);
		if(result > 0) {
			System.out.println("판매 완료");
		}
		
		
	}
	
	public void cfDelete() {
		System.out.println("메뉴 입력");
		String cafeMenu = sc.nextLine();
		
		int result = CafeDAO.getInstance().cfDelete(cafeMenu);
		
		if(result > 0) {
			System.out.println("메뉴 삭제 완료");
		}else {
			System.out.println("메뉴 삭제 실패");
		}
		
		
		
	}
	
	public void cfSalseAll() {
		List<CafeDTO> list = CafeDAO.getInstance().getCafeSalseAll();
		int sum = 0;
		for(int i=0; i<list.size();i++) {
			System.out.print("메뉴 : " + list.get(i).getCoffeeMenu() + " ");
			System.out.print("판매갯수 : " + list.get(i).getCoffeeSales()+"개 ");
			System.out.print("판매금액 : " + (list.get(i).getCoffeePrice())*(list.get(i).getCoffeeSales()));
			System.out.println();
			sum += (list.get(i).getCoffeePrice())*(list.get(i).getCoffeeSales());		
			}
		System.out.println("총 매출액 :" + sum + "원");
	}
	
	
	
	
}
