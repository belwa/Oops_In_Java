package OOPSS.controller;

class Employ1 {
    String name;
    int id;
    double salary;

    // Constructor 1: No parameters (default values)
    public Employ1() {
        name = "unknown";
        id = 123;
        salary = 1200000.00;
    }

    // Constructor 2: One parameter (name)
    public Employ1(String name) {
        this.name = name;
        
    }

    // Constructor 3: Two parameters (name, id)
    public Employ1(String name, int id) {
        this.name = name;
        this.id = id;
      
    }

    // Constructor 4: Three parameters (name, id, salary)
    public Employ1(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Display the details of the employee
    public void displayInfo() {
        // Print employee details
        System.out.println("The employee name is: " + name);
        System.out.println("The employee id is: " + id);
        System.out.println("The employee salary is: " + salary);
    }
}

public class ConstructorOverLoading {
    public static void main(String[] args) {
        // Create constructors with different arguments
        Employ1 e1 = new Employ1();               // Default constructor
        Employ1 e2 = new Employ1("Sunny");        // One parameter constructor
        Employ1 e3 = new Employ1("Sunny", 123);   // Two parameters constructor
        Employ1 e4 = new Employ1("Sunny", 123, 120000.00); // Three parameters constructor
        
        // Display the information for each employee
        e1.displayInfo();  // Should print default values
        e2.displayInfo();  // Should print default values for id and salary
        e3.displayInfo();  // Should print default salary
        e4.displayInfo();  // Should print all passed values
    }
}
