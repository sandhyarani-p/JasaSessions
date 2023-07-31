package constructorconcept;



public class Customer {
	String name;
	String city;
	int custId;
	long phonenumber;
	//
	//Business logic/feature logic should be in function/method not in constructor
	// because we dont have the return in constructor
	public Customer(String name, String city, int custId, long phonenumber) {
		
		this.name = name;
		this.city = city;
		this.custId = custId;
		this.phonenumber = phonenumber;
	}
	
	public int getSalary(int totalCTC,int bonus) {
		
		return totalCTC+bonus;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
