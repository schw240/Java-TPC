import java.util.ArrayList;
import java.util.List;

import kr.tpc.BookDTO;

public class TPC38 {
	public static void main(String[] args) {
		
		// ArrayList Ȱ���غ���
		List<BookDTO> list = new ArrayList<BookDTO>(1); // Object[] --> BookDTO[]
		list.add(new BookDTO("�ڹ�", 12000, "������", 600));
		list.add(new BookDTO("C���", 17000, "������", 600));
		list.add(new BookDTO("���̽�", 15000, "������", 600));
		
		for(int i = 0; i < list.size(); i++) {
//			Object o = list.get(i);
//			BookDTO vo = (BookDTO)o;
			BookDTO vo = list.get(i); // ������ generic�� ��������Ƿ� �ٿ�ĳ�����̳� ��ĳ������ �ʿ���� BookDTO �ϳ��� ���� ����
			System.out.println(vo.title + "\t" + vo.price + "\t" + vo.company + "\t" + vo.page);
		}
	}
}
