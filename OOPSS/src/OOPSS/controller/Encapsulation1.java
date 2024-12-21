package OOPSS.controller;

class Employees {
	private String name;
	private int age;
	private double salary;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age>0) {
			this.age = age;
			
		} else  
		{
			System.out.println("Age must be positive");
		}
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		if(salary>0) {
			this.salary = salary;
		}
		else
		{
			System.out.println("slary must be positive:");
		}
	}
	
	public void displayInfo() {
		System.out.println("Employee name: "+ name);
		System.out.println("Employee Age: "+ age);
		System.out.println("Employee salary: "+ salary);
	}
	
}

public class Encapsulation1 {
	
	public static void main (String[] args) {
		Employees emp = new Employees();
		
		emp.setName("john doe");
		emp.setAge(30);
		emp.setSalary(50000);
		
		emp.displayInfo();
	}
}
	
	
	
	
	
	
	
	
	



















	




