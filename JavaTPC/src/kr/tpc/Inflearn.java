package kr.tpc;

public class Inflearn {
	private Inflearn() {} // 객체 생성을 금지하기 위해 생성자를 private로 설정
	// static이 안붙은 경우는 인스턴스 메소드
//	public void tpc() {
	public static void tpc() {
		System.out.println("private 실습");
	}
	
	// static이 붙으면 클래스 메서드
	public static void java() {
		System.out.println("static 실습");
	}
}
