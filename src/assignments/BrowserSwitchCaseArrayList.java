package assignments;

import java.util.ArrayList;

import classandobjects.Browser;

public class BrowserSwitchCaseArrayList {

	// WAF
	// getEmployeeDevices(String empName)
	// you have to collect all the devices and return
	// return ArrayList<String>

//function will always single entity(here we are returning single emp devices.

	public ArrayList<String> getEmployeeDevices(String empName) {
		
		System.out.println("getting the device list for Employee" + empName);
		empName = empName.trim().toLowerCase();
		ArrayList<String> deviceList = new ArrayList<String>();
		
		switch (empName.toLowerCase().trim()) {
		case "vinayak":
			deviceList.add("iPhone 14");
			deviceList.add("MacBook Pro");
			deviceList.add("Airtel Sim");
			deviceList.add("Apple Mouse");
			
			break;
		case "waseem":
			deviceList.add("samsung");
			deviceList.add("HP Mouse");
			
			break;
		case "prashant":
			deviceList.add("MacBook Air");
			deviceList.add("Apple Mouse");
			deviceList.add("Apple Keyboard");
			
			break;
		default:
			System.out.println("pls pass the right employee name..emp not found");
			break;
		}
		return deviceList;
		
	}

	public static void main(String[] args) {
		Browser obj = new Browser();
		ArrayList<String> devList = obj.getEmployeeDevices("Waseem");

		System.out.println(devList);
		System.out.println("total number of devices" + devList.size());

	}

}
