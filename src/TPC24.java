import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC24 {
	public static void main(String[] args) {
		// 2. 다형성 배열
		// Dog, Cat 저장할배열을 생성하시오
		
		Animal[] ani = new Animal[2];
		ani[0] = new Dog();
		ani[1] = new Cat();
		
		for(int i = 0; i < ani.length; i++) {
			ani[i].eat();
			if (ani[i] instanceof Cat) {
				((Cat)ani[i]).night();
			}
//			((Cat)ani[i]).night(); // 만약 Dog타입이면 에러생김
		} // end of for
		
		System.out.println("=========================");
		
		display(ani);
		
	}

	private static void display(Animal[] ani) { // 다형성 배열
		for(int i = 0; i < ani.length; i++) {
			ani[i].eat();
			if (ani[i] instanceof Cat) {
				((Cat)ani[i]).night();
			}
//			((Cat)ani[i]).night(); // 만약 Dog타입이면 에러생김
		} // end of for
		
	}
	
	
}
