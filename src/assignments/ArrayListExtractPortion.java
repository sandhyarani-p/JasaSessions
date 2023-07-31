package assignments;

import java.util.ArrayList;

public class ArrayListExtractPortion {

	public static void main(String[] args) {
		// Java program to extract a portion of an array list.
		
		ArrayList<String> colour = new ArrayList<String>();
		
		colour.add("Red");
		colour.add("Green");
		colour.add("Yellow");
		colour.add("Brown");
		colour.add("Yellow");
		
		
		ArrayList partialArray = new ArrayList<>(colour.subList(1, 3));
		//System.out.println(colour.subList(1, 3));
		System.out.println(partialArray);

	}

}
