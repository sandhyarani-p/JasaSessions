package stringConcept;

import exceptionHandling.FrameworkException;

public class StringReverseConcept {

	public static String reverseString(String str) {
		//1.null check should be first check  in generic code
		if(str==null) {
			System.out.println("null values are not allowed");
			 throw new FrameworkException("String can not be null");
		}
		
		
		//blank check
		if(str.isBlank()) {
			
			System.out.println("blank values are not allowed");
			 throw new FrameworkException("String can not be blank");
		}
		
		
		int len=str.length();
		System.out.println(str+"lenth is :"+ len);
		
		if(len==0) {
			System.out.println("str length is zero");
			return "str length is zero";
		//	return "-1";
		}
		
		//length check
		if(len==1) {
			return str;
		}
		
		
		
		String rev="";
		for(int i=len-1;i>=0;i--) {
			
			rev= rev+str.charAt(i);
			
		}
		return rev;
		
	}
	
	
	
	public static void main(String[] args) {
		// Selenium--muineleS
		//T-T
		//123-321
		//null--null is not a string 
		
		
		//using reverse function
//		String s="Selenium";
//		StringBuilder sb = new StringBuilder("Selenium");
//		System.out.println(	sb.reverse());
		
		
		String rev1=reverseString("MADAM");
		if(rev1.equals("MADAM")) {
			
			System.out.println("palindrome ");
		}
		
		//testcases
		//System.out.println(reverseString(" "));//reverse of blank space is blank space
	//	System.out.println(reverseString(""));
		System.out.println(reverseString("Selenium"));
		System.out.println(reverseString("Selenium test"));
		System.out.println(reverseString("123"));
		System.out.println(reverseString("T"));//for single char we no need to go to for loop inside 
	//	System.out.println(reverseString(null));//NPE
		
		

	}

}
