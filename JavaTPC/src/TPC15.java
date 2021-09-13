import kr.tpc.MemberVO;

public class TPC15 {
	public static void main(String[] args) {
		
		MemberVO m = new MemberVO("홍길동", 40, "010-0111-1111", "서울");
		// 이 경수 setter 메소드 필요 X
		
		System.out.println(m.toString());
		
		System.out.println(m.getName());
		System.out.println(m.getAge());
		
		MemberVO m1 = new MemberVO(); // setter함수로 값을 저장하고 이경우를 위해 기본 생성자를 명시적으로 생성해둘것
		m1.setName("나길동");
		m1.setAge(34);
		m1.setTel("010-0000-0000");
		m1.setAddr("서울");
		
		System.out.print(m1.getName() + "\t");
		System.out.println(m1.getAddr() + "\t");
		System.out.println(m1.toString());
		System.out.println(m1); // m1을 출력하라고 하면 m1안에는 현재 4개의 데이터가 있는데 어떤 데이터를 출력하라고 하는것인지 알지 못함. 따라서 toString()을 통해 전체 멤버 변수 출력(생략되어있음)
	}
}
