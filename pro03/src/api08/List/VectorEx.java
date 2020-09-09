package api08.List;

/**
 * @author : 김아름
 * @date   : 2020. 5. 14.
 * @description : ArrayList와 Vector의 차이점은 ArrayList가 속도가 조금 더 빠르다. Vector는 스레드 동기화 처리에 적당했지만,
 * 				  ArrayList Collections.synchronizedList()로 사용가능하다.
 */

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<Integer>();
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		
		System.out.println(vector.get(2));
		System.out.println(vector.toString());

		vector.add(50);
		vector.add(2,35);
		vector.set(1,15);
		vector.remove(0);
		System.out.println(vector);
		
		for(int i=0;i<vector.size();i++) {
			int value=vector.get(i);
			System.out.println(value);
		}
		
		for(Integer v : vector) {
			System.out.println(v);
		}
	}

}
