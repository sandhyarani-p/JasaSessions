package classandobjects;

public class EmployeeTest {

	
	
	
	// Acceptence criteria
	//i want to calculate the score/marks of employee
	//create a function :getEmployee marks
	//input parameter: empName (String)
	//return:marks(int)
	
	public int getEmployeeMarks(String empName) {
		
		System.out.println("Getting employee marks"+ empName);
		int marks =-1;
		if(empName.equals("Neela")) {
			marks=90;
		}
		else if(empName.equals("Mitaz")) {
			marks=95;
		}
		else if(empName.equals("Ravi")) {
			marks=80;
		}
		else if(empName.equals("Naveen")) {
			marks=10;
		}
		else {
			System.out.println("emp name is not found" +empName);
		}
		return marks;
	}
	
	
	public static void main(String[] args) {
	
		EmployeeTest  e1 = new EmployeeTest();
		int m1 = e1.getEmployeeMarks("tom");
		System.out.println(m1);
		
		if(m1>=0) {
			System.out.println("Print the marks sheet");
		}

	}

}
