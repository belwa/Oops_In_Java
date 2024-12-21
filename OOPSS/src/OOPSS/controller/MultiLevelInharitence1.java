package OOPSS.controller;

// Base class
class Animal {
	
	public void eat() {
		System.out.println("the Animal is eating: ");
	}
}

// inharit for Aninal
class Dog extends Animal {
	
	public void bark() {
		System.out.println("the dog is barking");
	}
}

class Puppy extends Dog {

	public void play() {
		System.out.println("the puppy play with call: ");
	}
}

public class MultiLevelInharitence1 {
	

	public static void main(String[] args) {
		 Puppy puppy = new Puppy();
		 
		 puppy.eat();
		 puppy.bark();
		 puppy.play();
		

	}

}
