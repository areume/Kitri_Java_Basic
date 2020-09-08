package ch00.quizInheritance;

class LCD {
	protected int size;
	
	public LCD() { }
	
	public LCD(int size) {
		this.size=size;
	}
}

class ColorLCD extends LCD {
	int colorSize;
	
	public ColorLCD() { }
	
	public ColorLCD(int colorSize, int size) {
		super.size=size;
		this.colorSize=colorSize;
	}
}

public class Quiz11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
