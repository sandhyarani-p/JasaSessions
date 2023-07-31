package assignments_constructor;

public class Persons {

//	
//	Questions:
//
//		What is the purpose of a constructor in Java?
//- used to construct the object.to initialise instance variables using this keyword.
	//to avoid unnecessary object creation
//		How does a constructor differ from a regular method in Java?
//constructor name should be same as Class name,no return type
//		Can a Java class have multiple constructors? If so, how are they differentiated?
//different with the number of parameters,sequence of parameter
//		What happens if a constructor is not defined in a Java class?
//default constructor will be called
//		Can a constructor call other methods or constructors within the same class?
	//yes it can call methods but not a good practice
	
	String name;
	int age;
	char gender ;
	double height;

	public Persons(String name, int age, char gender, double height) {
	
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		test();
		
	}



	
	public void test() {
		System.out.println("test method");
	}
	
	
	public static void main(String[] args) {
		
		Persons p = new Persons("sandhya", 33, 'F', 5.1);
		System.out.println(p.name + p.age+" "+p.gender+" "+p.height);
		
		Persons p1 = new Persons("Radha",30, 'F',5.3);
		System.out.println(p1.name + p1.age+" "+p1.gender+" "+p1.height);
	}

}
