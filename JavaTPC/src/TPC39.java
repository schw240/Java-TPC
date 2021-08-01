
public class TPC39 {
	public static void main(String[] args) {
		
		// wrapper클래스 활용
		
		int a = 1;
		// 버전이 바뀌었기에 줄이 처짐 에러는 아님
//		Integer b = new Integer(1);
		Integer b = 1; // 컴파일러가 자동적으로 Boxing 기법을 해줌. 위랑 똑같은 결과
		System.out.println(b.intValue()); // int 1
		System.out.println(b.toString()); // string "1" 
	
		Object[] obj = new Object[3];
		// 1, 2, 3
//		obj[0] = new Integer(1); // obj는 부모 Integer는 자식
//		obj[1] = new Integer(2);
//		obj[2] = new Integer(3);
			
		obj[0] = 1; //boxing 기법
		obj[1] = 2;
		obj[2] = 3;
		
//		System.out.println(obj[0].toString()); // 다형성으로 인해 Integer의 숫자가 나옴
//		System.out.println(obj[1].toString());
//		System.out.println(obj[2].toString());
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		System.out.println(obj[2]);
		
		System.out.println();
		
		// "100" + "100" = 200
		String x = "100";
		String y = "100";
		
		System.out.println(x + y); //"100100"
		
		int v1 = Integer.parseInt(x);
		int v2 = Integer.parseInt(y); // int형
		System.out.println(v1 + v2); //int형 나옴
		
		// 100 + 100 = "100100"
		String s1 = String.valueOf(v1);
		String s2 = String.valueOf(v2);
		System.out.println(s1 + s2);
	}
}
