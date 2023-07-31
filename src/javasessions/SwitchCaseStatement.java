package javasessions;

public class SwitchCaseStatement {

	public static void main(String[] args) {
	
		
		//it go to the key at the moment it found one ,it will not check every other case
		String browser="safari";
		
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		default:
			System.out.println("pls pass the correct browser ..");
			break;
		}
//
		
		//Switch case without break statement,here when you find one case matching then it goes to there
		// and execute and continue next cases if no break present.
		//break cannot be used other than switch/loops,cannot use in if else block
		//
		String browser1="safari";
		switch (browser1) {
		case "chrome":
			System.out.println("launch chrome");
			
		case "firefox":
			System.out.println("launch firefox");
			
		case "safari":
			System.out.println("launch safari");
			
		case "edge":
			System.out.println("launch edge");
			
		default:
			System.out.println("pls pass the correct browser ..");
		
		}
		
				//switch case is allowed only for int,short,byte,char(convertible ints are allowed) and strings
		char c='a';
		switch (c) {
		case 'a':
			System.out.println("switch case is allowed only for int,short,byte,char and string");
			break;

		default:
			break;
		}
	}

}
