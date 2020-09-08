package ch07.etc;

/**
 * @author : 김아름
 * @date   : 2020. 5. 11.
 * @description : 
 */

class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
	
	public void lineSub() { 
		System.out.println("Line의 메소드");
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

public class Exam39 {
	public static void main(String[] args) {
		Shape shape=new Shape();
		Line line=new Line();
		Rect rect=new Rect();
		Circle circle=new Circle();

		print(shape);
		print(line);
		print(rect);
		print(circle);
	}
	
	// main이 static 함수이므로 static으로 선언한다.
	public static void print(Shape shape) {
		shape.draw();
		// 오버라이딩 되지않은 자식 고유의 메소드는 호출할 수 없다.
		// 업캐스팅한 것을 다시 다운 캐스팅하면 가능하다.
		// Line의 lineSub 메소드 호출하기.
		if (shape instanceof Line) { // instanceof 클래스 : 해당 클래스의 객체인지를 확인한다.
			Line line=(Line)shape;
			line.lineSub();
		}
	}

}
