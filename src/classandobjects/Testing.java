package classandobjects;

public class Testing {

		//WAF
	//launch a browser
	//statement:Browser is launched
	//return-boolean-true/false
	//launch browser(browserName(String)
	
	public boolean launchBrowser(String browserName) {
		
		System.out.println("launching the browser..."+browserName);
		boolean flag=true;
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;

		default:
			System.out.println("pls pass the right browser..."+browserName);
			flag=false;
			break;
		}
		return flag;
	}
	///return and break cannot be together and return should be the last statement
 public boolean launchBrowserTest(String browserName) {
		
		System.out.println("launching the browsertest..."+browserName);
		//boolean flag=true;
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			return true;
		case "edge":
			System.out.println("launch edge");
			return true;
		case "safari":
			System.out.println("launch safari");
			return true;
		case "firefox":
			System.out.println("launch firefox");
			return true;

		default:
			System.out.println("pls pass the right browser..."+browserName);
			return false;
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Testing test = new Testing();
		if(test.launchBrowser("Chrome")) {
			System.out.println("enter the url");
		}
		
		boolean f =test.launchBrowserTest("safari");
		System.out.println(f);

	}

}
