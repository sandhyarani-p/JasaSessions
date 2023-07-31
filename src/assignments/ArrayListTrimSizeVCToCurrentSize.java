package assignments;

import java.util.ArrayList;

public class ArrayListTrimSizeVCToCurrentSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> colour = new ArrayList<String>(10);

		colour.add("Red");
		colour.add("Green");
		colour.add("Yellow");
		colour.add("Brown");
		colour.add("Yellow");
		
		colour.trimToSize();
		
		System.out.println(colour.size());
		
		//PC=5
		//VC=5

	}

}
