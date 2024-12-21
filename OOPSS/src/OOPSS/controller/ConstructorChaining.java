package OOPSS.controller;

// constructor Chaining
/*
 class Employ {
	 String name;
	 int id;
	 double salary;
	 
	public Employ() {
		System.out.println("this is the non parametrized construcor");
	}
	
	public Employ(String name) {
		this.name = name;
	
	}
	
	public Employ(String name, int id) {
		this(name);
		this.id = id;
	}
	
	public Employ(String name, int id, double salary) {
		this(name, id);
		this.salary= salary;
	}
	
	public void displayInfo() {
		System.out.println("the emp name is: "+ name);
		System.out.println("the emp id is: "+ id);
		System.out.println("the emp salary is: "+ salary);
	}
	
}

public class ConstructorChaining {

	public static void main(String[] args) {
		Employ e1 = new Employ();
		Employ e2 = new Employ("John");
		Employ e3 = new Employ("John", 12);
		Employ e4 = new Employ("John", 12, 1290000.00);
		
		e1.displayInfo();
		e2.displayInfo();
		e3.displayInfo();
		e4.displayInfo();
		

	}

}
*/

//=======================================================================================================================================
// constructor chaining in second example

public class ConstructorChaining {
    // Instance variables
    String model;
    int year;

    // Non-parameterized constructor
    public ConstructorChaining() {
        model = "Unknown";
        year = 0;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }

    public static void main(String[] args) {
        // Creating an object using the non-parameterized constructor
        ConstructorChaining car1 = new ConstructorChaining();
        
        // Displaying details of the car
        car1.displayDetails();
    }
}

