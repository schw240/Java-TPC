public class TPC06 {
	public static void main(String[] args) {
		
		// 5. 메서드 -> 동작(method), 기능(function)
		// 정수 2개를 더하여 총합을 구하여 리턴하는 메서드를 정의하시오.
		
		int a = 67;
		int b = 98;
		
		// 매개변수 전달기법
		// 함수가 호출될 때 값을 전달(Call by Value)
		int result = sum(a, b);
		
		System.out.println(result);
		
		int[] arr = makeArr();
		int hap = 0;
		
		for(int i = 0; i < arr.length; i++) {
			hap += arr[i];
		}
		
		System.out.println(hap);
		
	}
	
	
	// 정수 2개를 매개변수로 받아서 총합을 구하여 리턴하는 메서드를 정의하시오.
	// static을 붙이면 메모리에 로드 됨
	public static int sum(int a, int b) {
		int res = a + b;
		return res;
	}
	
	public static int[] makeArr() {
		int x = 10;
		int y= 20;
		int z = 30;
		int[] arr = new int[3];
		arr[0] = x;
		arr[1] = y;
		arr[2] = z;
		// 자바같은 경우에는 여러개 return 하고 싶은 경우 배열로 return
		return arr;
		
	}
}
