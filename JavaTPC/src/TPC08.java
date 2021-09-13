
public class TPC08 {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		int v = add(a, b);
		
		System.out.println(v);
	}
	
	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
