import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC23 {
	public static void main(String[] args) {
		// 1. ������ �μ�
		Dog d = new Dog();
		display(d);
		
		Cat c = new Cat();
		display(c);
	}
	// �����ε�, upcasting
	private static void display(Animal r) { // ������ �μ�
		r.eat();
//		((Cat)r).night();
		if (r instanceof Cat) { // ���� r�� cat Ÿ���̶��
			((Cat)r).night(); // downcasting
		}
	}
}
