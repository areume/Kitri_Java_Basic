package api10.Set;

/**
 * @author : 김아름
 * @date   : 2020. 5. 15.
 * @description : Set - 수학에서의 집합 / 중복값 처리 안됨. 저장 순서가 유지되지 않는다.
 * 				  Map - Key, Value / 중복값 처리 됨. 중복 키는 안됨. 저장 순서가 유지되지 않는다.
 * 				  List - Index 값 / 중복값 처리 됨. 인덱스 중복 안됨. 저장 순서가 유지된다.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetEx01 {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("orange");
		set.add("strawberry");
		set.add("apple");	// 중복 값은 처리되지 않는다.
		System.out.println(set);
		
		set.remove("apple");
		System.out.println(set);
		
		set.clear(); // 전체 삭제
		System.out.println(set);
		
		System.out.println("===================================");
		
		HashSet<Object> obj=new HashSet<Object>();
		obj.add(10);
		obj.add(24.5f);
		obj.add("apple");
		
		// Iterator : 자료구조의 데이터에 순차접근해서 객체를 리턴하는 클래스 (반복자)
		Iterator<Object> iterator=obj.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("===================================");
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("banana");
		list.add("melon");
		
		Iterator<String> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+"\t");
		}
		
	}

}
