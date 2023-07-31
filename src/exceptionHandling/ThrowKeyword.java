package exceptionHandling;

public class ThrowKeyword {

	
	//Throw keyword is used to deliberately throw exception(custom exception)
	public static void main(String[] args) {
	
		
		String browser=null;
		
		if(browser==null) {
			try {throw new Exception("NOBROWSEREXception");//custom exception
				
			} catch (Exception e) {
				System.out.println("browser not found...please pass the right browser");
				e.printStackTrace();
				
			}
		}

	}

}
