import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC25 {
	public static void main(String[] args) {
		// ����Ŭ������ ����� ����Ŭ������ �̿� -> ������
		// ���� Ŭ������ �߻�Ŭ������ ����� ��� -> �Ϻ� ������ ����
		
//		Animal a = new Animal(); �߻�Ŭ������ ��ü���� X
//		Upcasting(�θ��� ���ҷθ� ��� -> ����� ������ ��)
		
		// ������(override)�� �Ǿ��ֱ⿡ �̷� ����� ����
		Animal ani = new Dog();
		ani.eat(); // override�� ���� ������ ���� eat{?} -> eat{��}
		ani.move();
		
		ani = new Cat();
		ani.eat(); // override�� ���� ������ ���� eat{?} -> eat{�����}
		ani.move();
		((Cat)ani).night();
	}
}
