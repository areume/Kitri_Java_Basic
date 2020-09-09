package api09.Map;

/**
 * @author : 김아름
 * @date   : 2020. 5. 15.
 * @description : 자신이 생성한 클래스 객체를 HashMap에 저장.
 */

import api08.List.Data;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx03 {

	public static void main(String[] args) {
		
		Data a=new Data(1,2);
		Data b=new Data(3,4);
		Data c=new Data(5,6);
		
		HashMap<String,Data> map=new HashMap<String,Data>();
		map.put("one",a);
		map.put("two",b);
		map.put("three",c);
		
		Iterator<String> iter=map.keySet().iterator();
		while(iter.hasNext()) {
			Data data=map.get(iter.next());
			data.yonsan();
			data.disp();
		}
		System.out.println("================================");
		map.put("four",new Data(77,88));
		map.replace("two",new Data(100,200));
		map.remove("one");
		
		iter=map.keySet().iterator();
		while(iter.hasNext()) {
			Data data=map.get(iter.next());
			data.yonsan();
			data.disp();
		}
		
	}

}
