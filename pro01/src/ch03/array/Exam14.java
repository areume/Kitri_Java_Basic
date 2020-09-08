package ch03.array;

/**
 * @author : 김아름
 * @date   : 2020. 4. 28.
 * @description : 배열
 */

public class Exam14 {

	public static void main(String[] args) {
		
		int x=10;
		int y=x;
		int z=y;
		System.out.println(x+"\t"+y+"\t"+z);
		
		int[] array=new int[] {1,2,3,4,5};
		int a=array[2];
		System.out.println(a);
		
		System.out.println();
		System.out.println();
		
		int[] b=array; 	// 배열이름은 배열이 위치한 주소값을 가지고 있다. 즉, b에 주소값을 복사시켜 대입한 것이다.
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+"\t");
		}
		System.out.println();
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+"\t");
		}
		System.out.println();
		
		// 주소값을 전달한 것이므로 같은 주소값을 가진다.
		System.out.println(array);
		System.out.println(b);
		
		array=null;					// 가비지 컬렉터에 의해 메모리에서 사라진다. C, C++ 에서는 delete로 명시해줘야한다.
		System.out.println(b[2]); 	// b는 사용가능하다

	}

}
