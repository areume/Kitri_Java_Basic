package io05.Serializable;

import java.io.Serializable;

/**
 * @author : 김아름
 * @date   : 2020. 5. 19.
 * @description : 
 */

public class Test implements Serializable {
	
	private static final long serialVersionUID = 4579239178371507284L;
	
	private int x;
	private float y;
	private char z;
	
	public Test() { }
	
	public Test(int x, float y, char z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public String toString() {
		return "Test [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
}
