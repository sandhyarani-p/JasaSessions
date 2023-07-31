package assignments_string;

public class PrintOnlyNumbers {

	public static void main(String[] args) {
		
		String s = "your transaction id is: 12345 and reference id is 34567";
		
		String s1= s.replaceAll("\\D+", "");//meaning replace all digital values occurence by empty string
		System.out.println(s1);
		
		//		String s = "helloThisIsA1234Sample";
		//		s = s.replaceAll("\\D+","");
//		System.out.println(s);

		
		//second method
//		String s11 = "helloThisIsA1234Sample";
//		int value = Integer.parseInt(s11.replaceAll("[^0-9]", ""));
//		
//		System.out.println(value);
		
	}

}
