package ch02.control;
/**
 * @author : 김아름
 * @date   : 2020. 4. 28.
 * @description : Switch Case
 */

public class Exam06 {

	public static void main(String[] args) {

		int su=3;
		
		switch(su) { // 정수형, 문자형 만 가능. 수식, 연산자, 실수형 불가능
		case 1:
			System.out.println("HAHAHA");
			break;
		case 2:
			System.out.println("HOHOHO");
			break;
		case 3:
			System.out.println("HIHIHI");
			break;
		default:
			System.out.println("ETC   ");
		}
		// break 문을 사용하지 않으면 해당하는 case의 아래의 것들이 모두 실행된다.
		// 해당하는 case만 실행하고 종료하도록 break를 사용해야 한다!
		// break문을 사용해서 블록밖으로 나갈지 말지를 제어한다. 필요에 따라 생략하는 경우도!
		
		char a='B';
		
		switch(a) {	// if(a=='W' || a=='w') { System.out.println("White"); } else if(a=='Y' || a=='y') { System.out.println("Yellow"); } ,,,
		case 'W': case 'w':
			System.out.println("White");
			break;
		case 'Y': case 'y':
			System.out.println("Yellow");
			break;
		case 'B': case 'b':
			System.out.println("Blue");
			break;
		case 'R': case 'r':
			System.out.println("Red");
			break;
		}
		// 코드가 중복되지 않도록 생각해서 사용한다.
		// 수식을 사용할 수 없어서 한계가 있다.
		
		
		

	}

}
