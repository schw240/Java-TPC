import java.io.InputStream;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Project01_C {
	public static void main(String[] args) {
		String src = "info.json";
		// IO -> Stream(스트림)
		InputStream is = Project01_C.class.getResourceAsStream(src); // 이 경로에서 만들어진 곳에서 파일을 가져온다음 InputStream으로 가져와라
		if(is==null) {
			// 파일이 없다
			throw new NullPointerException("Cannot Find resource file");
		}
		
		// 불러온다음 JSON 객체로 변환해줌
		JSONTokener tokener = new JSONTokener(is); // 메모리에 올리고
		JSONObject object = new JSONObject(tokener); // JSON 객체로 바꾼다음
		JSONArray students = object.getJSONArray("students"); // 정보 빼내기
		for(int i = 0; i < students.length(); i++) {
			JSONObject student = (JSONObject)students.get(i);
			System.out.print(student.get("name"));
			System.out.print(student.get("address"));
			System.out.println(student.get("phone"));
		}
		
		
	}
}
