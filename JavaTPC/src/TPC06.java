public class TPC06 {
	public static void main(String[] args) {
		
		// 5. �޼��� -> ����(method), ���(function)
		// ���� 2���� ���Ͽ� ������ ���Ͽ� �����ϴ� �޼��带 �����Ͻÿ�.
		
		int a = 67;
		int b = 98;
		
		// �Ű����� ���ޱ��
		// �Լ��� ȣ��� �� ���� ����(Call by Value)
		int result = sum(a, b);
		
		System.out.println(result);
		
		int[] arr = makeArr();
		int hap = 0;
		
		for(int i = 0; i < arr.length; i++) {
			hap += arr[i];
		}
		
		System.out.println(hap);
		
	}
	
	
	// ���� 2���� �Ű������� �޾Ƽ� ������ ���Ͽ� �����ϴ� �޼��带 �����Ͻÿ�.
	// static�� ���̸� �޸𸮿� �ε� ��
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
		// �ڹٰ��� ��쿡�� ������ return �ϰ� ���� ��� �迭�� return
		return arr;
		
	}
}
