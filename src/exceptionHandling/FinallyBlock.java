package exceptionHandling;

public class FinallyBlock {

	
	//Finally block always executed whether exception coming or not
	//we should always write with try catch block
	// we can write finally without catch-->try and finally allowed.
	public static void main(String[] args) {
		System.out.println("ABC");
		
		try {
			int i=9/0;
			
		} catch (ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		}
		finally {
			System.out.println("I am in finaly block");
			
			try {
				int a=8/0;
			} catch (ArithmeticException e2) {
				System.out.println("AE is coming");
				e2.printStackTrace();
			}
			finally {
				System.out.println("i am in second finally");
			}
		}
		

	}

}
