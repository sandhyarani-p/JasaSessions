package webdriver_Arch;

public class FirefoxDriver implements WebDriver {

	public FirefoxDriver() {

		System.out.println("launch chrome driver");
	}

	@Override
	public void click() {
		System.out.println("click on element");

	}

	@Override
	public void sendKeys() {
		System.out.println("sending value to element");

	}

	@Override
	public void quit() {
		System.out.println("quit the browser");

	}

	@Override
	public void findElements(String ele) {
		System.out.println("find element:" + ele);

	}

}
