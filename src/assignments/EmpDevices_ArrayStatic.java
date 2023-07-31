package assignments;

import java.util.Arrays;

public class EmpDevices_ArrayStatic {
	//WAF
	//getEmployeeDevices(String empName)
	//you have to collect all the devices  and return
	//return Array
	
	public String[] getEmployeeDevices(String empName) {
		String empName1=empName.trim().toLowerCase();
		
		String Empdevice[] = new String[3];
		
		if(empName1.equals("sandhya")) {
			
			Empdevice[0]="i phone";
			Empdevice[1]="Macbook";
			Empdevice[2]="Airtrl sim";
		}
		else if (empName1.equals("raani")) {
			
			Empdevice[0]="Mouse";
			Empdevice[1]="HP laptop";
			
		}
		else if (empName1.equals("radha")) {
			
			Empdevice[0]="Mobile noikia";
			Empdevice[1]="Macbook";
			Empdevice[2]="Idea sim";
		}
		else {
			System.out.println("emp Name is not found..pls pass the right emp name");
		}
		return Empdevice;
	}
	
	public static void main(String[] args) {

		EmpDevices_ArrayStatic e1 = new EmpDevices_ArrayStatic();
		String[] edev = e1.getEmployeeDevices(" Radha ");

		System.out.println(Arrays.toString(edev));

	}

}
