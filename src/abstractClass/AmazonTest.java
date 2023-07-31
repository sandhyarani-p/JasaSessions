package abstractClass;

public class AmazonTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage(10);
		lp.dologin();
		lp.title();
		Page.displayfooters();
		lp.url();
		lp.dafaultPageTimeOut();
		lp.dologin();
		Page.displayfooters();
		lp.loadingTime=20;
		
		//topcasting
		
		Page pg = new LoginPage();
		pg.dafaultPageTimeOut();
		pg.title();
		pg.url();
	
		
		
		//cant create object for abstract class
		//Page p = new Page();
		//down casting is not Applicable.

	}

}
