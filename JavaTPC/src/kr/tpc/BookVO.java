package kr.tpc;

// å(Object) -> ����, ����, ���ǻ�, ��������
public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;
	
	// ����Ʈ ������ �޼���(����)
	public BookVO() {// �̷� ����� ������ ���ÿ� �ʱ�ȭ�� �̷���� ��� ��ü�� ������ ���� ������ �ǹǷ� ������ ���
		// �ʱ�ȭ �۾�
		this.title = "�ڹ�"; // ��Ȯ�� ǥ�����δ� this�� �տ��ٰ� �־��־���� ������ ���⼭�� �Ű������� ��� ������ �����ϱ� ������ ������
		this.price = 14000;
		company = "������";
		page = 780;
	} // �ٸ� �⺻ �����ڴ� �����δ� ���� ����
	
	// ������ �޼����� �ߺ�����(overloading)
	public BookVO(String title, int price, String company, int page) {
		this.title = title; // this�� �ȳ־��ָ� ��������� �ƴ� ���� �Ű������� ���� ���Ե�.
		this.price = price;
		this.company = company;
		this.page = page;
	}
}
