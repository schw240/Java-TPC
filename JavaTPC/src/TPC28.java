import kr.poly.A;

public class TPC28 {
	public static void main(String[] args) {
		A a = new A();
		a.display();
		
		System.out.println(a);
		System.out.println(a.toString()); // 만약 A에 override를 안하면 Object의 toString()이 출력됨.
	
		Object o = new A(); // Upcasting
		((A)o).display();
		
		System.out.println(o.toString());
	}
}
