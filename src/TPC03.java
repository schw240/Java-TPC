import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {

	public static void main(String[] args) {
		// ���踦 �����ϱ�. PDT vs UDDT
		// ���� 1���� �����ϱ� ���� ������ �����Ͻÿ�.
		
		// å 1���� �����ϱ� ���� ���� ����.
		Book b; // b�� ��ü ����
		b = new Book(); // å�� �����ؼ� ����
		b.title = "�ڹ�";
		b.price = 15000;
		b.company = "�Ѻ��̵��";
		b.page = 700;
		
        System.out.print(b.title+"\t"); 
        System.out.print(b.price+"\t");
        System.out.print(b.company+"\t"); 
        System.out.println(b.page);
		
        PersonVO p;
        p = new PersonVO();
        p.name = "������";
        p.age = 28;
        p.weight = 83.2f;
        p.height = 180.2f;
        
        
        System.out.print(p.name+"\t"); 
        System.out.print(p.age+"\t");
        System.out.print(p.weight+"\t"); 
        System.out.println(p.height+"\t");
	}

}
