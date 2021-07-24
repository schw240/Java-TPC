import kr.tpc.BookVO;

public class TPC12 {

	public static void main(String[] args) {
		// 생성자 -> 생성 + 초기화 -> 메서드 중복정의(오버로딩)
		BookVO b1 = new BookVO(); // 현재 상태에서 값을 넘겨주지는 않았지만 생성과 동시에 초기화
		
		System.out.print(b1.title + "\t");
		System.out.print(b1.price + "\t");
		System.out.print(b1.company + "\t");
		System.out.println(b1.page + "\t");
		
		BookVO b2 = new BookVO();
		System.out.print(b2.title + "\t");
		System.out.print(b2.price + "\t");
		System.out.print(b2.company + "\t");
		System.out.println(b2.page + "\t");
		
		// 오버로딩 된 생성자 메소드 사용, 디폴트 생성자와 동시 사용 가능
		BookVO b3 = new BookVO("Python", 18000, "대림출판사", 500);
		System.out.print(b3.title + "\t");
		System.out.print(b3.price + "\t");
		System.out.print(b3.company + "\t");
		System.out.println(b3.page + "\t");
		
	}
}
