import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC27 {
	public static void main(String[] args) {
		// RemoCon���� TVŬ������ �����Ͻÿ�.
		
		RemoCon r = new TV();
		for(int i = 0; i < 40; i++) {
			r.chUp();
		}
		for(int i = 0; i < 40; i++) {
			r.chDown();
		}
		r.internet();
		
		
	}
}
