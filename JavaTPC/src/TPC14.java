import kr.tpc.MemberVO;

public class TPC14 {
	public static void main(String[] args) {
		
//		MemberVO m = new MemberVO();
//		m.name = "홍길동";
//		m.age = 50;
//		m.tel = "010-0000-0000";
//		m.addr = "서울"; private으로 바꾸면 접근 불가(정보 은닉, 보호)
		

		MemberVO m = new MemberVO(); // 만약 아무런 데이터를 보내지 않는 경우 기본 생성자를 호출하는데 만약 다른 생성자 함수를 만들었다면 기본 생성자를 컴파일러가 만들어 주지 않기에 오류가 남 따라서 디폴트 생성자를 명시적으로 만들어주는 것이 좋음
		// setter 메서드 사용
		m.setName("홍길동");
		m.setAge(50);
		m.setTel("010-0000-0000");
		m.setAddr("서울");
		
		System.out.print(m.getName() + "\t");
		System.out.print(m.getAge() + "\t");
		System.out.print(m.getTel() + "\t");
		System.out.print(m.getAddr() + "\t");
		
		
	}
}
