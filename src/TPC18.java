import com.google.gson.Gson;

import kr.tpc.BookVO;
import kr.tpc.MyUtil;

public class TPC18 {
	public static void main(String[] args) {
		
		// 1. Java에서 제공해주는 class 들... API
		// 문자열(String)
		String str = new String("APPLE"); // 자바에서 제공해주는 API
		System.out.println(str.charAt(0)); // String에서 charAt(index)을 사용하면 index 번째의 문자를 return
		
		// 원래같으면 java.lang.String 이런 방식으로 사용해야하지만 자주 사용하는 클래스이므로 자바에서 클래스를 만들때
		// import java.lang.*; 이 생략되어있음(적용되어있지만 보이지 않음)
		
		
		
		// 2. 직접 만들어서 사용하는 class 들... DTO / VO, DAO, Utility ...API
		MyUtil my = new MyUtil();
		int sum = my.hap();
		System.out.println(sum);
	
		
		// 3. 다른 회사에서 만들어놓은 calss들... API
		// Gson -> json http:mvnrepository.com
		Gson g = new Gson();
		BookVO vo = new BookVO("자바", 13000, "영진", 800);
		String json = g.toJson(vo); // vo라는 객체를 json 형식으로 만들어줌
		System.out.println(json);
	
	}
}
