package kr.poly;

public class Cat extends Animal {
	
	
//	public void eat() { // �ߺ��Ǵ� ���
//		System.out.println("?");
//	}
	
	
	
	public void night() {
		System.out.println("�㿡 ������ ���� ����.");
	}

	@Override
	public void eat() {
//		super.eat();
		System.out.println("�����");
	} // �����Ǹ� ���ϸ� ���� Animal ��ü�� Cat ��ü�� �־��� �� Animal �� eat() ����
}
