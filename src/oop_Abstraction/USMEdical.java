package oop_Abstraction;

public interface USMEdical extends WHO,UN{

	
	int min_fee=100;
	//Interface variables are always static and final by default
	//method has no body
	//only method declaration/method prototype
	//no business logic inside interfaces,class who implements has to implement the logic 
	//abstract method
	//Abstraction -hiding the implementation
	//static methods are not allowed-because override is not possible for static methods
	//implements is the keyword used to when we use INterface to class
	
	
	//method has no body/only method declaration/no business logic
	//these methods are abstract methods
	//no need to mention abstract explicitly in interface,by default they are abstract in nature
	//no concept of constructor also as we dont create object
	//Interfaces cant be final.because someone has to implement its method,same with the abstract methods
	//Abstraction- hiding the implementation 
	
	//child class can have multiple interfaces  but can have only one  class extends
	//INterface can only have only parent Interface but cant have parent class
	
	//100% abstraction
	public void physioServices();
	
	public void CardioService();
	public void ENTService();
	public void EmergencyService();
	public void test(int a);
	public String get(int a);
	
	public String get(int a,int b);
	
	
	// JDK 1.8: partial abstraction
	//1. can have static method with method body(buss logic):
	//this is used when interfcae wants to have some business logic specific to interface only
	
	public static void usMedPharmacy() {
		System.out.println("US -- Med Pharmacy");
	}
	
	//2.can have a default method(non static) with method body
	
	default void billing() {
		
		System.out.println("US--billing");
	}
	
	
	
}
