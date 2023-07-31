package exceptionHandling;

public class ThowsKeyword {

//Throws keyword is not handling exception,it only throws exception to caller method
	// throws keyword is used after the method name,it throws the exception to
	// calling method
	// Exception can be read from bottom to top
	// Exception stored in stack-LIFO

	public void m1() {
		
		try {
			Thread.sleep(3000);
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("m1 method");
		m2();
		
	}

	public void m2() throws ArithmeticException {
		System.out.println("m2 method");
		try { 	m3();
			
		} catch (ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		}
	}

	public void m3() throws ArithmeticException {
		System.out.println("m2 method");

		int i = 9 / 0;
	}

	public static void main(String[] args)  {
		ThowsKeyword obj = new ThowsKeyword();
		
		obj.m1();
		//its not a good practice to have try catch inside the main method
//		try {
//			obj.m1();
//		} catch (ArithmeticException e) {
//		System.out.println("AE is coming");
//		e.printStackTrace();
//		}

		System.out.println("bye");
	}
}