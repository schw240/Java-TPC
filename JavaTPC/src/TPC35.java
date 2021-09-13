
public class TPC35 {
	public static void main(String[] args) {
		
		String str1 = new String("APPLE");
		String str2 = new String("APPLE");
		
		
		
		// String 객체로 생성하는 문자열은 힙 영역에 새로운 객체가 생성되기 때문에 서로 다름
		if(str1 == str2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		// String클래스의 .equals() 메서드는 문자열 객체 안에 들어있는 값을 비교하는 메서드로 둘의값이 같으므로 YES 출력
		if(str1.equals(str2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		
		String str3 = "APPLE";
		String str4 = "APPLE";
		
		// 그냥 문자열로 만들면 literal pool에 만들어지게 됨. 따라서 같은 값을 사용하게 되면 같은 주소를 가르키므로 서로 같다고 YES로 나옴
		if(str3 == str4) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		// 값도 같음
		if(str3.equals(str4)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		
	}
}
