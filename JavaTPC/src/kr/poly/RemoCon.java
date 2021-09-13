package kr.poly;

public interface RemoCon { // 인터페이스도 객체생성X
	
	// 상수를 사용가능
	public static final int MAXCH = 100; // public static final이 기본적으로 추가되어있고 생략되어있음
	public int MINCH = 1; //RemoCon.MAXCH, RemoCon.MINCH
	
	// 추상메서드
	public void chUp();
	public void chDown();
	public void internet();
}
