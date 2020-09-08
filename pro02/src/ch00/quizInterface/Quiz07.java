package ch00.quizInterface;

interface AdderInterface {
	public int add(int x, int y);	// x, y의 합
	public int add(int x);			// 1~x까지의 정수 합 리턴.
}

class MyAdder implements AdderInterface {
	
	public int add(int x, int y) {
		return x+y;
	}
	
	public int add(int x) {
		int sum=0;
		while(x>=1) {
			sum+=x--;
		}
		return sum;
	}
}

public class Quiz07 {
	public static void main(String[] args) {
		MyAdder my=new MyAdder();
		System.out.println(my.add(5,10));
		System.out.println(my.add(10));
	}
}
