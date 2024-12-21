package OOPSS.controller;


// example of abstraction class

abstract class janwar {
	
	// absrtact 
	public abstract void sound();
	
	// concrte Method
	public void breathe() {
		System.out.println("this is Animal Breathe");
	}
	
	janwar(){
		System.out.println("an Animal is created");
	}
}

class Dogss extends janwar{

	@Override
	public void sound() {
		System.out.println("the dogs barks: ");
		
	}
	
	@Override
	public void breathe() {
		System.out.println("the dog is breathing");
	}
	
}

class Cat extends janwar {

	@Override
	public void sound() {
		System.out.println("the Cat mrows");
		
	}
	
}

public class Abstraction1 {
	
	public static void main (String[] args) {
		// You cannot instance Animal directly (it is correct)
	//	Animal a1 = new Animal();
		
		Dogss dog = new Dogss();
		dog.sound();
		dog.breathe();
		
		System.out.println();
		
		Cat cat = new Cat();
		cat.sound();
		cat.breathe();
		
		
		
		
	}
}






















	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	







