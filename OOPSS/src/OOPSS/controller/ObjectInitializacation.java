
package OOPSS.controller;


// (i) by using object reference
/*

// define a class
class Car {
	String model;
	int year;
	
	// Constructor
	public Car(String model, int year) {
		this.model = model;
		this.year = year;
		
	}
	
	// Methods to display Car details
	public void displayInfo() {
		System.out.println("Model: "+ model);
		System.out.println("Year: "+ year);
	}

	public class ObjectInitializacation {
	
		public static void main(String[] args) {
			// Creating an object of the Car class and String its reference in car1
			Car car1 = new Car("Toyota camry", 2020);
			
			// Using reference 'car1' to call a method
			car1.displayInfo();
			
			// Creating another reference 'car2' pointing to the same object as 'car1'
			Car car2 = car1;
			
		// Using car2 reference to see the updated information
			System.out.println("\nAfter updated car2:");
			car2.displayInfo();
			
			

	
		}

	}
	
}		
*/

//=======================================================================================================================================
//(ii) by Using non static method of the class
/*
// first will create a class
class Employ{
	String name;
	int id;
	double salary;
	
	
	public void setValue(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void getValue() {
		System.out.println("the name is: "+ name);
		System.out.println("the id is: "+ id);
		System.out.println("the salary is: "+ salary);
	}
	
}

	
public class  ObjectInitializacation{
	
public static void main (String[] args) {
	  Employ e1 =new Employ();
	  Employ e2 = new Employ();
	  Employ e3= new Employ();
	  
	  e1.setValue("A", 123, 123.11);
	  e2.setValue("B", 129, 202818.11);
	  e3.setValue("V", 938, 483620.11);
	  
	  e1.getValue();
	  e2.getValue();
	  e3.getValue();
		
	}
}
*/

//========================================================================================================================================

