import kr.inflearn.MyClass;

public class TPC33 {
	public static void main(String[] args) {
		// 다른 패키지에 있는 MyClass 접근하기
//		kr.inflearn.MyClass my = new kr.inflearn.MyClass(); // 이런 방식도 가능하고 import 방식도 가능
		MyClass my = new MyClass();
		int v = my.sum(10, 100);
		System.out.println(v);
	}
}
