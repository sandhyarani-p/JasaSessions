package builderPattern;

public class ShopTest {

	public static void main(String[] args) {

		
		//1
Shopping shop = new Shopping();
shop.login("naveen@gmail.com", "naven123")
		.search("macbook")
			.addToCart("macbook")
				.doPayment("989989898@ibl")
					.generateOrder()
						.logout();
//2.

shop.login("naveen@gmail.com", "naven123")
	.search("T Shirt", 1000)
		.addToCart("T Shirt")
			.logout();

//3.
shop.login("naveen@gmail.com", "naven123")
	.search("Apple Iphone")
		.search("Applemac book pro")
			.search("Apple Imac")
				.addToCart("Apple Iphone")
					.doPayment("1222 2211 1111 2123", 899)
					.generateOrder()
						.logout();

//4.

shop.login("naveen@gmail.com", "naven123")
	.logout();


	}

}
