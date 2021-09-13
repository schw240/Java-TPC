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
		
		// Dog.java(X), Dog.class(O) 소스코드는 주지 않고 컴파일된 클래스파일만 줬다면? 각각의 코드에서 eat()이라는 코드가 있는지 알 수 없음
		
		// 클래스 파일만 줬다면?
//		Dog dd = new Dog();
		//dd. 객체에 접근해 만들어져있는 메소드 확인 -> 근데 이것도 이클립스같은 IDE 사용했을때나 가능
		
		// Animal <------ [Dog.class, Cat.class]
		Animal ani = new Dog(); // 부모로 받음. 하위클래스를 몰라도 부모클래스로 만들어 하위 클래스에 접근하여 기능 사용 
		ani.eat();
//		
//		ani = new Cat();
//		ani.eat();
		
		
	}
}
