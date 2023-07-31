package assignments;

import java.util.Arrays;

public class EmpDevicesStaticArray {

			//WAF
			//getEmployeeDevices(String empName)
			//you have to collect all the devices  and return
			//return Array
	
	public String[] getEmployeeDevices(String empName) {
		
		//String vinayak[]= {"iPhone 14","MacBook Pro","Airtel Sim","Apple Mouse"};
		//String waseem[]= {"samsung","MacBook Pro","Apple Mouse"};
		//String prashant[]= {"iPhone ","Airtel Sim"};
		String sub[] = new String[3];
		
	String	empName1=empName.trim().toLowerCase();
	
		if(empName1.equals("prashant")) {
			//System.out.println(Arrays.toString(prashant));
			sub[0]="iPhone 14";
			sub[1]="MacBook Pro";
			sub[2]="Airtel sim";
		}
		else if (empName1.equals("waseem")) {
			sub[0]="iPhone 14";
			sub[1]="iPhone 17";
			//sub[2]="iPhone 14";
			
			
			
			//System.out.println(Arrays.toString(waseem));
			
		}
		else if  (empName1.equals("vinayak")) {
			//System.out.println(Arrays.toString(vinayak));
			sub[0]="iPhone 14";
			sub[1]="iPhone 14";
			//sub[2]="iPhone 14";
			
		}
		else {
			System.out.println("pls pass the right emp name ..empNameis not found");
		}
		return sub;
	}
	
	public static void main(String[] args) {
		
		EmpDevicesStaticArray emplist = new EmpDevicesStaticArray();
		
		String[] sub1=emplist.getEmployeeDevices("prashant ");
		System.out.println(Arrays.toString(sub1));
		//System.out.println((sub1.length));

	}

}
