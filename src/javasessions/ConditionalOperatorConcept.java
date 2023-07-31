package javasessions;

public class ConditionalOperatorConcept {

	public static void main(String[] args) {
		
		
		//System.out.println(10==20);
		
		int a= 10;
		int b= 20;
		
		if (a==b) {
			System.out.println("a & b are equal");
		}
		else
		{
			System.out.println("a & b are not equal");
		}
		if(a>=b) {
			System.out.println("a is eq or greater than b");
		}
		
		else {
			System.out.println("a is not eq to b");
		}
		
		if (a!=b) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		if(true) {
			
			System.out.println("hi");
		}
		//dead code -this never run because,here you delibrate making the condition true,java will never reach dead code
		//not a right way of writing the code
		else {
			System.out.println("bye");
		}
		
		
		
		//here you create flag boolean,based on the flag it goes to if or else block
		boolean flag=false;
		
		if(flag) {
			System.out.println("hello");
		}
		else {
			System.out.println("bye");
		}
		
		double d1=12.22;
		double d2=12.34;
		
		if(d1==d2) {
			System.out.println("d1 and d2 are not equal");
		}
		else {
			System.out.println("d1,d2 are not equal");
		}
		
		// == comparision is applicable for primitivie data types only
		
		char c1='a';
		char c2='a';
		if(c1== c2) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		
	// nested if-else
		int marks=60;
		if(marks<=100) {
			if(marks>=90) {
				if(marks==100) {
					System.out.println("eligible for scholarship");
				}
				else {
					System.out.println("not eligible for scholarship");
				}
			System.out.println("A grade");
		}
		else {
			System.out.println("B grade");
			//you can use if inside else block also based on the requirement.
			//else is possible only when if condition exist.
			if(marks>=70) {
				System.out.println("you got 10%discount on fee");
				
			}else {
				System.out.println(" your not eligible for discount");
			}
		}
			
	}
		else {
			System.out.println("incorrect marks");
		}
		//if-if-if-if 	
//		String browser="edge";
//		
//		if(browser.equals("chrome")){
//			System.out.println("launch chrome");
//		}
//		if(browser.equals("safari")){
//			System.out.println("launch safari ");
//	}
//		if(browser.equals("edge")){
//			System.out.println("launch edge ");
//	}
//		else {
//			System.out.println("pls pass the correct browser ...");
//		}
	
	//if else-if(below approach slight better than above)
		
		String browser="chrome";
		if(browser.equals("chrome")){
			System.out.println("launch chrome");
		}
		else if (browser.equals("firefox")){
			System.out.println("launch firefox");
		}
		else if (browser.equals("safari")){
			System.out.println("launch safari");
		}
		else if (browser.equals("edge")){
			System.out.println("launch edge");
		}
		else {
			System.out.println("pls pass the correct browser ...");
		}
		
		

	

}}
