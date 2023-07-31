package assignments_string;

public class RemoveAllSpace {

	public static void main(String[] args) {

		// Remove all  spaces in a String . 

		//For example  : “         Hello      Everyone       “ .     Expected result: “HelloEveryone”.
		String k = "  hello everyone  ";

		System.out.println(k.trim());
		// this will trim starting and ending spaces

		System.out.println(k.replaceAll(" ", ""));//this will remove all the spaces in a string
		System.out.println(k.replace(" ", ""));//this will remove all the spaces in a string
	

	}

}
