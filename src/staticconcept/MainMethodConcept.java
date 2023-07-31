package staticconcept;

public class MainMethodConcept {

	
	// why Method is static-no need to create object to call
			//void- no business logic in main method hence no return type.
	
	//calling purpose
	//no return
	//JVM look for PSVM with String[] argument
	
	// why Method is static-no need to create object to call
			//void- no business logic in main method hence no return type.
	//Main method can be overloaded
	//static method can be overloaded
	//main method can be overloaded
	public static void main(String[] args) {
		
		
		System.out.println("Main method");
		
		MainMethodConcept.main(12, "test");

	}

	public static void main(int a) {
		System.out.println("hi");
	}
	
	public static void main(int a,String b) {
		System.out.println(a+b);
	}
}
