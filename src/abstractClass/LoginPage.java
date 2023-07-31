package abstractClass;

public class LoginPage extends Page{

	
	//java will create hidden default constructor
	//in case of contrsuctor first preference to parent class contructor then to child class constructor
	
	public LoginPage() {
		System.out.println("Login page consructor");
	}
	
	public LoginPage(int a) {
		System.out.println("Login page 1 param consructor");
	}
	@Override
	public void title() {
		System.out.println("LP title");
		
	}

	@Override
	public void url() {
		System.out.println("LP url");
		
		
	}
	@Override
	public void dafaultPageTimeOut() {
		System.out.println("LP--TimeOut-5sec");
	}
	
	public void dologin() {
		
		System.out.println("LP--login");
		
	}

}
