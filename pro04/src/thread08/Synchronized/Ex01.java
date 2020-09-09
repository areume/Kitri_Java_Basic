package thread08.Synchronized;

/**
 * @author : 김아름
 * @date   : 2020. 5. 21.
 * @description : 
 */

public class Ex01 {

	public static void main(String[] args) {
		
		Toilet toilet=new Toilet();	// 공유 객체
		
		Family father=new Family(toilet);
		father.setName("아빠");
		father.start();
		
		Family mother=new Family(toilet);
		mother.setName("엄마");
		mother.start();
		
		Family brother=new Family(toilet);
		brother.setName("오빠");
		brother.start();
		
		Family sister=new Family(toilet);
		sister.setName("언니");
		sister.start();
		
		Family me=new Family(toilet);
		me.setName("르미");
		me.start();
		
		
	}

}
