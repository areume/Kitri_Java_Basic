package api08.List;

/**
 * @author : 김아름
 * @date   : 2020. 5. 14.
 * @description : 컬렉션은 자료구조를 바탕으로 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록 java.util 패키지에 관련된 인터페이스와 클래스를 포함시켜 놓은 것이다.
 * 				    이를 총칭해서 컬렉션 프레임워크라고 부른다.
 * 
 * 				  (1) List : ArrayList, Vector, LinkedList, Stack, Queue 등
 * 				  (2) Set : HashSet, TreeSet 등
 * 				  (3) Map : HashMap, HashTable, TreeMap, Properties 등
 */

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
		// List : 순서를 가지고 있다. (예즉가능)
		// 상속 : AbstractCollection - Abstract - ArrayLisg
		
		String a="apple";
		String b="banana";
		
		ArrayList<String> list=new ArrayList<String>();
		list.add(a);
		list.add(b);
		list.add("JSP");
		list.add("Oracle");
		
		System.out.println("저장 개수 : "+list.size());
		System.out.println("2번지 객체 얻기 : "+list.get(2));
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"\t");
		}
		System.out.println("\n=============================");
		
		// 추가
		list.add("tomato");			// 맨 뒤에 삽입
		list.add(1,"pineapple");	// 1번지에 삽입 (뒤의 자료가 하나씩 밀린다.)
		
		System.out.println("저장 개수 : "+list.size());
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"\t");
		}
		System.out.println("\n=============================");
		
		// 교체
		list.set(3,"안녕하세요");
		System.out.println(list);
		System.out.println("=============================");
		
		//삭제
		list.remove(0);
		System.out.println(list);
		System.out.println("=============================");
		
		list.remove(b);
		System.out.println(list);
		System.out.println("=============================");
		
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		arr.add(10);		// 오토 박싱. Integer a=new Integer(10);
		arr.add(20);
		System.out.println(arr);
		
		ArrayList<Object> brr=new ArrayList<Object>();	// 여러 클래스의 객체를 처리하기 위해 상위 클래스나 인터페이스가 자주 사용된다.
		brr.add(22.2);
		brr.add(10);
		brr.add("apple");
		brr.add('A');
		
		System.out.println(brr);
		
	}

}
