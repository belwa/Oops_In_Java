package OOPSS.controller;

/*	
class Car {
	String color;
	String model;
	int speed;
	
	public void star() {
		System.out.println("Car started");
	}
	
	public void accelerate() {
		System.out.println("the car is accelarated");
	}
}

	

public class Object {
	public static void main(String[] args) {
		// create a object of the car class
		Car myCar = new Car();
		
		// setting attribute for the object
		myCar.color = "red";
		myCar.model = "toyota";
		myCar.speed = 0;
		
		myCar.star();
		myCar.accelerate();
	}
		
}
*/

//=======================================================================================================================================
// example object of book uses of constructor

 class Book {
	// Attribute of the Book class
	 String title;
	 String author;
	 double price;
	 
	 // Constructor to initialized the Book Object
	 Book(String title, String author, double price){
		 this.title = title;
		 this.author = author;
		 this.price = price;
	 }
	 
	 // create a method to details of the book
	 public void displayBook() {
		 System.out.println("Book title is: "+ title);
		 System.out.println("the author is: "+ author);
		 System.out.println("the price is: "+ price);
	 }
	 
	 // Method to apply a discount on the price
	 public void applyDiscount(double discountPercentage) {
		 price = price- (price*discountPercentage/100);
		 System.out.println("Price after " + discountPercentage + "% discount: $" + price);
	 }
	 
	 
}

 public class Object{

	 public static void main (String[] args) {
		 // Created the object of the book class
		 Book book1 = new Book("java Programming", "John doe", 39.99);
		 
		 // display the detail of the book
		 book1.displayBook();
		 
		 // apply the discount of the display
		 book1.applyDiscount(10);
		 
		 // after the disCount of the price
		 book1.displayBook();

	
		
	}
}


		


