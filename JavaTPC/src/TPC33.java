import kr.inflearn.MyClass;

public class TPC33 {
	public static void main(String[] args) {
		// �ٸ� ��Ű���� �ִ� MyClass �����ϱ�
//		kr.inflearn.MyClass my = new kr.inflearn.MyClass(); // �̷� ��ĵ� �����ϰ� import ��ĵ� ����
		MyClass my = new MyClass();
		int v = my.sum(10, 100);
		System.out.println(v);
	}
}
