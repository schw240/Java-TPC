package kr.poly;

public class Cat extends Animal {
	
	
//	public void eat() { // 중복되는 기능
//		System.out.println("?");
//	}
	
	
	
	public void night() {
		System.out.println("밤에 눈에서 빛이 난다.");
	}

	@Override
	public void eat() {
//		super.eat();
		System.out.println("고양이");
	} // 재정의를 안하면 만약 Animal 객체에 Cat 객체를 넣었을 때 Animal 의 eat() 실행
}
