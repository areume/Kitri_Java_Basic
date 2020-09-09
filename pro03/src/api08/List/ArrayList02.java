package api08.List;

/**
 * @author : 김아름
 * @date   : 2020. 5. 14.
 * @description : 
 */

import java.util.ArrayList;

public class ArrayList02 {

	public static void main(String[] args) {
		
		Data a=new Data(10,20);
		Data b=new Data(30,40);
		Data c=new Data(50,60);
		
		ArrayList<Data> list=new ArrayList<Data>();
		
		list.add(a);
		list.add(b);
		list.add(c);
		
		for(int i=0;i<list.size();i++) {
			Data d=list.get(i);
			d.yonsan();
			d.disp();
		}
		
		System.out.println("\n\n");
		
		System.out.println(list.toString());
		
		list.add(new Data(1,2));
		System.out.println(list.toString());
		
		list.set(0, new Data(100,200));
		System.out.println(list.toString());
		
		Data dd=new Data(3,4);
		dd.yonsan();
		list.add(dd);
		System.out.println(list.toString());
		
		list.remove(1);
		System.out.println(list.toString());
		
		for(Data data : list) {
			data.disp();
		}
	}

}
