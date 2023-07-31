package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySortAsendingDesce {

	public static void main(String[] args) {
		
		ArrayList<Integer>  number= new ArrayList<Integer>();
		
		number.add(3);
		number.add(5);
		number.add(7);
		number.add(1);
		
		
		Collections.sort(number);
		
		System.out.println("Ascending order"+number);
		Collections.reverse(number);
		System.out.println("Descending order"+number);
		

	}

}
