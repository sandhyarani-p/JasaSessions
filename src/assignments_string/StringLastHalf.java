package assignments_string;

public class StringLastHalf {

	public static void main(String[] args) {
		String s = "I love java oops and i am learning java prgs";
		System.out.println(s.indexOf("i"));
		System.out.println(s.substring(21));;
		
		System.out.println(s.subSequence(21, 35));//works same as in substring
		
		System.out.println(s.substring(21, 44));

	}

}
