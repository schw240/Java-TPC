import kr.tpc.BookDTO; // import 로 포함을 시켜줘야 참조가능

public class TPC10 {
	public static void main(String[] args) {
		// int float, char, boolean -> PDT 기본자료형
		int a;
		a = 10;
		
		// 책(BookDTO)이라는 자료형을 만들어야함 --> class
//		BookDTO b; // b는 BookDTO라는 자료형의 주소를 가지고 있는 변수 BookDTO가 객체, 객체를 생성
//		b = new BookDTO(); // 힙 영역에 생성, 객체를 생성하는 함수 -> 클래스에 작성한 생성자 코드 호출(public BookDTO) 호출 후 객체 생성 + this라는 자신을 참조하는 객체 생성
		
		// 객체 생성
		BookDTO b = new BookDTO();
		b.title = "자바";
		b.price = 17000;
		b.company = "영진";
		b.page = 670;
		
		System.out.print(b.title + "\t");
		System.out.print(b.price + "\t");
		System.out.print(b.company + "\t");
		System.out.print(b.page + "\t");
		
	}
}
