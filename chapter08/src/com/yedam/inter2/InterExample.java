package com.yedam.inter2;

public class InterExample {
	public static void main(String[] args) {
		InterfaceC ic = new ImplementsC();
 		ic.methodA();
 		ic.methodB();
 		ic.methodC();
 		
 		
 		InterfaceB bc = new ImplementsC();
		bc.methodB();
		
		InterfaceA ac = new ImplementsC();
		ac.methodA();
		
		
	}
}
