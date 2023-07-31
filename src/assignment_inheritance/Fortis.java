package assignment_inheritance;

public class Fortis extends Hospital {
	
	public void dentalservice() {
		System.out.println("Fortis Hospital dental service");
	}

	
	@Override
	public void gynoservice() {
		System.out.println("Fortis Hospital gyno service");
	}
	
	public void fortisBilling() {
		System.out.println("Fortis-billing system");
	}
}
