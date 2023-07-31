package oop_inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		
		BMW b1 = new BMW();
		b1.start();//Overridden method
		b1.stop();//inherited method
		b1.refuel();//inherited method
		b1.autoparking();//individual method
		b1.engine();
		b1.scienceMethod();
		BMW.billing();
		b1.power();
		
		//Audi is BMW sibling class and cant inherit only we can create object of audi and can call methods if req
		
		Audi a= new Audi();
		a.theftsafety();
		a.start();
		a.stop();
		a.refuel();
		a.engine();
		Car.billing();
		a.power();
		Audi.ABS();
		
	
		
		

		System.out.println("-----------");
		Car c = new Car();
		c.start();//car method
		c.stop();
		c.refuel();
		c.engine();
		c.automob();
		
		
		   Car c1=new BMW();//child class object referred by parent class reference variable-Top(Up) casting
		   //reference type check- parent ref c1 is not able to access child class own methods, ref check failed
		   
		   c1.start();
		   c1.stop();
		   c1.refuel();
		   c1.engine();
		   
		   ///child class object referred by grand parent parent class reference variable
		 Vehicle v= new BMW();
		 
		 v.engine();
		 
		   
		   //is downcasting allowed?
		   
//		   BMW b =  (BMW) new Car();//this will not give compile time error,but gives classcastexception in runtime.
		   //ClassCastException
//		   b.start();
		 //downcasting grand parent class 
		// BMW b2 = (BMW) new Vehicle();//class cast exception
		// b2.autoparking();
		 
		
	}
	

}
