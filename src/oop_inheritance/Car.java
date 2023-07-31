package oop_inheritance;

public class Car extends Vehicle {

	//final keyword is used to declare constant values
	//2.to prevent method overriding(ex.log0)
	//3.to prevent inheritance
	//4.private method cannot be overriden
	//5.static method cant be override but can be inheritted with child c
	public void start() {
		System.out.println("Car can start");
	}
	
	public void stop() {
	
	System.out.println("Car can stop....");}
	
	
	public void refuel() {
		
		System.out.println("Car can start");
	}
	
	@Override
	public void engine() {
		System.out.println("car  engine");
	}
	
	
	//static method cannot be overridden but can be inherited
	public static void billing() {
		System.out.println("car==billing");
		}
	//private method cannot be overriden
	private void testing() {
		System.out.println("car testing");
	}
	
	//to access private method we need to create public method and access private method
	
	public void carTesting() {
		testing();
		
	}
	
	//method declared as final cannot be overriden but can be inheritted
	public final void power() {
		
		System.out.println("car--Power final method");
	}
	
	public static final void ABS() {
		System.out.println("car--ABS");
	}
}
