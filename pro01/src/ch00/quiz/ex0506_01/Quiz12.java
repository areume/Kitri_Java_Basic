package ch00.quiz.ex0506_01;

class Circle {
	private final double PI=3.141592;
	private double area;
	private double radius;
	
	
	public void getRadius(double radius) {
		this.radius=radius;
	}
	
	public void findArea() {
		area=PI*radius*radius;
	}
	
	public void disp() {
		System.out.println("원의 면적 : "+area);
	}
}

public class Quiz12 {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.getRadius(4.0);
		c.findArea();
		c.disp();
	}

}
