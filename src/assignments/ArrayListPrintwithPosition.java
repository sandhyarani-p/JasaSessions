package assignments;

import java.util.ArrayList;

public class ArrayListPrintwithPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> colour = new ArrayList<>();
		colour.add("Red");
		colour.add("Green");
		colour.add("Yellow");
		colour.add("Brown");
		colour.add("Pink");
		
		for(int i=0; i<colour.size();i++) {
			
			System.out.println(colour.get(i)+ " "+"is at index"+ " "+i);
		}
		
		for(int j=0;j<colour.size();j++) {
			
			if(colour.get(j).equals("Yellow")) {
				
				System.out.println("Found the colour"+ colour.get(j));
				break;
			}
		}
		
	
	}

}
