import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC22 {
	public static void main(String[] args) {
		
		// upcasting
		// Cat ani = new Cat();
//		Object ani = new Cat(); // Object�ε� ��ü�� ���� �� ���� �̰͵� ����
		Animal ani = new Cat();
		ani.eat(); // ������ ���� -> Animal, ������� -> Cat
		
		// ani.night();
//		Cat c = (Cat)ani; // downcasting
//		c.night();
		((Cat)ani).night(); // �ѹ��� �ϱ�
		
		
		ani = new Dog();
		ani.eat();
		// ������
		// ����Ŭ������ ����Ŭ�������� ������ �޼����� ���� �ٸ��� ���۽�Ű�� ����
		
		Object o = new Dog();
		((Animal) o).eat();
		((Dog)o).eat();
	}
}
