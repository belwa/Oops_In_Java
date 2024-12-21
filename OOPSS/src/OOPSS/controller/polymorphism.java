package OOPSS.controller;

// * diiferent way to complile time polymorphsim (i) method overloading and (ii) constructor overloading

// (i) method 

/*
class Calculator {
	
	
	// Method 1
	public int Add(int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b;
	}
	
	public double add(double a, double b) {
		return a+b;
	}
}
		
		

public class polymorphism {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(5,10));
		System.out.println(cal.add(5,10, 20));
		System.out.println(cal.add(5.1,10.7));
		

	}

}
*/

//=======================================================================================================================================
//(ii) Constructor Overloading

/*
class Employ{
	String name;
	int age;
	
	Employ(){
		
	}
	
	Employ(String name){
		this.name = name;
	}
	
	Employ(String name, int age){
		this(name);
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("the employ name is: "+ name);
		System.out.println("the employ id is: "+ age);
	}
		
}

public class polymorphism {
	
	public static void main (String[] args) {
		Employ e1 = new Employ();
		Employ e2 = new Employ("john");
		Employ e3 = new Employ("John", 30);
		
		e1.displayInfo();
		e2.displayInfo();
		e3.displayInfo();
		
	}
}
*/

//========================================================================================================================================





