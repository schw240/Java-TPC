package kr.tpc;

public class MemberVO {
//	public String name; // public 으로 두면 데이터 접그이 아주 쉽기때문에 권장 X
//	public int age;
//	public String tel;
//	public String addr;
	
	private String name; 
	private int age;
	private String tel;
	private String addr;
	
	public MemberVO() {} // 만약 아무런 데이터를 보내지 않는 경우 기본 생성자를 호출하는데 만약 다른 생성자 함수를 만들었다면 기본 생성자를 컴파일러가 만들어 주지 않기에 오류가 남 따라서 디폴트 생성자를 명시적으로 만들어주는 것이 좋

	public MemberVO(String name, int age, String tel, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}

	// private을 사용해 정보 은닉을 사용하면 getter , setter 메소드 사용하기
	public String getName() {
		return name;
	}

	public void setName(String name) { // setter 메소드는 return을 하지 않으므로 void 타입
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
	}
	
	
}
