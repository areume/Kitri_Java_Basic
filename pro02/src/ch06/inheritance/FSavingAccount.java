package ch06.inheritance;

public class FSavingAccount extends FAccumulation {
	
	public FSavingAccount() {
	}
	
	public FSavingAccount(int initValue) {
		super(initValue);
	}
	
	public void saveMoney(int money) {
		setAccumulation(money);
	}
	
	public void showMoney() {
		System.out.println("개인별 누적금액 : "+getInitAccumulation());
	}
}
