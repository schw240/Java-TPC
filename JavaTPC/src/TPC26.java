import kr.poly.Radio;
import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC26 {
	public static void main(String[] args) {
//		RemoCon r = new RemoCon(); // �߻�Ŭ������ �������̽��� ���� ��ü ���� �Ұ���
		
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