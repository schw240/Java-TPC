public class TPC09 {
	public static void main(String[] args) {
		int a = 56;
		int b = 40;
		
		// sum �Լ��� static�� �����Ƿ� Ŭ���� ��ü ����
		TPC09 tpc = new TPC09(); // Ŭ���� ��ü�� �����Ͽ� heap Area�� ����
		
		int v = tpc.sum(a, b); 
		System.out.println(v);
	}
	
	public int sum(int a, int b) {
		int v = a + b;
		return v;
	}
}
