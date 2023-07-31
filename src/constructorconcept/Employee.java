package constructorconcept;

public class Employee {

	String Name;
	int age;
	String city;
	// Constructor: Construct the object
	// 1.name should be same as class name
	// 2.can not return anything/no void
	// 3.can pass parameters to constructor , constructor overloading is possible
	// 4.how can we call constructor..we need to create object of the class and
	// respective constructor will be called
	
	//on what basis we create constructor-based on the PO/business acceptence criteria

	public Employee() {// default /0 parameter
		System.out.println("0 parameter constructor");
	}

	public Employee (String Name, int age) {
		this.Name=Name;
		this.age=age;
	}

	public Employee(int a, String b) {
		System.out.println("2 parameter constructor");
	}

	public Employee(String a, int b,String c) {

	}

	public static void main(String[] args) {
		// this is not the right way,so we try to avoid create more objects and
		// initialise instead we go for constructor
//		Employee e1 = new Employee();
//		e1.Name="sandhya";
//		e1.age=35;
//		e1.city="Bangalore";
//		
//		Employee e2 = new Employee();
//		e2.Name="Radha";
//		e1.age=30;
//		e1.city="NY";
//		
//		Employee e3 = new Employee();
//		e3.Name="Tom";
//		e3.age=31;
//		e3.city="Pune";

		Employee e1 = new Employee();

		Employee e2 = new Employee("Shan",40);
		System.out.println(e2.Name+""+e2.age);

	}

}
