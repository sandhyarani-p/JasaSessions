package classandobjects;

public class User {

	String name;
	int age;
	String city;

	public static void main(String[] args) {

		User u1 = new User();
		u1.name = "Rinku";
		u1.age = 30;
		u1.city = "Pune";

		User u2 = new User();
		u2.name = "Sapna";
		u2.age = 31;
		u2.city = "Bangalore";

		User u3 = new User();
		u3.name = "Azmoon";
		u3.age = 35;
		u3.city = "NY";

		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		u1=u2;// u1 break the connection from u1 ref and start pointing to u2
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		u2=u3;//u2 berak the connection from u2 and start referring to u3
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		u3=u1;//u3 break the connection from u3 and start pointing to where u1 is pointing currently(u2)
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		
		
		
		
		
		

	}

}
