package OOPSS.controller;

// Single level inharience
/*
class Animal {
	String name;
	
// constructor of the superclass	
	public Animal(String name) {
		this.name = name;
	}
	
 // method of the the superClass
	public void eat() {
		System.out.println(name + " is eating");
	}
	
}

// superClass Inharit from the animal
class Dog extends Animal{

	// Constructor of superclass
	public Dog(String name) {
		// calling the superClass constructor
		super(name);
	}
	
	// subclass can also has won method
	public void bark() {
		System.out.println(name + " is barking");
	}
	
	
}


public class SingleLevelInharitence1 {

	public static void main(String[] args) {
		Dog dog = new Dog("Buddy");
		
		dog.eat();
		dog.bark();
	

	}

}
*/

//=======================================================================================================================================
// Another Example
/*
class Vechile {
	String make;
	int year;
	
// create the constructor
	public Vechile(String make, int year) {
		this.make = make;
		this.year = year;
		
	}
	
// Method in the superClass
 public void start() {
	 System.out.println("start the vechile");
 }
	 
public void displayInfo() {
	System.out.println("Vechile make: "+ make + ", Year "+ year);
	
 }
}

class Car extends Vechile {
	int door;
	
	public Car(String make, int year, int doors) {
		super(make, year);
		this.door = door;
	}
	
	public void honk() {
		System.out.println("the system is honk");
	}
	
	public void start() {
		System.out.println("the car is starting form thr roar");
	}
	
	public void displayCarInfo() {
		displayInfo();
		System.out.println("Number of door "+ door);
		
	}
	
}

public class SingleLevelInharitence1{
	
	public static void main(String[] args) {
		Car myCar = new Car("totota", 2020, 4);
		
		myCar.start();
		myCar.honk();
		myCar.displayInfo();
		  
		
	}
	
}
*/
	
	
	
	
	




