package kr.tpc;

public class BookDTO {
	// class ���赵
	public String title;
	public int price;
	public String company;
	public int page;
	
	// ����Ʈ ������ �޼���� �����Ǿ��ִ�.
	public BookDTO() { // ��ü ���� -> this��� �ڱ� �ڽ��� �����ϴ� ��ü�� �������
		// �ƹ��͵� ���ϴ°� ������ ��ü�� �����ϴ� �۾��� ��(���� �ڵ�)
		// ���� ���赵 ��� ��ü�� �������� ����� �۾�
	}

	public BookDTO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
	
	
	
}
