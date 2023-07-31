package oop_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Tom");
		e1.setAge(20);
		e1.setSalary(12.33);

		String st = e1.getName();
		System.out.println(st);
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		System.out.println(e1.getAmount(20));

		Employee e2 = new Employee();
		e2.setName("chaitra");
		e2.setAge(23);
		e2.setSalary(32);
		System.out.println(e2.getName());
		System.out.println(e2.getAge());
		System.out.println(e2.getSalary());
		System.out.println(e2.getAmount(5));

		// LoginPageTest

		LoginPage lp = new LoginPage();

		lp.setUsername("admin@123");
		lp.setPassword("admin@123");

		lp.doLogin();

		LoginPage lp1 = new LoginPage();
		lp1.setUsername("admin@1234");
		lp1.setPassword("admin@1234");
		// not setting any values
		lp1.doLogin();
	}
}