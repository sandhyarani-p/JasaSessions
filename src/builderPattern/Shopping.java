package builderPattern;

public class Shopping {

	public Shopping login() {
		System.out.println("user is logged in");
		return this;// this is returning current class object
	}

	public Shopping login(String usernaem, String password) {

		System.out.println("login with:" + usernaem + ":" + password);
		return this;
	}

	public Shopping search(String productName) {

		System.out.println("search name :" + productName);
		return this;
	}

	public Shopping search(String productName, int itemPrice) {

		System.out.println("search name :" + productName + ":" + itemPrice);
		return this;
	}

	public Shopping addToCart(String productName) {
		System.out.println("add to cart" + ":" + productName);
		return this;
	}

	public Shopping doPayment(String cc, int cvv) {
		System.out.println("make payment:" + cc + ":" + cvv);
		return this;
	}

	public Shopping doPayment(String upi) {
		System.out.println("make payment:" + upi);
		return this;
	}

	public Shopping generateOrder() {
		System.out.println("generating the order order id is" + 12345);
		return this;
	}

	public Shopping logout() {
		System.out.println("logout");
		return this;
	}
}
