package OOPSS.controller;

import java.util.ArrayList;

public class WrapperClass1 {

	public static void main(String[] args) {
		
		// 1 Autoboxing: converting primitve to wrapper class
		int num1 = 100;
		Integer wrappInt = num1; // Autoboxing
		double num2 = 123.45;
		Double wrapperDouble = num2;  // Autoboxing
		
		// Unboxing Converting wrapper class to primitive
		int primitiveInt =  wrappInt;
		double primitiveDouble = wrapperDouble;
		
		System.out.println("Autoboxed Integer: "+ wrappInt);
		System.out.println("Unboxed Integer: "+ primitiveInt);
		System.out.println("Autoboxed Double: "+ wrapperDouble);
		System.out.println("Unboxed Double: "+ primitiveDouble);
		
		// Utility methods
		String str = "25";
		int parseInt  = Integer.parseInt(str);
	    System.out.println("Parsed from Integer: "+ parseInt);
	    
	    // Finding the maximum of two values
	    ArrayList <Double> doubleList = new ArrayList<>();
	    doubleList.add(5.6);
	    doubleList.add(10.8);
	    System.out.println("Collection of double obkect: "+ doubleList);
	    
	}
}


// Autoboxing: converting primitive to wrapper class
// Unboxing: converting wrapper class to primitive 
	    
	    
	    
		


