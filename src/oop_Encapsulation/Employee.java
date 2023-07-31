package oop_Encapsulation;

public class Employee {

	// declare as private to give data security
	//getter and setter is not mandatory in encapsulation
	// we can have getter method without setter method
	private String name;
	private int age;
	private double salary;
	private int amount;
	
	
	private void calculateShareAmount(int fee) {
		
		int i=10;
		// fee=20;
		amount=i+fee;
		
	}
	
	public int getAmount(int fee) {
		calculateShareAmount(fee);
		return amount;
	}

//public getter and setter methods
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
