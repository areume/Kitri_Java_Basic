package ch06.phoneInterface;

public class SPhone implements Phone {

	@Override
	public void callSend() {
		System.out.println("가능합니다.");
	}

	@Override
	public void canData() {
		System.out.println("LTE 입니다.");
	}

	@Override
	public void tvRemote() {
		System.out.println("리모컨 탑재 되었습니다.");
	}
}
