package kr.poly;

public abstract class Animal { // �߻�Ŭ������ ��ü ���� �Ұ��� �θ��� ���Ҹ� ��
	// Dog, Cat --> eat()
//	public void eat() {
//		System.out.println("?"); // ������, �߻���
//	}
	public abstract void eat(); // �߻� �޼���(�ҿ����� �޼���)
	
	public void move() { // �����޼��� cat���� �̻��� -> interface�� �����ִ°��� ����
		System.out.println("������ ��� �̵�");
	}
	
//	public Animal() {
//		super(); // new Object()
//		// �ֻ��� ��ü�� Object�� ����
//	}
	
}
