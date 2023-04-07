package com.yedam.inheri;

public class Application01 {

	public static void main(String[] args) {

		Child child = new Child();
		
		child.lastName = "이";
		child.getInfo();
		//child.money = 1000; 부모에서 private로 걸어서 불러올수 없다.

	}

}
