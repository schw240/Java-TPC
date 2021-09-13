import java.awt.List;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import kr.inflearn.BookDTO;;


public class Project01_A {
	
	
	
	public static void main(String[] args) {
		//Object(BookDTO) -> JSON(String)
		BookDTO dto = new BookDTO("자바", 21000, "에이콘", 670);
		Gson g = new Gson();
		String json = g.toJson(dto); // JSON으로 변환
		System.out.println(json); 
		
		// 객체로 다시 변환
		BookDTO dto1 = g.fromJson(json, BookDTO.class);
		System.out.println(dto1);
		System.out.println(dto1.getTitle());
		
		// 여러개 데이터로
		// Object(List<BookDTO>) -> JSON(String) : [{  }, {  }....]
		ArrayList<BookDTO> lst = new ArrayList<BookDTO>();
		lst.add(new BookDTO("자바1", 21000, "에이콘1", 570));
		lst.add(new BookDTO("자바2", 31000, "에이콘2", 670));
		lst.add(new BookDTO("자바3", 11000, "에이콘3", 770));
		
		String lstJson = g.toJson(lst);
		System.out.println(lstJson);
		
		
		// JSON(String) -> Object(List<BookDTO>)
		ArrayList<BookDTO> lst1 = g.fromJson(lstJson, new TypeToken<ArrayList<BookDTO>>() {}.getType());
		for(BookDTO vo : lst1) {
			System.out.println(vo);
		}
	}
}
