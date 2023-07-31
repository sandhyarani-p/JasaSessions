package superkeyword;

public class Car extends Vehicle {
	 int min_speed=100;
	 
	 
	 public Car() {
		 this(90);
		 System.out.println("car default contr..");
	 }
	 
	 public Car(int a) {
		 System.out.println("car default contr.."+a);
	 }
	 
	 
	 public void speed() {
		 System.out.println("car --speed");
	 }
	 
	 public static void testing() {
		 System.out.println("car-- testing");
	 }
}
