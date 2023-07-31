package webdriver_Arch;

public interface WebDriver {

	//why webdriver is an interface?-->it cant take decision that how other  browsers are working
	public void click();
	public void sendKeys();
	public void quit();
	public void findElements(String Ele);
}
