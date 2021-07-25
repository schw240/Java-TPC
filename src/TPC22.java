import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC22 {
	public static void main(String[] args) {
		
		// upcasting
		// Cat ani = new Cat();
//		Object ani = new Cat(); // Object로도 객체를 받을 수 있음 이것도 가능
		Animal ani = new Cat();
		ani.eat(); // 컴파일 시점 -> Animal, 실행시점 -> Cat
		
		// ani.night();
//		Cat c = (Cat)ani; // downcasting
//		c.night();
		((Cat)ani).night(); // 한번에 하기
		
		
		ani = new Dog();
		ani.eat();
		// 다형성
		// 상위클래스가 하위클래스에게 동일한 메세지로 서로 다르게 동작시키는 원리
		
		Object o = new Dog();
		((Animal) o).eat();
		((Dog)o).eat();
	}
}
