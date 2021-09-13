//import java.lang.*; 이게 기본 적용되어있음


public class TPC34 {
	public static void main(String[] args) {
		// String -패키지는 기본적으로 내장되어있음

//		java.lang.String str = new java.lang.String("APPLE"); // String 클래스가 객체라는 이유
		String str = new String("APPLE");
		String v = str.toLowerCase();
		System.out.println(v);
		System.out.println(str.charAt(3));
		System.out.println(str.length());
		System.out.println(str.indexOf("PL")); // start position 반환
		System.out.println(str.indexOf("PX")); // 실패시 -1 반환
		System.out.println(str.replaceAll("P", "X")); // AXXLE 
		
		
		
		
		
		
		
		
		
		
	}
}
