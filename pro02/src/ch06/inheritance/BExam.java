package ch06.inheritance;

public class BExam {

	public static void main(String[] args) {
		// 자신의 클래스 생성자 거친 후, 부모 클래스의 생성자를 검토한다. 부모 클래스에 없으면 디폴트 생성자.
		BBusinessMan bbm=new BBusinessMan("혼길동","키트리","교육생");
		bbm.info();
	}

}
