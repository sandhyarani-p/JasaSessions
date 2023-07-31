package staticconcept;

import classandobjects.Browser;

public class A {

	public static void main(String[] args) {
	System.out.println("A main");
	
	//B.main(args);
	
	
	// we can call other package main methods as well,by class name.main()
	Browser.main(args);
	
	//Infinite calling by calling A then B and repeats for sometime and terminate once stack is full

	}

}
