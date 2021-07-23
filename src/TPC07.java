public class TPC07 {
	public static void main(String[] args) {
		
		int a = 20;
		float b = 56.7f;
		
		float v = sum(a, b); // Call by value(��)
		
		System.out.println(v);
		
		int[] arr = {1, 2, 3, 4, 5};
		// �迭�� ����
		int vv = arrSum(arr); // Call by Reference(����)
		System.out.println(vv);
	}
	
	public static float sum(int a, float b) {
		float v = a + b;
		return v;
	}
	
	// ���� Ŭ���� �������� public�̵� private�̵� ��� ����
	private static int arrSum(int[] arr) {
		int v = 0;
		for(int i = 0; i < arr.length; i++) {
			v += arr[i];
		}
		return v;
	}
}
