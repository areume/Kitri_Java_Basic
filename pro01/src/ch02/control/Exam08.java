package ch02.control;

/**
 * @author : 김아름
 * @date   : 2020. 4. 28.
 * @description : 반복문 (while, do~while)
 */

public class Exam08 {

	public static void main(String[] args) {
		
		// while : 조건 검사를 앞에서. 조건을 만족해야 블록 안으로 들어간다.
		// 반복문은 초기, 증감, 조건값이 필요하다.
		int i=1;		// 초기값
		while(i<=10) {	// 조건식
			System.out.println("["+i+"] "+"HAHAHA");
			i++;		// 증감식
		}
		
		// 1~10까지 합 출력.
		i=1;
		int hap=0;
		while(i<=10) {
			hap+=i++;	// 덧셈 대입을 실행한 후 i값이 증가한다.
		}
		System.out.println(hap);
	
	
		// do~while : 최소 한 번은 실행된다. 조건 검사를 뒤로.
		int j=1;
		do {
			System.out.println("["+j+"] "+"HIHIHI");
			j++;
		}while(j<=10);
			
		// 1~10까지 합 출력.
		j=1;
		hap=0;
		do {
			hap+=j++;
		}while(j<=10);
		System.out.println(hap);
	
	}

}
