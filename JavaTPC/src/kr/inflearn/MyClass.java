package kr.inflearn;

public class MyClass { // 만약 패키지가 있는 상태에서 public을 지우면 기본적으로 default 접근제한자가 적용됨 (같은 패키지는 public, 다른 패키지는 private)
	public int sum(int a, int b) {
		int hap = 0;
		for(int i = a; i <= b; i++) {
			hap += i;
		}
		
		return hap;
	}
	
}
