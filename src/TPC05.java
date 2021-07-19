
public class TPC05 {
	public static void main(String[] args) {
		
		int[] a = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		System.out.println(sum);
		
		// 9개의 정수형 변수를 2차원 구조로 만들기
		
		int[][] mat = new int[3][4];
		
		int num = 1;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = num;
				num += 1;
			}
		}
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		// 가변길이 배열
		int[][] star = new int[5][];
		star[0] = new int[1];
		star[1] = new int[2];
		star[2] = new int[3];
		star[3] = new int[4];
		star[4] = new int[5];
		
		for(int i = 0; i < star.length; i++) {
			for(int j = 0; j < star[i].length; j++) {
				star[i][j] = '*';
				System.out.print((char)star[i][j]);
			}
			System.out.println();
		}
		
		
		
	}
}
