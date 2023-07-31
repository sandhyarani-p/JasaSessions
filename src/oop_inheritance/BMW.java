package oop_inheritance;

public class BMW extends Car {

	// diamond problem-a class is trying to be the child of multiple
	// classes,multiple inheritance is not allowed in java.
	
	//at a time only one class can be extends

	// method overriding:Runtime polymorphism(Dynamic polymorphism)
	// when we have method in parent class and same method in child class
	// with the same name and same number of parameters
	// and same sequence of parameters
	// same return type

	@Override
	public void start() {

		System.out.println("BMW start method");
	}

	public void autoparking() {

		System.out.println("BMW autoparking......");
	}

	@Override
	public void engine() {
		System.out.println("BMW turbo engine");
	}

	public static void billing() {
		System.out.println("BMW==billing");
		}
	
	// static method cannot be overridden
	//individual method
	private void testing() {
		System.out.println("car testing");
	}

	// cannt override final method from parent class
//public void power() {
//	
//}
}
