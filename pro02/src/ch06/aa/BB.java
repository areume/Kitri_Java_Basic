package ch06.aa;

public class BB {
	public static void main(String[] args) {
		AA a=new AA();
		
		//System.out.println("num1 : "+a.num1);
		System.out.println("num2 : "+a.num2);
		System.out.println("num3 : "+a.num3);
		System.out.println("num4 : "+a.num4);
	}
}



// AA 클래스의 num2는 protected로 선언되어 동일 패키지 내에서는 사용 가능하다.
// AA 클래스의 num4는 default로 선언되어 동일 패키지 내에서는 사용 가능하다.