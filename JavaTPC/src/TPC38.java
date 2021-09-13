import java.util.ArrayList;
import java.util.List;

import kr.tpc.BookDTO;

public class TPC38 {
	public static void main(String[] args) {
		
		// ArrayList 활용해보기
		List<BookDTO> list = new ArrayList<BookDTO>(1); // Object[] --> BookDTO[]
		list.add(new BookDTO("자바", 12000, "이지스", 600));
		list.add(new BookDTO("C언어", 17000, "에이콘", 600));
		list.add(new BookDTO("파이썬", 15000, "제이펍", 600));
		
		for(int i = 0; i < list.size(); i++) {
//			Object o = list.get(i);
//			BookDTO vo = (BookDTO)o;
			BookDTO vo = list.get(i); // 위에서 generic을 사용했으므로 다운캐스팅이나 업캐스팅이 필요없음 BookDTO 하나만 들어가기 떄문
			System.out.println(vo.title + "\t" + vo.price + "\t" + vo.company + "\t" + vo.page);
		}
	}
}
