package api13.Exception;

/**
 * @author : 김아름
 * @date   : 2020. 5. 18.
 * @description : 
 */

class Animal { }

class Dog extends Animal { }

class Cat extends Animal { }

public class Ex06 {

	public static void changeAnimal(Animal animal) {
		/*
		if(animal instanceof Dog) {
			Dog dog=(Dog)animal;
			
		}else if(animal instanceof Cat) {
			Cat cat=(Cat)animal;
		}*/
		
		try {
		Dog dog=(Dog)animal;
		}catch(ClassCastException e) {
			System.out.println("다운 캐스팅이 잘못되었습니다.");
		}
	}
	
	public static void main(String[] args) {
		
		Dog dog=new Dog();
		changeAnimal(dog);
		
		Cat cat=new Cat();
		changeAnimal(cat);

	}
}
