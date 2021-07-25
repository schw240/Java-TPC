package kr.tpc;

public class Animal {
	// Dog, Cat --> eat()
	public void eat() {
		System.out.println("?"); // 포괄적, 추상적
	}
	
	public Animal() {
		super(); // new Object()
		// 최상위 객체인 Object에 접근
	}
	
}
