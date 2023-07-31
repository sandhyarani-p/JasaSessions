package superkeyword;

public class BMW extends Car {
// int min_speed=200;
 
 
 public BMW() {
	 super(20);//super should be first statement 
	// this(25);//super and this cant be together
	 System.out.println("BMW default contructor");
 }
 
 public BMW(int i) {
	 System.out.println("BMW param contructor"+i);
 }
 public void displaySpeed() {
	
		System.out.println(min_speed);
		 System.out.println(super.min_speed);
		 
	}
 //super is used to avoid unnecessary object creation
 //super has to use inside the method
 public void speed() {
	 System.out.println("BMW --speed");
	 super.speed();
	 System.out.println(super.min_speed);
	 super.testing();
	 Car.testing();
 }
 
 
}
