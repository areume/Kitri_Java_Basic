package ch00.quizInterface;

interface Action {
	public void work();
}

public class Quiz10 {
	public static void main(String[] args) {
		Action action=new Action() {
			public void work() {
				System.out.println("열심히 공부합시다.");
			}
		};				
		action.work();		
	}
}
