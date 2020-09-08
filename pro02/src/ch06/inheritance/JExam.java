package ch06.inheritance;

class Shape {
	
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}

public class JExam {

	public static void main(String[] args) {
		
		Shape[] array=new Shape[4];
		
		array[0]=new Shape();
		array[1]=new Line();
		array[2]=new Rect();
		array[3]=new Circle();
		
		for(int i=0;i<array.length;i++) {
			array[i].draw();
		}

	}

}
