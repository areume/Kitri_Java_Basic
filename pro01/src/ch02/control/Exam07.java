package ch02.control;

/**
 * @author : 김아름
 * @date   : 2020. 4. 28.
 * @description : 반복문 (for, 다중 for)
 */

public class Exam07 {

	public static void main(String[] args) {
	
		// for 문은 수치반복에서 많이 사용한다.
		for(int i=1;i<=10;i++) { // (초기값; 조건식; 증감식) {,,,}
			System.out.println("["+i+"]"+"How are you?");
		}
		
		// 1~10 출력.
		for(int i=1;i<=10;i++) {
			System.out.print(i+"\t");
		}
		
		// 1~10 역순으로 출력.
		System.out.println();
		for(int i=10;i>=1;i--) {
			System.out.print(i+"\t");
		}
		
		// 30부터 3씩 줄어들며 출력.
		System.out.println();
		for(int i=30;i>=1;i-=3) {
			System.out.print(i+"\t");
		}
		
		// 1~50까지 2의 배수 출력.
		System.out.println();
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
				System.out.print(i+"\t");
			}
		}
		
		// 1~10까지의 합 출력.
		System.out.println();
		int hap=0;		
		for(int i=1;i<=10;i++) {
			hap+=i;
		}
		System.out.println(hap);
		
		// 다중 for 문
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i+" "+j+"\t");
			}
			System.out.println();
		}
		
		// 배열은 추가, 삭제가 용이하지 않다. 배열은 수치탐색에 for문과 함께 이용된다.
		// array list는 추가, 삭제가 가능하다.
		// 객체지향에서는 데이터를 레코드 단위로 받는다. 따라서 배열, for 문 잘 사용하지 않는다.
		
	}
	
}
