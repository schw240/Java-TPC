package kr.poly;

public class Dog extends Animal { // eat() { ? }

	public Dog() {
		super();  // ����Ʈ �����ڿ��� �̰� ���µǾ�����
		// super�� ���� �θ� ����
	}
	
	// �̸�, ����, ��: ��������
	// ������ override �����Ǹ� ���� �θ� Ŭ�������� ������� ����� ������ �ҋ� ���� ���ε�
	@Override
	public void eat() { // ���� ���� 
		// �����ǰ� �Ǿ��ֱ⶧���� �θ�ü�� �ڽ� Ŭ������ �Ҵ��ص�
		// ���� ���ε��� �Ǿ� �ڽĿ� �����ǵ� ��� ���
		System.out.println("��");
	}
	
}
