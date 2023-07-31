package exceptionHandling;

public class Employee {

	
	//Exception is the super class of all the underlying exception ,AE.NPE ...
	//Throwable is the super class of Exception
	//Throwable class parent is Object but we should not use object class in catch block to caught exception
	//Error is another child class of Throwable class
	//Error-system issues/hardware/RAM space issue
	

	
	String name;

	public void sum(int p) {

		int a = 10;
		int b = 20;
		int c = a + b;

		try {
			int cd = c / p;
		} catch (Exception e) {
		}
		System.out.println("hello");

	}
	public void test(int a, int b) {

		try {
			int c = a / b;
			Employee e = new Employee();
			e = null;
			System.out.println(e.name);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			int c = 9 / 0;
			Employee e = new Employee();

			e = null;
			System.out.println(e.name);
		} catch (ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();// this tells exact details for the exception
		}

		catch (NullPointerException e) {
			System.out.println("NPE is coming");
			e.printStackTrace();// this tells exact details for the exception
		}
		
		catch (Throwable e) {
			System.out.println("some exception is coming");
			e.printStackTrace();// this tells exact details for the exception
		}

		System.out.println("bye");

	}
}