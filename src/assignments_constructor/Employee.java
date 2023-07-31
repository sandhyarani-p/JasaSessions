package assignments_constructor;

public class Employee {

	int id;
	String name;
	double salary;
	
	private void riasesalary() {
		int i=20;
		salary=i+salary;
		
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
		
	
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		riasesalary();
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
		
		
	}


	public static void main(String[] args) {
		
		
		Employee e = new Employee(11221, "Jame", 122.99);

		
		System.out.println(e.getId()+e.getName()+e.getSalary());
		//System.out.println(e.id+e.name+e.salary);

	}

}
