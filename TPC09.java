public class TPC09 {
	public static void main(String[] args) {
		int a = 56;
		int b = 40;
		
		// sum 함수에 static이 없으므로 클래스 객체 생성
		TPC09 tpc = new TPC09(); // 클래스 객체를 생성하여 heap Area에 생성
		
		int v = tpc.sum(a, b); 
		System.out.println(v);
	}
	
	public int sum(int a, int b) {
		int v = a + b;
		return v;
	}
}
