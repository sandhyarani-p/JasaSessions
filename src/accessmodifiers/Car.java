package accessmodifiers;

public class Car {
	public String name;
	protected int price;
	private int mileg;
	String color;//this is default,no need to use  explicit default keyword
	
	//same class all the modifiers are allowed
	public static void main(String[] args) {
	
		Car c = new Car();
		c.color="Honda";
		c.mileg=12;
		c.price=999999;
		c.color="red";
		
		

	}

}
