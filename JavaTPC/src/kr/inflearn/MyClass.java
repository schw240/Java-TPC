package kr.inflearn;

public class MyClass { // ���� ��Ű���� �ִ� ���¿��� public�� ����� �⺻������ default ���������ڰ� ����� (���� ��Ű���� public, �ٸ� ��Ű���� private)
	public int sum(int a, int b) {
		int hap = 0;
		for(int i = a; i <= b; i++) {
			hap += i;
		}
		
		return hap;
	}
	
}
