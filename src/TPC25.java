import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC25 {
	public static void main(String[] args) {
		// 상위클래스를 사용해 하위클래스를 이용 -> 다형성
		// 상위 클래스를 추상클래스로 만들어 사용 -> 일부 다형성 보장
		
//		Animal a = new Animal(); 추상클래스는 객체생성 X
//		Upcasting(부모의 역할로만 사용 -> 명령을 내리는 쪽)
		
		// 재정의(override)가 되어있기에 이런 방식이 가능
		Animal ani = new Dog();
		ani.eat(); // override를 통해 다형성 보장 eat{?} -> eat{개}
		ani.move();
		
		ani = new Cat();
		ani.eat(); // override를 통해 다형성 보장 eat{?} -> eat{고양이}
		ani.move();
		((Cat)ani).night(); 
	}
}
