package assignment_inheritance;

public class Apollo extends Hospital {

	@Override
	public void dentalservice() {
		System.out.println("Apollo Hospital dental service");
	}
	
	@Override
	public void gynoservice() {
		System.out.println("Apollo Hospital gyno service");
	}
	
	public void apolloBilling() {
		System.out.println("maxbilling system");
	}
}
