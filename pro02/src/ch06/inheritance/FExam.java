package ch06.inheritance;

public class FExam {

	public static void main(String[] args) {
		FSavingAccount hong=new FSavingAccount(1000);
		hong.saveMoney(2000);
		hong.saveMoney(3000);
		hong.showMoney();
		System.out.println(hong.getTotal());
		
		FSavingAccount kim=new FSavingAccount(5000);
		kim.saveMoney(5000);
		kim.saveMoney(5000);
		kim.saveMoney(7000);
		kim.showMoney();
		System.out.println(kim.getTotal());
	}

}
