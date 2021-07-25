package kr.tpc;

public class Dog extends Animal { // eat() { ? }

	// 이름, 나이, 종: 상태정보
	// 재정의 override 재정의를 통해 부모 클래스에서 만들어진 기능을 컴파일 할떄 동적 바인딩
	@Override
	public void eat() { // 행위 정보 
		// 재정의가 되어있기때문에 부모객체에 자식 클래스를 할당해도
		// 동적 바인딩이 되어 자식에 재정의된 기능 사용
		System.out.println("개");
	}
	
	public Dog() {
		super();  // 디폴트 생성자에서 이게 생력되어있음
		// super을 통해 부모에 접근
	}
}
