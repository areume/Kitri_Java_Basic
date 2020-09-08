package ch06.inheritance;

public class CTV {
	protected boolean power;
	protected int channel;
	
	public static int su;	// 부모 클래스와 자식 클래스에서 동시에 사용 가능하다.
	
	public void setPower(boolean power)	{
		this.power=power;
	}
	
	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
}
