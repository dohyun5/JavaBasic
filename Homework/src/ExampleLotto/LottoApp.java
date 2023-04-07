package ExampleLotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoApp {
	
	private Scanner sc = new Scanner(System.in);
	
	int menu = 0;
	
	int[] lotto = new int[6];
	List<int[]> list = new ArrayList<>();
	
	public LottoApp() {
		run();
	}
	
	
	
	private void run() {
		while(menu != 99) {
			System.out.println("메뉴를 선택해 주세요.");
			System.out.println("1. 로또 생성 2.로또 조회 99.프로그램 종료");
			menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				makeLotto();
				break;
			case 2:
				showInfo();
				break;
			case 99:
				System.out.println("프로그램 종료");
				break;
			}
			
		}	
	}
	
	private void showInfo() {
		System.out.println("구매 한 금액 > " + (list.size()*1000) + "원");
		for(int i=0; i < list.size(); i++) {
			System.out.print((i % 5 +1) + "번");
			for(int j=0; j<6;j++) {
				System.out.print(list.get(i)[j]+" ");
			}		
			System.out.println();
			
			if((i + 1)%5 == 0);{
				System.out.println("------------------------------------");
			}
		}
	}
	
	private void makeLotto() {
		//1. 입력한 금액만큼 로또번호 생성 (1줄당 천원)
		//예) 10,000원 -> 6개짜리 번호 10개
		//list에 저장.
		System.out.println("금액 투입>");
		int money = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < (money/1000); i++) {
			makeNumber();
			list.add(lotto);
		}
	}
	
	private void makeNumber() {
		//로또 번호 6개 만들기
		//단, 중복 발생하면 안된다.
		//정렬 안해도 된다.
		//잘 나오는지 출력.
		lotto = new int[6];
//		for(int i = 0; i<6 ;i++) {
//		int a = (int)(Math.random()*45+1);
//			lotto[i] = a;
//			for(int j = 0; j < lotto.length; j++) {
//				if(i != 0) {
//					if(lotto[j] == lotto[i]) {
//						i--;
//					}
//				}
//			}
//		}
		
		
//		for(int temp : lotto) {
//			System.out.println(temp);
//		}
//		for(int i=0; i<6; i++) {
//			lotto[i] = (int)(Math.random()*45+1);
//			if(i>0) {
//				for(int j = 0; j<i; j++) {
//					if(lotto[j] == lotto[i]){
//						i -= 1;
//						break;
//					}
//				}
//			}
//		}
		
		

		for(int i = 0; i< 6;i++) {
			
			int a = (int)(Math.random()*45+1);
			lotto[i] = a;
			for(int j = 0; j < i; j++) {
				if(i != j) {
					if(lotto[j] == lotto[i]) {
						i--;
					}
				}
			}
		}
//		for(int temp : lotto) {
//			System.out.printf("%d ",temp);
//			
//		}		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
