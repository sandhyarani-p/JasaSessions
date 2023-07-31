package assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListReverse {

	public static void main(String[] args) {
		//  Reverse this array List:

		//ArrayList<String> studentNames = new ArrayList<String>();


		
		ArrayList<String> studentNames = new ArrayList<String>();
		 
		studentNames.add("Varun");
		
		 studentNames.add("Reena");
		
		 studentNames.add("Naveen");
		
		 studentNames.add("Robin");
		
		 studentNames.add("Peter");
		 
		 Collections.reverse(studentNames);
		 
		 System.out.println(studentNames);
	//empty the list
		 studentNames.clear();
		 System.out.println(studentNames);

	}

}
