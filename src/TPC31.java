import kr.tpc.Inflearn;

public class TPC31 {

	public static void main(String[] args) {
//		Inflearn inf = new Inflearn(); // �Ʒ�ó�� �ٲٸ� ��ü ���� �ʿ� X
		
//		inf.tpc();
		Inflearn.tpc();
		// static �޼���� �Ʒ�ó�� ���� X
//		inf.java();
		Inflearn.java(); // new�� ������� �ʰ� �ٷ� Ŭ�����̸�.Ŭ���� �޼���� ���� ����
		
		// Java API ������ private
//		System sys = new System(); // ���� �Ұ���
		System.out.println("���");
//		Math m = new Math(); // ���� �Ұ���
		Math.abs(0); 
//		�� ó�� ���� ����ϴ� ��� �����ڸ� private�� �����صΰ� ��ü ������ ���� ���� Ŭ���� �̸����� �����Ͽ� Ŭ���� �޼��� ���
	}
}
