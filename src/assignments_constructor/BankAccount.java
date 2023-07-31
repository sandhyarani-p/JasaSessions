package assignments_constructor;

public class BankAccount {

	private String accountnumber;
	private double balance;
	private String Owner;


	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getOwner() {
		return Owner;
	}

	public void setOwner(String owner) {
		Owner = owner;
	}

	public double deposit(double d) {

		balance = balance + d;
		return balance;
	}

	public double withdraw(double d) {

		balance = balance - d;

		return balance;
	}
	
	public  void printStatement() {
		
		System.out.println("account number is:"+accountnumber.equals(getAccountnumber()));
		System.out.println("User balance is:"+ balance);
		System.out.println("user is:"+Owner.equals(getOwner()));
		
	}

	public static void main(String[] args) {

		BankAccount ba = new BankAccount();
		
		ba.setAccountnumber("2323232332");
		ba.setBalance(5000);
		ba.setOwner("Reena");
		ba.printStatement();
		double newbalance = ba.withdraw(100);
		double newbalance_dep = ba.deposit(200);
		
		System.out.println(newbalance);
		System.out.println(newbalance_dep);

	}

}
