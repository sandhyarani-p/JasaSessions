package assignments_string;

import exceptionHandling.FrameworkException;

public class ReverseName {

	public static String reverseName(String str) {
		if (str == null) {

			System.out.println("given string is null ");
			throw new FrameworkException("String can not be null");
		}

		if (str.isBlank()) {

			System.out.println("given string is empty ");
			throw new FrameworkException("String can not be empty");
		}
		
		if(str.length()==0) {
			
			System.out.println("given string is length is zero ");
			throw new FrameworkException("String can not have zero length");
		}

		String rev = "";

		int len = str.length();
		System.out.println(len);

		for (int i = len - 1; i > 0; i--) {

			rev = rev + str.charAt(i);
		}

		return rev;

	}

	public static void main(String[] args) {
		String rev1 = reverseName("sandhya");
		System.out.println(rev1);
		System.out.println(reverseName("sandhya"));

	}

}
