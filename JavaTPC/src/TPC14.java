import kr.tpc.MemberVO;

public class TPC14 {
	public static void main(String[] args) {
		
//		MemberVO m = new MemberVO();
//		m.name = "ȫ�浿";
//		m.age = 50;
//		m.tel = "010-0000-0000";
//		m.addr = "����"; private���� �ٲٸ� ���� �Ұ�(���� ����, ��ȣ)
		

		MemberVO m = new MemberVO(); // ���� �ƹ��� �����͸� ������ �ʴ� ��� �⺻ �����ڸ� ȣ���ϴµ� ���� �ٸ� ������ �Լ��� ������ٸ� �⺻ �����ڸ� �����Ϸ��� ����� ���� �ʱ⿡ ������ �� ���� ����Ʈ �����ڸ� ��������� ������ִ� ���� ����
		// setter �޼��� ���
		m.setName("ȫ�浿");
		m.setAge(50);
		m.setTel("010-0000-0000");
		m.setAddr("����");
		
		System.out.print(m.getName() + "\t");
		System.out.print(m.getAge() + "\t");
		System.out.print(m.getTel() + "\t");
		System.out.print(m.getAddr() + "\t");
		
		
	}
}
