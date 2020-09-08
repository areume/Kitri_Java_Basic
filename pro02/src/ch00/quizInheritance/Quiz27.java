package ch00.quizInheritance;

class Tire {
	public void run() 
	{
		System.out.println("일반");
	}
}

class SnowTire extends Tire {
	public void run() {
		System.out.println("스노우");
	}
}

public class Quiz27 {
	public static void main(String[] args) {
		SnowTire snowTire=new SnowTire();
		Tire tire=snowTire;		// Tire tire=new SnowTire();
		
		snowTire.run();
		tire.run();
	}
}
