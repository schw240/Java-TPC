import kr.tpc.*;

public class TPC29 {
	public static void main(String[] args) {
		
		A a = new A();
		display(a);
		
		B b = new B();
		display(b);
		
		
	}
	
	
	
	
	private static void display(Object o) { //Object를 활용하여 다형성과 함께 유연하게 활용하기
		if (o instanceof A) {
			((A)o).go();
		} else {
			((B)o).go();
		}
	}
	
//	private static void display(A a) {
//		
//	}
}
