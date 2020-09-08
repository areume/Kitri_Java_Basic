package ch06.phoneInterface;

/**
 * @author : 김아름
 * @date   : 2020. 5. 8.
 * @description : 시나리오
 * 				  스마트폰의 모델 스펙은 아래와 같다.
 * 				 제품명	전화송수신	3G/LTE/5G	TV리모컨기능
 * 				LPhone	가능		3G			탑재
 * 				SPhone  가능           LTE			탑재
 * 				IPhone	가능		5G			미탑재
 */

public class PhoneMain {

	public static void main(String[] args) {

		Phone[] phoneArray=new Phone[3];
		phoneArray[0]=new LPhone();
		phoneArray[1]=new SPhone();
		phoneArray[2]=new IPhone();
		
		for(int i=0;i<phoneArray.length;i++) {
			phoneArray[i].callSend();
			phoneArray[i].canData();
			phoneArray[i].tvRemote();
			System.out.println();
		}
	}
}
