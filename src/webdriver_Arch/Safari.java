package webdriver_Arch;

public class Safari implements WebDriver {

	public Safari() {
		System.out.println("launch Safari driver");
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
