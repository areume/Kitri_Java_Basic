package test;


public class Exam {

	public static void main(String[] args) {
	  
		int[] array=new int[] {1,2,3,4,5};
		int[] copy=array; // [1]
			
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+"\t");
		}
		System.out.println();
			
		for(int i=0;i<copy.length;i++) {
			System.out.print(copy[i]+"\t");
		}
		System.out.println();
			
		// 주소값을 전달한 것이므로 같은 주소값을 가진다.
		System.out.println(array); // [2]
		System.out.println(copy);
	}
}
