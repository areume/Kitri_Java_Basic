package ch05.object.test;

class Birthday {
	private int year;
	private int month;
	private int day;
	private String name;
	
	public Birthday(int year, int month, int day, String name) {
		this.year=year;
		this.month=month;
		this.day=day;
		this.name=name;
	}
	
	public void disp() {
		System.out.println(name+" : "+year+"년 "+month+"월 "+day+"일");
	}
}

public class Exam22 {

	public static void main(String[] args) {

		Birthday bday=new Birthday(1995,12,07,"areum");
		bday.disp();
	}

}

// 멤버 변수 설정. [1] . 연산자로 접근 (private로 선언한 경우에는 불가능) [2] 함수를 선언 [3] getter/setter 함수 이용 [4] 생성자 이용
