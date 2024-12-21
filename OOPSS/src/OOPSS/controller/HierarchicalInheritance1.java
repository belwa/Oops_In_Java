package OOPSS.controller;

/*
class Animal {
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println(name + " make a sound");
	}
}

class Dog extends Animal {
	
	public Dog(String name) {
		super(name);
	}
	
	public void bark() {
		System.out.println(name+ " bark");
	}
		
}

class Cat extends Animal {
	
	Cat(String name){
		super(name);
	}
	
	public void meow() {
		System.out.println(name + " meows");
	}
	
}

public class HierarchicalInharitence1 {

	public static void main(String[] args) {
		Dog dog = new Dog("buddy");
		Cat cat = new Cat("Whiskers");
		
		dog.speak();
		cat.speak();
		
		dog.bark();
		cat.meow();
		

	}

}
*/

//=======================================================================================================================================
// EXAMPLE

/*
class Vehicle {  // Fixed class name from "Vechile" to "Vehicle"
    String brand;
    int year;
    
    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

// First child class
class Car extends Vehicle {  // Inheriting from "Vehicle" class
    int doors;
    
    Car(String brand, int year, int doors) {
        super(brand, year);  // Calling the superclass constructor
        this.doors = doors;
    }
    
    public void startEngine() {
        System.out.println("The car's engine is now running.");
    }
}

// Second child class
class Motorcycle extends Vehicle {  // Inheriting from "Vehicle" class
    boolean hasSidecar;
    
    Motorcycle(String brand, int year, boolean hasSidecar) {
        super(branpd, year);  // Calling the superclass constructor
        this.hasSidecar = hasSidecar;
    }
    
    public void revEngine() {
        System.out.println("The motorcycle engine is revving.");
    }
}

public class HierarchicalInheritance1 {  // Fixed class name from "HierarchicalInharitence1" to "HierarchicalInheritance1"
    public static void main(String[] args) {  // Added main method to make the code executable
        Car car = new Car("Toyota", 2020, 4);
        Motorcycle motor = new Motorcycle("Apache", 2022, false); 
        
        car.displayInfo();  // Display car information
        motor.displayInfo();  // Display motorcycle information
    }
}
*/
