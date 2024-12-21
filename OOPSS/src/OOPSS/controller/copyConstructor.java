 

package OOPSS.controller;

// * copy Constructor

class Person {
	String name;
	int age;
	
	Person(){
		
	}
	
	Person(String name, int age){
		this.name =name;
		this.age = age;
		
	}
	
	Person(Person p){
		this.name = p.name;
		this.age = p.age;
	}
	
	public void displayInfo() {
		System.out.println("the Person name: "+ name);
		System.out.println("the Person age: "+ age);
	}
}



public class copyConstructor {

	public static void main(String[] args) {
		Person p1 = new Person("Alice", 30);
		Person p2 = new Person(p1);
		
		// Display the both object
		
		// orginal print data
		p1.displayInfo();
		p2.displayInfo();
		
		
	
		
		
		
		

	}

}
