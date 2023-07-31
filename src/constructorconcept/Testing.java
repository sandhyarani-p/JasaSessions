package constructorconcept;

public class Testing {

	
	// no one can create the object of this class
	// we can do by making the constructor as static
	
	//whenever we create private constructor,then we should have static methods in that class
	//which class is having private constructor-->System class
	
	
	
	private Testing() {
		
		
	}
	
	public static void getApp() {
		System.out.println("");
	}
	
	public static void getAppNumber() {
		System.out.println("get the app number");
	}
	
	public static void getBrowserVersion() {
		System.out.println("");
	}
	public static void main(String[] args) {
		
		Testing t1 = new Testing();
		
		

	}

}
