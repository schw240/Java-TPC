package kr.tpc;

public class Dog extends Animal { // eat() { ? }

	// �̸�, ����, ��: ��������
	// ������ override �����Ǹ� ���� �θ� Ŭ�������� ������� ����� ������ �ҋ� ���� ���ε�
	@Override
	public void eat() { // ���� ���� 
		// �����ǰ� �Ǿ��ֱ⶧���� �θ�ü�� �ڽ� Ŭ������ �Ҵ��ص�
		// ���� ���ε��� �Ǿ� �ڽĿ� �����ǵ� ��� ���
		System.out.println("��");
	}
	
	public Dog() {
		super();  // ����Ʈ �����ڿ��� �̰� ���µǾ�����
		// super�� ���� �θ� ����
	}
}
