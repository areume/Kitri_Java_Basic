package thread07.Synchronized;

/**
 * @author : 김아름
 * @date   : 2020. 5. 21.
 * @description : 
 */

public class Cho extends Thread {
	
	private Calculator calculator; // 단방향 연관관계

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		
		setName("Cho");
	}
	
	@Override
	public void run() {
		calculator.setMoney(100);
	}
}
