package assignments_string;

public class StringPresent_not {

	static String str="Welcome null";
	
	public static void checkstring(String str) {
		
		if(str.indexOf("n")>0) {
			System.out.println(str.indexOf("N"));
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		checkstring(str);
	
	}

}
