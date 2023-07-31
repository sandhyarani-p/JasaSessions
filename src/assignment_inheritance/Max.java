package assignment_inheritance;

public class Max extends Hospital{
	
	@Override
	public void dentalservice() {
		System.out.println("Max Hospital dental service");
	}
	
	@Override
	public void gynoservice() {
		System.out.println("Max Hospital gyno service");
	}
	
	public void maxBilling() {
		System.out.println("maxbilling system");
	}
}
