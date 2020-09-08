package ch00.quiz.ex0506_01;

class ABS {
	private int value;
	private int abs_value;
	
	public void setValue(int value) {
		this.value=value;
	}
	
	public void resultAbs() {
		abs_value=(value<0)?-value:value;
	}

	public void disp() {
		System.out.println("result : "+abs_value);
	}
}


public class Quiz13 {

	public static void main(String[] args) {
		ABS abs=new ABS();
		abs.setValue(-10);
		abs.resultAbs();
		abs.disp();
	}

}
