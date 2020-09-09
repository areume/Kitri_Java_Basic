package api09.Map;

/**
 * @author : 김아름
 * @date   : 2020. 5. 14.
 * @description : HashMap : 키와 값의 쌍으로 이루어져 있다. 인덱스 값 없다. 비어있는지 확인할 수 있는 메소드 없다. > iterator 사용
 * 							AbstractMap - HashMap
 */

import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx01 {

	public static void main(String[] args) {
		
		Map<String,String> map=new HashMap<String,String>();
		map.put("spring","봄");
		map.put("summer","여름");
		map.put("fall","가을");
		map.put("winter","겨울");
		System.out.println(map.get("winter"));
		
		// key 값을 추출해서 Set에 저장.
		Set<String> set=map.keySet();
		System.out.println(set);
		
		// Map은 인덱스 값을 가지고 있지 않기 때문에 iterator를 사용하여 map을 탐색한다.
		Iterator<String> iter=set.iterator();
		while(iter.hasNext()) {
			//System.out.print("키 : "+iter.next());
			System.out.println("값 : "+map.get(iter.next()));
		}
		System.out.println("============================================");
		
		HashMap<Integer,Double> hashMap=new HashMap<Integer,Double>();
		hashMap.put(10,55.5);
		hashMap.put(20,66.6);
		hashMap.put(30,77.7);
		System.out.println(hashMap);
		
		Set<Integer> key=hashMap.keySet();		// Iterator<Integer> it=hashMap.keySet().iterator(); 처럼 합쳐서 선언가능.
		Iterator<Integer> iterator=key.iterator();
		while(iterator.hasNext()) {
			double value=hashMap.get(iterator.next());
			System.out.println("값 : "+value);
		}
		System.out.println("============================================");
		
		// 추가
		hashMap.put(40,88.8);	
		System.out.println(hashMap);
		
		// 교체
		hashMap.replace(10,100.0);
		System.out.println(hashMap);
		
		// 삭제
		hashMap.remove(20);
		System.out.println(hashMap);
	}

}
