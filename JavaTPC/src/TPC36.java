import kr.inflearn.IntArray;

public class TPC36 {
	public static void main(String[] args) {
		// 정수 3개를 배열에 저장하고 출력
		
		
		// 사용법
//		int[] a = new int[3];
//		
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
//		
//		int v = a[1];
//		
//		int len = a.length;
//		
//		for(int i = 0; i < len; i++) {
//			System.out.println(a[i]);
//		}
		
		
		// 우리가 만든 IntArray 사용해보기
		IntArray arr = new IntArray(5); // 안에 초기값을 안넣으면 10개, 넣으면 해당 개수만큼
		arr.add(10);
		arr.add(20);
		arr.add(30);
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
