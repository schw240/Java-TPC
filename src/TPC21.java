import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {
	public static void main(String[] args) {
		Dog d = new Dog(); // ���� �����Ͽ� ��� ���
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
		System.out.println("==========================");
		
		// Dog.class, Cat.class ���ϸ� �������ִٸ�
		Animal ad = new Dog(); // �̷� ����� Animal�� Dog, Cat�� ��� ������ ���� ����
		Animal ac = new Cat(); // upcasting
		
		ad.eat();
		ac.eat();
		
//		ac.night(); �̰� �ȵ� �θ� Ư�� �ڽĿ� �ִ� Ÿ���� ��� �Ұ��� 
		// �ֳ��ϸ� �θ�� � �ڽĿ� � ����� �ִ��� ��
//		�ڽ��� Ÿ�Կ� �θ� ������ �� ���� -> downcasting
//		�ڽ�3 x = (�ڽ�)�θ�.�ڽı��
		((Cat)ac).night(); // �̷��� down casting�� ���� ���
		
		// �̷��� ������(Override)�� �Ǿ��ִٸ� �θ� Ŭ���� �ϳ������� �ڽ� Ŭ���� ���� ��� ����
		
		// ������!(Message Polymorphism)
		// upcasting���� ���� Ŭ������ ���� Ŭ������ ����� �Ǹ�
		// ���� Ŭ������ ���� Ŭ�������� ������ �޼����� ������
		// ���� Ŭ������ ���� Ŭ������ ���� �ٸ� ������ ���̴°�
		
	}
}
