package assignments_string;

public class StringEquality {
//Write a program to check two different strings equality.
	public static void main(String[] args) {
		String s = "Java";//creates in string constant pool
		String s1= "Java";//ref the same   string constant pool.it will not create new value
		
		System.out.println(s.equals(s1));//equals is used to check the content
		
		
		System.out.println(s == s1);
		
		String a = new String("Java1");// this creates an object a
		String a1 = new String("Java1");//this again creates another object with a1,here 2 reference are not equal.
		
		System.out.println(a==a1);//== is used to check the reference 
		System.out.println(a.equals(a1));//this checks the content

	}

}
