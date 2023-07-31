package constructorconcept;

public class LoginTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage("Taru","Taru@1234");
		lp.doLogin();
		
		LoginPage lp1 = new LoginPage("Aru","aru@12345");
		lp1.doLogin();
		
		LoginPage lp2 = new LoginPage("radha","radha@12345");
		lp2.doLogin();
		lp2.resetPwd();
	}

}
