package ch02.control;

/**
 * @author : 김아름
 * @date   : 2020. 4. 28.
 * @description : for문에 사용된 continue, break
 */

public class Exam09 {

	public static void main(String[] args) {

		// 1~10 까지 반복
		for(int i=1;i<=10;i++) {
			if(i==5) {
				break; // if문을 제외한 가장 가까운 블럭 밖으로 빠진다. for 문 탈출. 1~4만 출력된다.
			}
			System.out.print(i+"\t");
		}
		System.out.println();

		int su=5;
		
		if(su==5) {
			//break; // Error! if 문 단독으로 break 사용할 수 없다.
		}
		
		// 1~10 까지 반복
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue; // 아래 출력문을 실행하지 않고 다시 위로 올라간다. 즉, 5 가 출력되지 않는다.
			}
			System.out.print(i+"\t");
		}
		
	}

}
