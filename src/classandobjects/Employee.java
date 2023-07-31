package classandobjects;

public class Employee {

	// Class- category,BluePrint,HumanCategory
	// Object-physical entuty created from class(category)
	// Every Object is having its own properties.
	
	// class/Global  variables

	String name;
	int age;
	double salary;
	String city;
	
	public static void main(String[] args) {
		
		int a=10; //local variable
		
		//create object of the class:using new keyword
		//object will have only class variables not the local variables
		Employee obj = new Employee();
		
		//Employee- class Name
		//obj--Object ref name
		//new --is keyword to create object
		//new Employee()-->Object
		
		//as soon object created.class variables are given to object
		
		obj.name="Tom";
		obj.age=20;
		obj.salary=12.33;
		obj.city="LA";
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		Employee obj1 = new Employee();
		
		System.out.println(obj1.name);//you get null because obj1 is not associated with any value,so default values will be printed
		System.out.println(obj1.age);
		System.out.println(obj1.salary);
		System.out.println(obj1.city);
		
		
		
		
	
		

	}

}
