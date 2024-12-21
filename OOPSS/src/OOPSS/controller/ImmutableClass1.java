package OOPSS.controller;

/*
final class Leptop {
	private final String name;
	private final double price;
	private final int ram;
	
	Leptop(String name, double price, int ram){
		this.name = name;
		this.price = price;
		this.ram = ram;
	}
		
		public String getName() {
			return name;
		}
		
		public double getPrice() {
			return price;
		}
		
		public int getRam() {
			return ram;
		}
}

public class ImmutableClass1 {

	public static void main(String[] args) {
		
		Leptop l1 = new Leptop("dell", 12000.00, 120);
		
		System.out.println(l1.getName());
		System.out.println(l1.getPrice());
		System.out.println(l1.getRam());


	}

}
*/

//=======================================================================================================================================

import java.util.Date;

public final class ImmutableClass1 {
    private final String name;
    private final int age;
    private final Date birthDate;

    
    public  ImmutableClass1(String name, int age, Date birthDate) {
        this.name = name;
        this.age = age;
        
      
        this.birthDate = new Date(birthDate.getTime());
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthDate() {
    
        return new Date(birthDate.getTime());
    }

   
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", birthDate=" + birthDate + '}';
    }

    public static void main(String[] args) {
        // Create a new Person object
    	
        Date birthDate = new Date(1990, 10, 5);
        ImmutableClass1 person = new  ImmutableClass1("Alice", 34, birthDate);

        // Displaying the person's information
        System.out.println(person);

        // Attempting to modify the birth date externally does not affect the original object
        birthDate.setYear(2000); // This will not modify the original birthDate in the person object
        
        // Displaying the person's information after modification attempt
        System.out.println(person);
    }
}


