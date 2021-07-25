import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {
	public static void main(String[] args) {
		Dog d = new Dog(); // 직접 접근하여 기능 사용
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
		System.out.println("==========================");
		
		// Dog.class, Cat.class 파일만 가지고있다면
		Animal ad = new Dog(); // 이런 방식은 Animal과 Dog, Cat이 상속 관계일 때만 가능
		Animal ac = new Cat(); // upcasting
		
		ad.eat();
		ac.eat();
		
//		ac.night(); 이게 안됨 부모가 특정 자식에 있는 타입은 사용 불가능 
		// 왜냐하면 부모는 어떤 자식에 어떤 기능이 있는지 모름
//		자식의 타입에 부모가 맞춰줄 수 있음 -> downcasting
//		자식3 x = (자식)부모.자식기능
		((Cat)ac).night(); // 이렇게 down casting을 통해 사용
		
		// 이렇게 재정의(Override)만 되어있다면 부모 클래스 하나만으로 자식 클래스 전부 사용 가능
		
		// 다형성!(Message Polymorphism)
		// upcasting으로 상위 클래스로 하위 클래스를 만들게 되면
		// 상위 클래스가 하위 클래스에게 동일한 메세지를 보낼때
		// 상위 클래스와 하위 클래스가 서로 다른 반응을 보이는것
		
	}
}
