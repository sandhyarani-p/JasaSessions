package webdriver_Arch;

public class AmazonTest {

	public static void main(String[] args) {
		
		
		//WebDriver driver=new ChromeDriver();
//		ChromeDriver driver=new ChromeDriver();
//		FirefoxDriver driver=new FirefoxDriver();
//		Safari driver=new Safari();
		
		
		
		String browserName="wsafari";
		
		WebDriver driver = null;
		
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();//top casting
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new Safari();
			break;
		default:
			System.out.println("pls pass the right browser name");
			break;
		}
		driver.findElements("emailId");
		driver.sendKeys();
		driver.click();
		driver.quit();
	}

}
