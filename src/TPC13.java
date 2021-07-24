import kr.tpc.BookDTO;

public class TPC13 {
	public static void main(String[] args) {
		// 책 -> class(BookDTO) 설계 -> 객체 -> 인스턴스
		String title = "스프링";
		int price = 25000;
		String company = "제이펍";
		int page = 890;  // 이건 그냥 4개의 변수에 값을 담은 것
		
		BookDTO dto; // dto(Object: 객체) dto는 주소를 담는 변수일뿐 아직 아무것도 안담김
		dto = new BookDTO(title, price, company, page); // dto(Instance: 인스턴스) 위의 변수들을 전달
		
		bookPrint(dto);
	}
	
	public static void bookPrint(BookDTO dto) { // data transfer object DTO
		System.out.print(dto.title + "\t");
		System.out.print(dto.price + "\t");
		System.out.print(dto.company + "\t");
		System.out.println(dto.page + "\t");
		
	}
}
