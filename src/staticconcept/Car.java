package staticconcept;

public class Car {

	
	String Name;
	String EngineNumber;
	String chasisNumber;
	double price;
	final static  int wheels=4;//wheels is common in all cars as 4 ,so we make the variable as static
	//final- means value cant be changed
	
	//we create static methods for common values like Utils/generic function
	//Header/footer,search are static methods
	
	public static  void  displayLogo() {
		
		
	}
	
	public void getUrl() {
		
		
	}

	public static void main(String[] args) {
		
		//static int i=0; //static is not allowed for local variable,only final is allowed for local variable
		
		Car c1 = new Car();
		c1.Name="Audi A6";
		c1.chasisNumber="AGHFU1233232";
		//c1.wheels= 4;
		
		Car c2 = new Car();
		c2.Name="Audi Q5";
		c2.chasisNumber="AUDIU3434232";
		//c2.wheels= 4;

		Car c3 = new Car();
		c3.Name="BMW X7";
		c3.chasisNumber="BMWFU1233254";
		//c3.wheels= 4;(common value wheel=4 for all the cars ,hence we are making this common value as static
		//so that only one copy will be created in CMA when we make the variable as static.
		//static is not constant,eg->company logo ,human- parts of body-static in nature
		
		//Car.wheels=5; here anyone can change the static values ,to avoid this we need to make the variable as final
		//final->value can not be changed
		
		System.out.println(c3.Name+" "+c3.chasisNumber+ " "+c3.EngineNumber+ Car.wheels);
	}

}
