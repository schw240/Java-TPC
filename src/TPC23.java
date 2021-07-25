import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC23 {
	public static void main(String[] args) {
		// 1. 다형성 인수
		Dog d = new Dog();
		display(d);
		
		Cat c = new Cat();
		display(c);
	}
	// 오버로딩, upcasting
	private static void display(Animal r) { // 다형성 인수
		r.eat();
//		((Cat)r).night();
		if (r instanceof Cat) { // 만약 r이 cat 타입이라면
			((Cat)r).night(); // downcasting
		}
	}
}
