package kr.poly;

public class TV implements RemoCon {
	int currCH = 70;
	
	@Override
	public void chUp() {
		if(currCH < RemoCon.MAXCH) {
			System.out.println("TV의 채널이 올라간다. : " + currCH);
			currCH++;
		} else {
			currCH = 1;
		}
	}

	@Override
	public void chDown() {
		if(currCH > RemoCon.MINCH) {
			System.out.println("TV의 채널이 내려간다. : " + currCH);
			currCH--;
		} else {
			currCH = 100;
			System.out.println("TV의 채널이 내려간다. : " + currCH);
		}
	}

	@Override
	public void internet() {
		System.out.println("이너넷이 된다.");
	}

	// 추가적인 기능을 구현
}
