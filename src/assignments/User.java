package assignments;

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
		
		User u4 = new User();
		u4.name="Seema";
		u4.age=41;
		u4.city="Delhi";

		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		
		//Rinku,Sapna,Azmoon,Seema
		
		u1=u2;// u1 break the connection from u1 ref and start pointing to u2
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		//Sapna,Sapna,Azmoon,Seema
		
		u2=u3;//u2 berak the connection from u2 and start referring to u3
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		
		//Sapna,Azmoon,Azmoon,Seema
		
		u3=u4;//u3 break the connection from u3 and start pointing to where u4 
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		//Sapna,Azmoon,Seema,Seema
		
		u4 = u1;//u4 break the connection from u4 and start pointing to u1 where its currently pointing
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		
		//Sapna,Azmoon,Seema,Sapna
		
		
		
		
		
		

	}

}
