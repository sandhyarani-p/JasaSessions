package javasessions;

import java.util.Arrays;

public class ArrayTraverse {

	public static void main(String[] args) {
		int k[]= new int[4];

		int k1[] = new int[5];
		k[0]=3;
		k[1]=2;
		k[2]=4;
		k[3]=5;
		
		
		//without for loop
		//System.out.println(Arrays.toString(k));
		
		//to iterate via for loop//we can use the logic inside the for loop 
		
		for (int i = 0; i < k.length; i++) {
			System.out.println(k[i]);
			
			if(k[i]== 4) {
				System.out.println("hello");
				break;
			}
			
		}
		
		//for each
		for (int e : k) {
			
			System.out.println(e);
			if(e==4) {
				System.out.println("bye");
			break;
		}
	}
		
		short s[] = new short[4];
		
		s[0]=20;
		s[1]=30;
		s[2]=40;
		s[3]=50;
		
		
		for (short e : s) {
			
			System.out.println(e);
			
		}
		
		String browser[] = new String[4];
		browser[0] = "chrome";
		browser[1] = "firefox";
		browser[2] = "safari";
		browser[3] = "edge";
		//browser[4] = "chrome";
		
		System.out.println(Arrays.toString(browser));
		
		for(String e: browser) {
		 System.out.println(e);
			if(e.equals("safari")) {
				System.out.println("launch safari");
				break;
			}
		}

}}
