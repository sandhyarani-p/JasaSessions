package javasessions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListRemoveConcept {

	public static void main(String[] args) {
		
		
		ArrayList<String> empName = new ArrayList<String>();
		
		empName.add("sandhya");
		empName.add("Yuktha");
		empName.add("Kushi");
		empName.add("Ramya");
		empName.add("mamatha");
		empName.add(null);
		empName.add(1, "Deepak");
		System.out.println(empName.contains("sandhya"));
		//empName.add(null);
		
		System.out.println(empName);
		
		empName.remove(6);
		System.out.println(empName);
		
		Collections.reverse(empName);
		System.out.println(empName);
		
		for(String e: empName) {
			
			System.out.println(e);
			if(e.equals("Kushi")) {
				System.out.println("Hello");
				break;
			}
		}
//		
//		System.out.println(empName.get(1));
//		
//		empName.add(5, "Automation");
//		
//		System.out.println(empName);
	}

}
