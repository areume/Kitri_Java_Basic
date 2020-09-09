package api13.Exception;

/**
 * @author : 김아름
 * @date   : 2020. 5. 18.
 * @description : 
 */

public class Ex03 {

	public static void main(String[] args) {	
		
		// 우클릭 > run as > run configuration > argument : main 으로 넘어오는 매개변수 값을 조정할 수 있다.
		for(int i=0;i<args.length;i++) {
			//System.out.println(args[i]);
			
			int su=Integer.parseInt(args[i]);
			System.out.println(++su);
		}
	}

}
