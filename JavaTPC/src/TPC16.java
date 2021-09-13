import kr.tpc.OverLoad;

public class TPC16 {
	public static void main(String[] args) {
		// 1 + 1 = ? 23.4 + 56 =? 56.7 + 78.9 =?
		OverLoad ov = new OverLoad();
		
		ov.hap(20, 50); // ov.hap_int_int(20, 50) 우리가 지정한 이름은 ov.hap이지만 내부적으로는 이렇게 작성됨.
		ov.hap(23.4f, 56); // ov.hap_float_int(23.4, 56)
		ov.hap(56.7f, 78.9f);
	}
}
