import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC20 {

	public static void main(String[] args) {
		// �ڵ� ������(Object Casting / Upcasting)
		Animal d = new Dog(); // �θ� �ڽ��� �Ҵ��ϴ°�(���)[�θ� �ڽ��� ����Ų��] �� ȿ�����̰� Ȯ�强�� ���� ���α׷����� ���� �� ����
		
		d.eat(); // ? -> ��
		
		Cat c = new Cat();
		
		c.eat();
		c.night();
		System.out.println("==========================");
		
		Animal c2 = new Cat();
		
		
		c2.eat(); 
//		������ �θ� ������ �ִ� �ൿ�� eat�� ��� ���������� ����� �ڽ�Ŭ�������� �ִ� night�� ���� �Ұ�.
//		���� cat Ŭ�������� �ִ� �Լ��� ����ϰ� �ʴٸ� ����ȯ�� ���ֱ�
		((Cat)c2).night(); // �̷�������� ����ȯ���ֱ� --> downcasting(��������ȯ)
		
		// Dog.class, Cat.class ���ϸ� ���� ��� -> �θ� Ŭ������ �Ҵ��ؼ� Ȯ���غ���
		Animal ani = new Dog(); // upcasting(�ڵ�����ȯ)
		ani.eat();
		
		// �װ� �ƴ� ��� �ڽ� Ŭ������ �׳� �Ҵ� ����Ŭ������ ���� ����� �𸣴��� ��� ����
	}
}
