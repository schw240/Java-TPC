import java.util.ArrayList;

import kr.tpc.A;
import kr.tpc.B;

public class TPC37 {
	public static void main(String[] args) {
		
//			ObjectArray arr = new ObjectArray(5);
//			ObjectArray<A> arr = new ObjectArray<A>(5); ���߿��� �̷��� Generic�� Ȱ���ؼ� Ư�� Ÿ�Ը� ������ ���ִ� ����� ����
			ArrayList arr = new ArrayList(5); // �ڹٿ��� ������� ArrayList�� ����ϸ� ������ ó�� ������ ������ �Ѿ�� �˾Ƽ� ���̸�ŭ ���� ����� �߰�����
			// �� �迭�� ���̿� ������ ����
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
				Object o = arr.get(i); // Object�� o�� ���µ� ����� A��ü���� B��ü���� �� if �� ����ؼ� Ȯ��
				if( o instanceof A ) {
					((A)o).go();
				} else {
					((B)o).go();
				}
			}
			
			
	}
}
