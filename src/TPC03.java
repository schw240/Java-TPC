import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {

	public static void main(String[] args) {
		// 관계를 이해하기. PDT vs UDDT
		// 정수 1개를 저장하기 위한 변수를 선언하시오.
		
		// 책 1권을 저장하기 위한 변수 선언.
		Book b; // b는 객체 변수
		b = new Book(); // 책을 생성해서 담음
		b.title = "자바";
		b.price = 15000;
		b.company = "한빛미디어";
		b.page = 700;
		
        System.out.print(b.title+"\t"); 
        System.out.print(b.price+"\t");
        System.out.print(b.company+"\t"); 
        System.out.println(b.page);
		
        PersonVO p;
        p = new PersonVO();
        p.name = "김한주";
        p.age = 28;
        p.weight = 83.2f;
        p.height = 180.2f;
        
        
        System.out.print(p.name+"\t"); 
        System.out.print(p.age+"\t");
        System.out.print(p.weight+"\t"); 
        System.out.println(p.height+"\t");
	}

}
