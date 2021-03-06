package ch06.robotAbstract;

public abstract class Robot {
	protected String kind;
		
	protected void shape() {
		System.out.println(kind+"는 팔, 다리, 몸통, 머리가 있습니다.");
	}
	
	protected void actionWalk() {
		System.out.println("걸을 수 있습니다.");
	}
	
	protected void actionRun() {
		System.out.println("달릴 수 있습니다.");
	}
	
	protected abstract void actionFly();
	protected abstract void actionMissile();
	protected abstract void actionKnife();
}
