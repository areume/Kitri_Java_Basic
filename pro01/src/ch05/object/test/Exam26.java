package ch05.object.test;

/**
 * @author : 김아름
 * @date   : 2020. 5. 6.
 * @description : 함수 중복 - 오버로딩
 * 
 * 함수명은 같지만 파라미터 타입이나 개수가 달라야 한다.
 */

class FF {
	public void disp(int x) {
		System.out.println(x);
	}
	
	public void disp(int x, float y) {
		System.out.println(x+"\t"+y);
	}
	
	public void disp(String str) {
		System.out.println(str);
	}
	
	public int hap(int x, int y) {
		return x+y;
	}
	
	public float hap(float x, float y) {
		return x+y;
	}
	
}

public class Exam26 {

	public static void main(String[] args) {
		
		FF f=new FF();
		
		f.disp(10);
		f.disp(77, 88.8f);
		f.disp("apple");
		
		System.out.println(f.hap(5, 6));
		System.out.println(f.hap(66.7f, 99.8f));
		

	}

}
