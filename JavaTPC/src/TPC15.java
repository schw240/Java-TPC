import kr.tpc.MemberVO;

public class TPC15 {
	public static void main(String[] args) {
		
		MemberVO m = new MemberVO("ȫ�浿", 40, "010-0111-1111", "����");
		// �� ��� setter �޼ҵ� �ʿ� X
		
		System.out.println(m.toString());
		
		System.out.println(m.getName());
		System.out.println(m.getAge());
		
		MemberVO m1 = new MemberVO(); // setter�Լ��� ���� �����ϰ� �̰�츦 ���� �⺻ �����ڸ� ��������� �����صѰ�
		m1.setName("���浿");
		m1.setAge(34);
		m1.setTel("010-0000-0000");
		m1.setAddr("����");
		
		System.out.print(m1.getName() + "\t");
		System.out.println(m1.getAddr() + "\t");
		System.out.println(m1.toString());
		System.out.println(m1); // m1�� ����϶�� �ϸ� m1�ȿ��� ���� 4���� �����Ͱ� �ִµ� � �����͸� ����϶�� �ϴ°����� ���� ����. ���� toString()�� ���� ��ü ��� ���� ���(�����Ǿ�����)
	}
}
