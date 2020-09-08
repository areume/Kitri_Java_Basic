package ch00.quiz.ex0506_02;

import java.util.Scanner;

/**
 * @author : 김아름
 * @date   : 2020. 5. 7.
 * @description : 
 */

class Rect {
	private int width;
	private int height;
	
	public Rect(int width, int height) {
		this.width=width;
		this.height=height;
	}
	
	public int getArea() {
		return width*height;
	}
}

public class Quiz27 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int[][] array=new int[4][2];
		Rect[] rect=new Rect[4];
		
		for(int i=0;i<array.length;i++) {
			System.out.print("너비와 높이 >> ");
			array[i][0]=sc.nextInt();
			array[i][1]=sc.nextInt();
			rect[i]=new Rect(array[i][0],array[i][1]);
		}
		
		for(int i=0;i<rect.length;i++) {
			System.out.println(i+"번째 사각형의 넓이는 "+rect[i].getArea()+" 입니다.");
		}
		
		sc.close();
	}

}
