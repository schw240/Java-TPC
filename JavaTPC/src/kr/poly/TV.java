package kr.poly;

public class TV implements RemoCon {
	int currCH = 70;
	
	@Override
	public void chUp() {
		if(currCH < RemoCon.MAXCH) {
			System.out.println("TV�� ä���� �ö󰣴�. : " + currCH);
			currCH++;
		} else {
			currCH = 1;
		}
	}

	@Override
	public void chDown() {
		if(currCH > RemoCon.MINCH) {
			System.out.println("TV�� ä���� ��������. : " + currCH);
			currCH--;
		} else {
			currCH = 100;
			System.out.println("TV�� ä���� ��������. : " + currCH);
		}
	}

	@Override
	public void internet() {
		System.out.println("�̳ʳ��� �ȴ�.");
	}

	// �߰����� ����� ����
}
