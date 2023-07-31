package staticconcept;

public class Employee {

	
	String Name;//class or instance variable
	static int age;//static variable
	
	public void getEmail() {
		
		System.out.println("get Email method");
	}
	
	public  static void sendEmail() {
		
		System.out.println("Send Email method");
	}
	
	//overloaded static method
public  static void sendEmail(int a) {
		
		System.out.println("Send Email method");
	}
	public static void main(String[] args) {
		
		
		Employee e = new Employee();
		e.Name="Tom";
		
		//1.how to access static variables -->using class name
		Employee.age=30;
		
		//2.can access directly also using static variable name
		
		age=35;
		
		//can we access static var using object ref??it gives warning saying static fields need to access  using static way
		//e.age=30;
		System.out.println(Employee.age);
		
		System.out.println(e.Name);
		System.out.println(age);
		
		//to access non static method using object ref
		
		e.getEmail();
		
		//to access static methods
		//1.using class name
		Employee.sendEmail();
		//2.directly calling
		
		sendEmail();
		//3.can access using ref variable??
		//never access static variables/methods with object ref
	//	e.sendEmail();

	}

}
