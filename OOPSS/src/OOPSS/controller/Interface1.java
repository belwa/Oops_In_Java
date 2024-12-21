package OOPSS.controller;

/*
interface Mimals {
	
	public void makeSound();

default void sleep() {
	System.out.println("The animal is sleeping: ");
}

public static  void  eat() {
	System.out.println("The animal is eating: ");
}

}
class Mamman implements Mimals{
	@Override
	public void makeSound() {
		System.out.println("Woof! Woof");
		
	}
}
public class Interface1 {
	public static void main(String[] args) {
		Mamman dog = new Mamman();
		dog.makeSound();
		dog.sleep();
	}

}
*/

//=======================================================================================================================================

//Define an interface for Vehicle
interface Vehicle {
 // Abstract method (must be implemented by the class that implements the interface)
 void start();

 // Abstract method
 void stop();

 // Default method
 default void fuelStatus() {
     System.out.println("Fuel status: OK");
 }

 // Static method
 static void vehicleInfo() {
     System.out.println("Vehicles are used for transportation.");
 }
}

//Implement the Vehicle interface with a Car class
class car implements Vehicle {
 @Override
 public void start() {
     System.out.println("Car is starting...");
 }

 @Override
 public void stop() {
     System.out.println("Car is stopping...");
 }
}

//Implement the Vehicle interface with a Bike class
class Bike implements Vehicle {
 @Override
 public void start() {
     System.out.println("Bike is starting...");
 }

 @Override
 public void stop() {
     System.out.println("Bike is stopping...");
 }
}

public class Interface1 {
 public static void main(String[] args) {
  
     Vehicle car = new car();
     Vehicle bike = new Bike();

     // Using the start and stop methods
     car.start();  
     car.stop();   

     bike.start();
     bike.stop();

     
     car.fuelStatus();  
     bike.fuelStatus();

     
     Vehicle.vehicleInfo();  
 }
}
