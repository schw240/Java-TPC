import kr.poly.A;

public class TPC28 {
	public static void main(String[] args) {
		A a = new A();
		a.display();
		
		System.out.println(a);
		System.out.println(a.toString()); // ���� A�� override�� ���ϸ� Object�� toString()�� ��µ�.
	
		Object o = new A(); // Upcasting
		((A)o).display();
		
		System.out.println(o.toString());
	}
}
