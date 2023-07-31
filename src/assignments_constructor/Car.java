package assignments_constructor;

public class Car {

	
	String make;
	String model;
	int year;
	
	public Car(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Car c = new Car("ABC", "xyz", 2020);
		
		System.out.println(c.make+c.model+c.year);
		
		Car c1 = new Car();
		
		System.out.println(c1.make+c1.model+c1.year);
		Car c2 = new Car("WWW", "XXX", 2021);
		
		System.out.println(c2.make+c2.model+c2.year);
		

	}

}
