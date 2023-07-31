package oop_Encapsulation;

public class LoginPage {

	private String Username;
	private String Password;

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	// we can check the condition also inside the setter method
	public void setPassword(String password) {
		if(password!=null) {
		if (password.length() >= 8) {
			Password = password;
		}
		}
	}

	public void doLogin() {

		System.out.println("logged in with :" + Username + "" + Password);
	}

}
