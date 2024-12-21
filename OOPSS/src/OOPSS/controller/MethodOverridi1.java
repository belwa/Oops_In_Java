
package OOPSS.controller;

class Animals {
	
	public void Sound() {
		System.out.println("Animal makes a sound");
	}
	
}

	class Dogs extends Animals {
		// Override the sound method
		public void Sound() {
			System.out.println("Dogs barks:");
		}
	}
		

	
public class MethodOverridi1 {

	public static void main(String[] args) {
	     Animals a1 = new Animals(); // call the method of animal class
	     a1.Sound();

	     Dogs dog = new Dogs();
	     dog.Sound(); // calls the overriden method in Dog class
	}

}
