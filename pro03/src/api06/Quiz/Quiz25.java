package api06.Quiz;

class Point {
	private int x;
	private int y;
	private int z;
	
	public Point() { }
	
	public Point(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point temp=(Point)obj;
			
			if(this.x==temp.x && this.y==temp.y && this.z==temp.z) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "["+x+"\t"+y+"\t"+z+"]";
	}
	
	
}

public class Quiz25 {

	public static void main(String[] args) {
		Point p=new Point(1,2,3);
		Point o=new Point(1,2,3);
		
		System.out.println(p);
		System.out.println(o);
		System.out.println("결과 : "+p.equals(o));

	}

}
