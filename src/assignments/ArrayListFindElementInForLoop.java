package assignments;

import java.util.ArrayList;

public class ArrayListFindElementInForLoop {

	public static void main(String[] args) {
		//Write a Java program to search an element in an array list using for loop. Once we find that element, break the loop.

		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		ar.add(60);
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			if(ar.get(i).equals(40)) {
			
				System.out.println(ar.get(i));
				break;
				
		}
		
	}
		
		for(Integer e: ar) {
			System.out.println(e);
		}

}
}