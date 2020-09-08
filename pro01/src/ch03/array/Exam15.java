package ch03.array;

/**
 * @author : 김아름
 * @date   : 2020. 4. 28.
 * @description : DS에서 heap의 데이터는 stack을 참조하고 있으면 소멸되지 않는다.
 * 				  stack은 블럭단위로 데이터가 생성, 소멸된다.
 */

public class Exam15 {

	public static void main(String[] args) {
		
		int su=10;
		
		{
			int value=20;
			System.out.println(su);		// 블록 밖에서 선언된 변수는 블록 안에서도 사용할 수 있다.
			System.out.println(value);
		}
		
		System.out.println(su);			
		//System.out.println(value);	// 블록 안에서 선언된 변수는 블록을 나오면 메모리에서 삭제된다. 따라서 출력될 수 없다.
		
		int value=30; 	// 블럭 안의 value는 메모리에서 소멸되었으므로 블럭 밖에서 다시 선언하여 사용할 수 있다.
		System.out.println(value);
		
		
		// 배열 선언 방법
		char[] a=new char[] {'A','B','C'};
		char b[]=new char[] {'E','F','G'};
		char[] c= {'H','I','J'};
		
		// char[] d=new char[]; // 불가능. 데이터 크기를 명시해야 한다.
		
		for(int i=0;i<3;i++) {
			System.out.println(a[i]+"\t"+b[i]+"\t"+c[i]);
		}
		
	}

}

// stack 영역은 블록 단위로 등록되고 사라진다.
// heap 영역은 사용 여부에 따라서 등록되고 사라진다.