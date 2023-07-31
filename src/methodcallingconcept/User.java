package methodcallingconcept;

public class User {

	
	public void sendEmail() {
		System.out.println("sending email");
	}
	
	public void getName(Employee e1) {
		
		e1.m3();
	}
	
	public static void getEmail(User u) {//u=u1
		System.out.println("getting email");
		u.sendEmail();//calling non static method from static method using reference
		User.readEmail(u);
	}
	
	public static void readEmail(User u){
		System.out.println("reading email");
		u.sendEmail();
		u.test(20);
	}
	
	
	public void test(int i) {
		System.out.println(i);
	}
	public static void main(String[] args) {
		
		User u1= new User();
		
		User.getEmail(u1);//call by reference
		
		u1.test(10);//call by value
		
		//User u1= null;
		//User.getEmail(u1);//this gives null pointer exception
	}

}
