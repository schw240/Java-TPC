import kr.poly.Radio;
import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC26 {
	public static void main(String[] args) {
//		RemoCon r = new RemoCon(); // 추상클래스와 인터페이스는 본인 객체 생성 불가능
		
		RemoCon r = new TV();
		r.chUp();
		r.chDown();
		r.internet();
		
		r = new Radio();
		r.chUp();
		r.chDown();
		r.internet();
		
	}
}
