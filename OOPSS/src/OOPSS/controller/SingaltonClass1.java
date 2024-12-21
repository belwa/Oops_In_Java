package OOPSS.controller;


//====================================================================================================================================== 

class Carr {
	public static Carr c = null;
	
	private Carr() {
		
	}
	
	public static Carr getInstance() {
		if(c== null) {
			c= new Carr();
			return c;
		}
		
		return c;
	}
}

public class SingaltonClass1 {

	public static void main(String[] args) {
		Carr c1 = Carr.getInstance();
		
		System.out.println(c1);


	}

}

//=======================================================================================================================================

