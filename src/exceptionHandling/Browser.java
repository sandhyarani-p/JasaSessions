package exceptionHandling;

public class Browser {

	
	public static void main(String[] arg) {
		
		
		String name="chrome1";
		
		if(name.equals("chrome")) {
			
			System.out.println("launch chrome");
		}
		
		else{System.out.println("browser not found");
		throw new FrameworkException("Browser not found");
	}
		System.out.println("enter the url");
}
}