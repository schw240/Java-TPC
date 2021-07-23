public class TPC07 {
	public static void main(String[] args) {
		
		int a = 20;
		float b = 56.7f;
		
		float v = sum(a, b); // Call by value(값)
		
		System.out.println(v);
		
		int[] arr = {1, 2, 3, 4, 5};
		// 배열의 총합
		int vv = arrSum(arr); // Call by Reference(번지)
		System.out.println(vv);
	}
	
	public static float sum(int a, float b) {
		float v = a + b;
		return v;
	}
	
	// 같은 클래스 내에서는 public이든 private이든 상관 없음
	private static int arrSum(int[] arr) {
		int v = 0;
		for(int i = 0; i < arr.length; i++) {
			v += arr[i];
		}
		return v;
	}
}
