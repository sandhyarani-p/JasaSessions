package constructorconcept;

public class Person {

	String name;
	static String collegeName;
	//we should not create constructor with static variables
	//we always pass non static variables as parameter in constructor
	
	
	public Person(String name,String collegeName ) {
		
		this.name = name;
	//	Person.collegeName=collegeName;
		
	
	}
	
	public Person(String name) {
		this.name=name;
	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Sandhya","ABD");
		System.out.println(p1.name);
		System.out.println(p1.collegeName);
		
		Person p2 = new Person("Tom");
		System.out.println(Person.collegeName);
		
	}
	
	
	//
}
