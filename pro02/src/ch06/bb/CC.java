package ch06.bb;

import ch06.aa.AA;

public class CC extends AA {
	public void disp() {
		//System.out.println(super.num1);
		System.out.println(super.num2);
		System.out.println(super.num3);
		//System.out.println(super.num4);
	}
}







// 다른 패키지의 클래스를 상속하기 위해서는 import를 통해 불러와야 한다. 패키지명.클래스명
// 다른 패키지에 클래스를 import를 통해 불러와 상속한다면 public, protected는 사용할 수 있지만 default는 사용할 수 없다.
