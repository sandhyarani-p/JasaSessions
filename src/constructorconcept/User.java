package constructorconcept;

public class User {
	String name;
	int age;
	String city;
	double salary;
	char gender;
	boolean  isActive;
	
	
	public User(String name,int age) {//variables inside the constructor/method is local variable,they are not part of object
		//this keyword ,we can access class variable ,this keyword is used to differentiate local and global variable
		this.name = name;
		this.age = age;
	}
	
	public User(String name, int age, String city) {
		
		this.name = name;
		this.age = age;
		this.city = city;
	}
	public User(String name, int age, char gender) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public User(String name, String city, boolean isActive) {
		
		this.name = name;
		this.city = city;
		this.isActive = isActive;
	}

	public static void main(String[] args) {
	
		User u1 = new User("Tom",34);
		System.out.println(u1.name+""+u1.age);

		User u2 = new User("Taru",34,"LA");
		System.out.println(u2.name+""+u2.age+""+u2.city);
		
		User u3 = new User("aru",34,'f');
		System.out.println(u3.name+""+u3.age+""+u3.gender);
		
		User u4 = new User("Sandhya", "Pune", true);
		System.out.println(u4.name+""+u4.city+""+u4.isActive);
		
		//Testing t1 = new Testing();// this is not possible because we created the Testing constructor as private in another class(Testing)
		
		Testing.getAppNumber();
	}



	
	
}
