package OOPSS.controller;

// example of 1

/*
class janwar {
	
	public void sound() {
		System.out.println("Animal make a sound");
	}
}

class dogs extends janwar{
	public void sound() {
		System.out.println("Dogs barks");
	}
}

public class Upcasting1{
     public static void main (String[] args) {
    	 janwar a1 = new dogs(); // upcasting
    	 
    	 a1.sound();
     }
}
*/

//=======================================================================================================================================


// example of 2

class Employee {
	String name;
	double salary;

// Constructor
public Employee(String name, double salary) {
	this.name = name;
	this.salary = salary;
}

// Method to display employee details
public void diplayInfo() {
	System.out.println("the employee name is: "+ name);
	System.out.println("the employee salary is: "+ salary);
	
}


}

// subClass
 class Manager extends Employee{
	String department;
	
	// Constructor
	public Manager(String name, double salary, String department) {
		super(name, salary);
		this. department = department;
	}
	
	public void displayInfo() {
		super.diplayInfo();
		System.out.println("Manager' s department: "+ department);
	}
 }
 
 public class Upcasting1 {
	 
	 public static void main (String[] args) {
		 Employee e1 = new Employee("John die", 500000.00);
		 e1.diplayInfo();
		 
		 System.out.println();
		 
		 Manager mgr1 = new Manager("Jane smith", 80000, "sales");
		 mgr1.diplayInfo();
		 
		 
	 }
 }
	


	
	