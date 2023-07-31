package accessmodifiers;

public class BMW extends Car{

	//same package subclass --all allowed except private
	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.color="Yellow";
		b.name="verna";
		b.price=88888;
	}
}
