package kr.tpc;

// 책(Object) -> 제목, 가격, 출판사, 페이지수
public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;
	
	// 디폴트 생성자 메서드(생략)
	public BookVO() {// 이런 방식은 생성과 동시에 초기화가 이루어져 모든 객체가 동일한 값을 가지게 되므로 안좋은 방법
		// 초기화 작업
		this.title = "자바"; // 정확한 표현으로는 this를 앞에다가 넣어주어야함 하지만 여기서는 매개변수가 없어서 위에서 참조하기 떄문에 괜찮음
		this.price = 14000;
		company = "이지스";
		page = 780;
	} // 다만 기본 생성자는 만들어두는 것이 좋음
	
	// 생성자 메서드의 중복정의(overloading)
	public BookVO(String title, int price, String company, int page) {
		this.title = title; // this를 안넣어주면 멤버변수가 아닌 위의 매개변수로 값이 들어가게됨.
		this.price = price;
		this.company = company;
		this.page = page;
	}
}
