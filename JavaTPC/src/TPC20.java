import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC20 {

	public static void main(String[] args) {
		// 자동 형변한(Object Casting / Upcasting)
		Animal d = new Dog(); // 부모에 자식을 할당하는게(상속)[부모가 자식을 가리킨다] 더 효과적이고 확장성이 좋은 프로그래밍을 만들 수 있음
		
		d.eat(); // ? -> 개
		
		Cat c = new Cat();
		
		c.eat();
		c.night();
		System.out.println("==========================");
		
		Animal c2 = new Cat();
		
		
		c2.eat(); 
//		위에서 부모가 가지고 있는 행동인 eat은 사용 가능하지만 고양이 자식클래스에만 있는 night는 접근 불가.
//		만약 cat 클래스에만 있는 함수를 사용하고 십다면 형변환을 해주기
		((Cat)c2).night(); // 이런방식으로 형변환해주기 --> downcasting(강제형변환)
		
		// Dog.class, Cat.class 파일만 받은 경우 -> 부모 클래스로 할당해서 확인해보기
		Animal ani = new Dog(); // upcasting(자동형변환)
		ani.eat();
		
		// 그게 아닌 경우 자식 클래스로 그냥 할당 하위클래스의 동작 방식을 모르더라도 사용 가능
	}
}
