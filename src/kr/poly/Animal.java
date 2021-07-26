package kr.poly;

public abstract class Animal { // 추상클래스는 객체 생성 불가능 부모의 역할만 함
	// Dog, Cat --> eat()
//	public void eat() {
//		System.out.println("?"); // 포괄적, 추상적
//	}
	public abstract void eat(); // 추상 메서드(불완전한 메서드)
	
	public void move() { // 구현메서드 cat에는 이상함 -> interface로 묶어주는것이 좋음
		System.out.println("무리를 지어서 이동");
	}
	
//	public Animal() {
//		super(); // new Object()
//		// 최상위 객체인 Object에 접근
//	}
	
}
