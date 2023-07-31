package assignments;

public class Loops {

	public static void main(String[] args) {
//		1. WAP to print following output:
//
//			 
//
//			I am Batman﻿
//
//			I am Batman﻿
//
//			I am Batman﻿
//
//			I am Batman
//
//			I am Batman

		String a= "I am Batman";
		
		for (int i = 1; i < 6; i++) {
			
			System.out.println(a);
			
			
		}
		

		//String b= "I am Batman";
		
		for (int i = 1; i < 10 ; i++) {
			
			System.out.println(" I am Batman"+i);
			
			
		}
		
		//WAP to print 10 to 1 using for, while and do-while loop
		
		//while
		System.out.println("************ While loop*********");
		int i1=10;
		
		while(i1>=1) {
			System.out.println(i1);
			i1--;
		}
		
		System.out.println("************ For loop*********");
		//for loop
		
		for(int k=10;k>=1;k--) {
			
			System.out.println(k);
		}
		
		//Write a program in Java to print "Hello World" ten times using while loop
		
		String b1="Hello World";
		
		int j=1;
		
		while(j<=10) {
			System.out.println(b1);
			j++;
			
			
		}
		
	}

}
