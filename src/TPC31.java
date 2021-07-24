import kr.tpc.Inflearn;

public class TPC31 {

	public static void main(String[] args) {
//		Inflearn inf = new Inflearn(); // 아래처럼 바꾸면 객체 생성 필요 X
		
//		inf.tpc();
		Inflearn.tpc();
		// static 메서드는 아래처럼 접근 X
//		inf.java();
		Inflearn.java(); // new를 사용하지 않고도 바로 클래스이름.클래스 메서드로 접근 가능
		
		// Java API 생성자 private
//		System sys = new System(); // 생성 불가능
		System.out.println("출력");
//		Math m = new Math(); // 생성 불가능
		Math.abs(0); 
//		위 처럼 자주 사용하는 경우 생성자를 private로 설정해두고 객체 생성을 막은 다음 클래스 이름으로 접근하여 클래스 메서드 사용
	}
}
