package assignment_inheritance;

public class HospitalTest {

	public static void main(String[] args) {
		
		Hospital hsp =new Hospital();
		hsp.dentalservice();
		hsp.entservice();
		hsp.gynoservice();
		
		
		//child class object referring by parent referrence variabl--top casting/run time polymorphism
		
		Hospital h1=new Apollo();
		h1.dentalservice();
		h1.entservice();
		//with the help of h1 only overriden methods from hospital class is accessible
		//h1.appolobilling is not accessible because its ref type check failed.
		//meaning with the h1 ref variable its not possible to access its child class methods.
		
		
		//down casting ?
		Max m=(Max) new Hospital();
		m.dentalservice();//here we get class cast exception at the run time,as down casting is nt allowed in java
		
		
		
		
		

	}

}
