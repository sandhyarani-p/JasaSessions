package contructorchaining;

public class Employee {

	String name;
	int age;
	double salary;

	// to call another constructor from constructor ,we can use this
	// keyword--constructor chaining

	public Employee() {
		this("Kapil", 20);

	}

	public Employee(String name, int age) {
		this("Kapil", 20, 90.0);
		this.name = "Mitaj";
		this.age = 35;

	}

	public Employee(String name, int age, double salary) {

		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public static void main(String[] args) {

		Employee e = new Employee();
		System.out.println(e.name + e.age + e.salary);

	}

}
