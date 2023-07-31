package assignments;

import java.util.ArrayList;

public class AddColoursArrayList {

	public static void main(String[] args) {
		// Write a Java program to create a new array list,

		//--add some colors (string) 
		//---and print out the colorslist.
		
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("Red");
		ar.add("Green");
		ar.add("Orange");
		ar.add("Blue");
		ar.add("Yellow");
		System.out.println(ar);
		
		//Write a Java program to retrieve an element at a specified index from a given array list.
		
		System.out.println(ar.get(2));
		
		//Write a Java program to remove the third element from an array list. 
		
		System.out.println(ar.remove(3));
		System.out.println(ar);
		


	}

}
