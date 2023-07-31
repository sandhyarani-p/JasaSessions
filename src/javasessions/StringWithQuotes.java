package javasessions;

public class StringWithQuotes {

	public static void main(String[] args) {
	
		
		String str = "I love Java";
		
		// to be print java like "java"
		
		String st = "I love \"java \" and selenium";
		
		System.out.println(st);
		
		String username ="admin";
		String password = "admin123";
		
		System.out.println("https://"+username+" " + password +"abc.com");
		
		String  userName ="sandhya";
		String xpath = "//a[text()= '"+userName+"']";
		
		System.out.println(xpath);
		
		//a[text()="sandhya"]-->use escape character->\"
		
		String  userName1 ="sandhya";
		String xpath1 = "//a[text()= \" "+userName1+"\"]";
		
		System.out.println(xpath1);
		

	}

}
