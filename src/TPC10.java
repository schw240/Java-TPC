import kr.tpc.BookDTO; // import �� ������ ������� ��������

public class TPC10 {
	public static void main(String[] args) {
		// int float, char, boolean -> PDT �⺻�ڷ���
		int a;
		a = 10;
		
		// å(BookDTO)�̶�� �ڷ����� �������� --> class
//		BookDTO b; // b�� BookDTO��� �ڷ����� �ּҸ� ������ �ִ� ���� BookDTO�� ��ü, ��ü�� ����
//		b = new BookDTO(); // �� ������ ����, ��ü�� �����ϴ� �Լ� -> Ŭ������ �ۼ��� ������ �ڵ� ȣ��(public BookDTO) ȣ�� �� ��ü ���� + this��� �ڽ��� �����ϴ� ��ü ����
		
		// ��ü ����
		BookDTO b = new BookDTO();
		b.title = "�ڹ�";
		b.price = 17000;
		b.company = "����";
		b.page = 670;
		
		System.out.print(b.title + "\t");
		System.out.print(b.price + "\t");
		System.out.print(b.company + "\t");
		System.out.print(b.page + "\t");
		
	}
}
