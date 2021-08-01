import java.util.ArrayList;

import kr.tpc.A;
import kr.tpc.B;

public class TPC37 {
	public static void main(String[] args) {
		
//			ObjectArray arr = new ObjectArray(5);
//			ObjectArray<A> arr = new ObjectArray<A>(5); 나중에는 이렇게 Generic을 활용해서 특정 타입만 관리할 수있는 기법도 있음
			ArrayList arr = new ArrayList(5); // 자바에서 만들어준 ArrayList를 사용하면 장점이 처음 생성한 개수를 넘어서도 알아서 길이만큼 새로 만들어 추가해줌
			// 즉 배열의 길이에 제약이 없음
			arr.add(new A());
			arr.add(new B());
			arr.add(new A());
			arr.add(new A());
			arr.add(new B());
			arr.add(new B());
			arr.add(new B());
			arr.add(new B());
			arr.add(new B());
			
			for(int i = 0; i < arr.size(); i++) {
				Object o = arr.get(i); // Object가 o에 담기는데 현재는 A객체인지 B객체인지 모름 if 문 사용해서 확인
				if( o instanceof A ) {
					((A)o).go();
				} else {
					((B)o).go();
				}
			}
			
			
	}
}
