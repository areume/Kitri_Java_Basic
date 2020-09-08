package ch06.phoneInterface;

public class IPhone implements Phone {

	@Override
	public void callSend() {
		System.out.println("가능합니다.");
	}

	@Override
	public void canData() {
		System.out.println("5G 입니다.");
	}

	@Override
	public void tvRemote() {
		System.out.println("리모컨 탑재되지 않았습니다.");
	}
}
