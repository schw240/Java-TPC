package kr.tpc;

public class MemberVO {
//	public String name; // public ���� �θ� ������ ������ ���� ���⶧���� ���� X
//	public int age;
//	public String tel;
//	public String addr;
	
	private String name; 
	private int age;
	private String tel;
	private String addr;
	
	public MemberVO() {} // ���� �ƹ��� �����͸� ������ �ʴ� ��� �⺻ �����ڸ� ȣ���ϴµ� ���� �ٸ� ������ �Լ��� ������ٸ� �⺻ �����ڸ� �����Ϸ��� ����� ���� �ʱ⿡ ������ �� ���� ����Ʈ �����ڸ� ��������� ������ִ� ���� ��

	public MemberVO(String name, int age, String tel, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}

	// private�� ����� ���� ������ ����ϸ� getter , setter �޼ҵ� ����ϱ�
	public String getName() {
		return name;
	}

	public void setName(String name) { // setter �޼ҵ�� return�� ���� �����Ƿ� void Ÿ��
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
	}
	
	
}
