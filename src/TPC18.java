import com.google.gson.Gson;

import kr.tpc.BookVO;
import kr.tpc.MyUtil;

public class TPC18 {
	public static void main(String[] args) {
		
		// 1. Java���� �������ִ� class ��... API
		// ���ڿ�(String)
		String str = new String("APPLE"); // �ڹٿ��� �������ִ� API
		System.out.println(str.charAt(0)); // String���� charAt(index)�� ����ϸ� index ��°�� ���ڸ� return
		
		// ���������� java.lang.String �̷� ������� ����ؾ������� ���� ����ϴ� Ŭ�����̹Ƿ� �ڹٿ��� Ŭ������ ���鶧
		// import java.lang.*; �� �����Ǿ�����(����Ǿ������� ������ ����)
		
		
		
		// 2. ���� ���� ����ϴ� class ��... DTO / VO, DAO, Utility ...API
		MyUtil my = new MyUtil();
		int sum = my.hap();
		System.out.println(sum);
	
		
		// 3. �ٸ� ȸ�翡�� �������� calss��... API
		// Gson -> json http:mvnrepository.com
		Gson g = new Gson();
		BookVO vo = new BookVO("�ڹ�", 13000, "����", 800);
		String json = g.toJson(vo); // vo��� ��ü�� json �������� �������
		System.out.println(json);
	
	}
}
