package api09.Map;

/**
 * @author : 김아름
 * @date   : 2020. 5. 15.
 * @description : Properties : new file 선택해서 확장자을 properties로 작성.
 *				               = 기호를 중심으로 키=값 을 의미한다.
 */

import java.util.Properties;
import java.util.Iterator;

import java.io.FileReader;

public class PropertiesEx {

	public static void main(String[] args) throws Exception {
		
		// .class 파일이 위치한 곳에서 가져와라. (bin 디렉터리)
		String path=PropertiesEx.class.getResource("data.properties").getPath();
		System.out.println(path);
		
		Properties pro=new Properties();
		pro.load(new FileReader(path));
		
		Iterator<Object> iter=pro.keySet().iterator();
		
		while(iter.hasNext()) {
			String key=(String)iter.next();
			System.out.println(key+"\t"+pro.get(key));
		}
	}

}
