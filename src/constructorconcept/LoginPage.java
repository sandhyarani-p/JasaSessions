package constructorconcept;

public class LoginPage {

	String username;
	String userPassword;

	public LoginPage(String username, String userPassword) {

		this.username = username;
		this.userPassword = userPassword;
	}

	public void doLogin() {

		System.out.println("login to app");
		System.out.println("entering username"+username );
		System.out.println("entering password"+userPassword );
		System.out.println("user is logged in");
	}

	public void resetPwd() {
		System.out.println("Reset my passwrod");

	}

}
