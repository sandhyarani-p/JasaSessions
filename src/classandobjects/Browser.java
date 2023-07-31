package classandobjects;

import java.util.ArrayList;

public class Browser {

	
			//WAF
			//getEmployeeDevices(String empName)
			//you have to collect all the devices  and return
			//return ArrayList<String>
	
	//function will always single entity(here we are returning single emp devices.
	
	public ArrayList<String> getEmployeeDevices(String empName) {
		System.out.println("getting the device list for Employee"+empName);
		empName = empName.trim().toLowerCase();
		ArrayList<String> deviceList = new ArrayList<String>();
		if(empName.equals("vinayak")) {
			deviceList.add("iPhone 14");
			deviceList.add("MacBook Pro");
			deviceList.add("Airtel Sim");
			deviceList.add("Apple Mouse");
			
		}
		else if(empName.equals("waseem")){
			deviceList.add("samsung");
			deviceList.add("HP Mouse");
		
		}
		else if(empName.equals("prashant")){
			deviceList.add("MacBook Air");
			deviceList.add("Apple Mouse");
			deviceList.add("Apple Keyboard");
		}
		else {
			System.out.println("pls pass the right employee name..emp not found");
		}
		return deviceList;
		
	}
	public static void main(String[] args) {
		Browser obj = new Browser();
		ArrayList<String> devList=obj.getEmployeeDevices("Waseem");
		
		System.out.println(devList);
		System.out.println("total number of devices"+ devList.size());

	}

}
