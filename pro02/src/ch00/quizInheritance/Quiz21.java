package ch00.quizInheritance;

abstract class Study {
	public abstract void printMsg();
}

class Study_Java extends Study {
	public void printMsg() {
		System.out.println("Java는 참 재미있습니다.");
	}
}

public class Quiz21 {
	public static void main(String[] args) {
		Study s=new Study_Java();
		s.printMsg();
	}
}
