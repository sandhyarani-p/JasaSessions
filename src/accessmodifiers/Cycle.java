package accessmodifiers;

public class Cycle {

	
	//same package non subclass-all allowed except private
	public static void main(String[] args) {
		
		Car c = new Car();
		c.color="green";
		c.name="maruthi";
		c.price=112212;
	}

}
