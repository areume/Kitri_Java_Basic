package api08.List;

/**
 * @author : 김아름
 * @date   : 2020. 5. 14.
 * @description : 
 */

public class Data {
	private int x;
	private int y;
	private int z;
	
	public Data() { }

	public Data(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void yonsan() {
		z=x+y;
	}
	
	public void disp() {
		System.out.println(x+" + "+y+" = "+z);
	}
	
	@Override
	public String toString() {
		return "["+x+"\t"+y+"\t"+z+"]";
	}
	
}
