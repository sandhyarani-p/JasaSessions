package assignments_string;

public class ThirdE {

	public static void main(String[] args) {
		String s=  "Welcome to Naveen Automation Labs !";
		
		System.out.println(s.indexOf("e"));//first occurence
		//System.out.println(s.indexOf("e", 2));//
		System.out.println(s.indexOf("e", s.indexOf("e")+1));
		System.out.println(s.indexOf("e", s.indexOf("e", s.indexOf("e")+1)+1));

	}

}
