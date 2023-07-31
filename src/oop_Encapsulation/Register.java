package oop_Encapsulation;

public class Register {

	//POJO class-plain old java objects
	//POJO class can not be the child of any class
	//hiding the data members of the class by making private 
	//Private variables +public constructor make the encapsulation
	//Private variables+public getter/setter--encapsulation
	//private variables+public getter setter+constructor--encapsulation
	//accessing private methods via public method-- encapsulation
	private String name;
	private int age;
	private long phonenumber;
	private String city;
	private boolean isPermanent;
	
	//constructor is to avoid unnecessary objects
	public Register(String name, int age, long phonenumber, String city, boolean isPermanent) {
		
		this.name = name;
		this.age = age;
		this.phonenumber = phonenumber;
		this.city = city;
		this.isPermanent = isPermanent;
	}

	
	public Register(String name, long phonenumber) {
		
		this.name = name;
		this.phonenumber = phonenumber;
	}


	//getter and setter always public
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




	public long getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public boolean isPermanent() {
		return isPermanent;
	}


	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}
	
	
	
	
	
}
