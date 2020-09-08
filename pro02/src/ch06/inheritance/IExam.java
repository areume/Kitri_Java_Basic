package ch06.inheritance;

/**
 * @author : 김아름
 * @date   : 2020. 5. 7.
 * @description : 클래스 객체를 파라미터로 던져주기.
 */

class XX {
	
	@Override
	public String toString() {
		return "집에 보내주세여";
	}

	public void disp() {
		System.out.println("disp Function");
	}
}

class YY {
	public void setData(XX x) {
		x.disp();
		System.out.println(x.toString());
	}
	
	public void setDate2(Object obj) {
		// obj.disp() -- ERROR! 자식 클래스의 고유 메소드이므로 부모 클래스 객체에서 사용할 수 없다.
		
		XX x=(XX)obj;
		x.disp();
		System.out.println(x.toString());
	}
}

public class IExam {

	public static void main(String[] args) {
		XX x=new XX();
		YY y=new YY();
		y.setData(x);
		y.setDate2(x);
	}

}
