package kr.tpc;

public class BookDTO {
	// class 설계도
	public String title;
	public int price;
	public String company;
	public int page;
	
	// 디폴트 생성자 메서드는 생략되어있다.
	public BookDTO() { // 객체 생성 -> this라는 자기 자신을 참조하는 객체가 만들어짐
		// 아무것도 안하는거 같지만 객체를 생성하는 작업을 함(기계어 코드)
		// 위의 설계도 대로 객체를 기억공간에 만드는 작업
	}
}
