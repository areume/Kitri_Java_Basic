package ch03.array;

/**
 * @author : 김아름
 * @date   : 2020. 4. 28.
 * @description : 배열
 * 				   변수는 한 개의 데이터만 저장하지만, 배열은 같은 타입의 데이터를 연속된 공간에 저장하므로 속도면에서 좋다.
 * 				   각 데이터는 인덱스를 부여한다.
 */

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {

		char[] ch=new char[] {'A','B','C'};
		
		for(int i=0;i<3;i++) {
			System.out.print(ch[i]+"\t");
		}
		System.out.println(ch.length);
		System.out.println();
		
		int[] array=new int[] {1,2,3,4,5};
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+"\t");
		}
		System.out.println();
	
		
		System.out.println("키보드 입력");
		
		//int su; // 초기화되지 않은 상태로 출력하면 Error!
		int[] b=new int[5]; // 4 byte * 5 = 20 byte. 배열은 자동으로 모든 공간이 0으로 초기화된다.
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]+"\t");
		}
		
		sc.close();
		
	}

}
