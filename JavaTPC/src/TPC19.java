import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC19 {

	public static void main(String[] args) {
		// Dog, cat --> Animal
		
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		
		// Dog.java(X), Dog.class(O) �ҽ��ڵ�� ���� �ʰ� �����ϵ� Ŭ�������ϸ� ��ٸ�? ������ �ڵ忡�� eat()�̶�� �ڵ尡 �ִ��� �� �� ����
		
		// Ŭ���� ���ϸ� ��ٸ�?
//		Dog dd = new Dog();
		//dd. ��ü�� ������ ��������ִ� �޼ҵ� Ȯ�� -> �ٵ� �̰͵� ��Ŭ�������� IDE ����������� ����
		
		// Animal <------ [Dog.class, Cat.class]
		Animal ani = new Dog(); // �θ�� ����. ����Ŭ������ ���� �θ�Ŭ������ ����� ���� Ŭ������ �����Ͽ� ��� ��� 
		ani.eat();
//		
//		ani = new Cat();
//		ani.eat();
		
		
	}
}
