package ch06.inheritance;

public class FAccumulation {
	private int  initValue;
	
	public static int totValue;
	
	protected FAccumulation() {
	}
	
	protected FAccumulation(int initValue) {
		this.initValue=initValue;
		//totValue+=initValue;
	}
	
	protected void setAccumulation(int money) {
		if(money<0) return;
		
		initValue+=money;
		//totValue+=money;
	}
	
	protected int getInitAccumulation() {
		return initValue;
	}
	
	protected int getTotal() {	// 가급적 static 함수가 좋지만, initValue를 static으로 선언할 수 없으므로 일반 메소드로 선언.
		totValue+=initValue;
		return totValue;
	}
}
